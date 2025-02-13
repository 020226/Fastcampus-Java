package part3;

import com.google.gson.Gson;
import model3.Member;

public class GsontoJson {
  public static void main(String[] args) {
    Member mvo = new Member("홍길동", 30, "user1@test.com");
    // JSON -> { "name" : "홍길동", "age" : 30, "email" : "user1@test.com" }
    // 클래스를 사용하려면 객체를 생성해야 하고 객체 안에 메서드가 있다
    Gson gson = new Gson();
    // Object(Member) -> JSON
    String json = gson.toJson(mvo);
    System.out.println("json = " + json);
  }
}