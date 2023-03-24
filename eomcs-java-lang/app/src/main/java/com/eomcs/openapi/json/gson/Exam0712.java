<<<<<<< HEAD
// 맵객체 --> JSON 문자열
=======
// 맵객체 --> JSON 문자열 
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
package com.eomcs.openapi.json.gson;

import java.sql.Date;
import com.google.gson.Gson;

public class Exam0712 {
  public static void main(String[] args) {

    // 자바 기본 타입과 객체를 묶어서 JSON으로 내보내기
    Manager mgr = new Manager();
    mgr.setNo(101);
    mgr.setName("홍길동");
    mgr.setEmail("hong@test.com");
    mgr.setRegisteredDate(new Date(System.currentTimeMillis()));
    mgr.setPosition("대리");
    mgr.setFax("02-1111-2222");

<<<<<<< HEAD
    ManagerParam param = new ManagerParam(); // GSON은 필드가 없을 경우, 자동 세터/게터로 간주
=======
    ManagerParam param = new ManagerParam();
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    param.no = 100;
    param.title = "Hello";
    param.manager = mgr;

    String jsonStr = new Gson().toJson(param);

    System.out.println(jsonStr);
  }
}

