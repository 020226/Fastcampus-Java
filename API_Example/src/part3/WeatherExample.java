package part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
  public static void main(String[] args) {
    String apiKey="";
    String city="Seoul";
    String urlString="https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

    try {
      URL url = new URL(urlString);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("GET");
      connection.setRequestProperty("Accept", "applicaton/json");

      int responseCode = connection.getResponseCode();
      if (responseCode==200) {
        // 스트림(Stream = 입력, 출력)의 연결
        // InputStreamReader을 통해 바이트스트림 -> Reader를 통해 한글 인코딩
        // `기본 스트림 연결`하여 날씨 정보를 읽어드림
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer(); // 읽어드린 문자열을 추가추가 붙임
        while ((inputLine = in.readLine())!=null) {
          content.append(inputLine);
        }
        in.close();
        System.out.println("content.toString() = " + content.toString());
        JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
        JsonObject mainData = weatherData.getAsJsonObject("main");
        double temp = mainData.get("temp").getAsDouble();
        System.out.println("temp = " + temp);
        connection.disconnect();
      } else {
        // 오류
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
