// JSON 문자열 --> 객체 : 다른 객체를 여러 개 포함하는 경우
package com.eomcs.openapi.json.gson;

import java.lang.reflect.Type;
import java.util.Collection;
<<<<<<< HEAD
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
=======
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805

public class Exam0620 {
  public static void main(String[] args) {

<<<<<<< HEAD
    String jsonStr = "[{\"position\":\"대리\",\"fax\":\"02-1111-2222\",\"no\":101,\"name\":\"홍길동\",\"email\":\"hong@test.com\",\"registeredDate\":\"9월 16, 2021\"},"
        + "{\"major\":\"컴퓨터공학\",\"hourPay\":10000,\"no\":103,\"name\":\"안창호\",\"email\":\"ahn@test.com\",\"registeredDate\":\"9월 16, 2021\"}]";

    Type collectionType = TypeToken.getParameterized(Collection.class, Member.class).getType();
    Collection<Member> list = new Gson().fromJson(jsonStr, collectionType);
    // 객체별 자동 변환 불가 => 621
=======
    String jsonStr = "[{\"position\":\"대리\",\"fax\":\"02-1111-2222\",\"no\":101,\"name\":\"홍길동\",\"email\":\"hong@test.com\",\"registeredDate\":\"9월 16, 2021\"},{\"major\":\"컴퓨터공학\",\"hourPay\":10000,\"no\":103,\"name\":\"안창호\",\"email\":\"ahn@test.com\",\"registeredDate\":\"9월 16, 2021\"}]";

    Type collectionType = TypeToken.getParameterized(Collection.class, Member.class).getType();
    Collection<Member> list = new Gson().fromJson(jsonStr, collectionType);
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805

    for (Member m : list) {
      System.out.println(m);
    }
  }
}





