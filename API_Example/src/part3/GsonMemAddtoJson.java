package part3;

import com.google.gson.Gson;
import model3.Address;
import model3.Person;

// 중첩 구조 Gson 실습
public class GsonMemAddtoJson {
  public static void main(String[] args) {
    Address address = new Address("서울", "대한민국");
    Person member = new Person("홍길동", 30, "user1@test.com", address);

    // Person -> JSON
    Gson gson = new Gson();
    String json = gson.toJson(member);
    System.out.println("json = " + json);
  }
}
