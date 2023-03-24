// JSON 문자열 --> 객체 : 컬렉션 다루기
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

public class Exam0322 {
  public static void main(String[] args) {

    String jsonStr = "[{\"no\":101,\"name\":\"홍길동\"},{\"no\":102,\"name\":\"임꺽정\"},{\"no\":103,\"name\":\"안창호\"}]";

    // Exam0321과 다른 방법으로 Type 객체를 얻기
<<<<<<< HEAD
    // # 0321 Type collectionType = new TypeToken<Collection<Member>>(){}.getType();
=======
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    Type collectionType = TypeToken.getParameterized(Collection.class, Member.class).getType();

    Collection<Member> list = new Gson().fromJson(jsonStr, collectionType);

    for (Member m : list) {
      System.out.println(m);
    }
  }
}





