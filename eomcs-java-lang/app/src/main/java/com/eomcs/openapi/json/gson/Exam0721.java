// JSON 문자열 --> 객체 : 다른 객체를 여러 개 포함하는 경우
package com.eomcs.openapi.json.gson;

import java.util.Map;
import com.google.gson.Gson;

public class Exam0721 {
  public static void main(String[] args) {

<<<<<<< HEAD
    String jsonStr = "{\"no\":100,\"manager\":\"{\\\"position\\\":\\\"대리\\\",\\\"fax\\\":\\\"02-1111-2222\\\",\\\"no\\\":101,\\\"name\\\":\\\"홍길동\\\",\\\"email\\\":\\\"hong@test.com\\\",\\\"registeredDate\\\":\\\"10월 5, 2021\\\"}\",\"title\":\"Hello\"}";

    Map<String,String> map = new Gson().fromJson(jsonStr, Map.class);
    // 100은 더블이니 String으로 x

    int v1 = Integer.parseInt(map.get("no"));// 여기가 스트링일 경우 100에 더블쿼테이션 생략 불가
=======
    String jsonStr = "{\"no\":\"100\",\"manager\":\"{\\\"position\\\":\\\"대리\\\",\\\"fax\\\":\\\"02-1111-2222\\\",\\\"no\\\":101,\\\"name\\\":\\\"홍길동\\\",\\\"email\\\":\\\"hong@test.com\\\",\\\"registeredDate\\\":\\\"10월 5, 2021\\\"}\",\"title\":\"Hello\"}";

    Map<String,String> map = new Gson().fromJson(jsonStr, Map.class);

    int v1 = Integer.parseInt(map.get("no"));
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    String v2 = map.get("title");
    String v3 = map.get("manager");

    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);

    Manager mgr = new Gson().fromJson(v3, Manager.class);
    System.out.println(mgr);
  }
}





