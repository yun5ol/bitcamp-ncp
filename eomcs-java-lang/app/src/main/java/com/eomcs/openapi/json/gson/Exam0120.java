// JSON 문자열 --> 객체 : JSON 문자열을 해석하여 객체를 생성하기
package com.eomcs.openapi.json.gson;

import com.google.gson.Gson;

public class Exam0120 {
  public static void main(String[] args) {

    // 1) JSON 문자열 준비
    String jsonStr = "{\"no\":100,\"name\":\"홍길동\",\"email\":\"hong@test.com\",\"password\":\"1111\","
        + "\"photo\":\"hong.gif\",\"tel\":\"010-2222-1111\",\"registeredDate\":\"1월 24, 2022\"}";

    // 2) JSON 처리 객체 준비
    Gson gson = new Gson();

    // 3) JSON 문자열을 가지고 객체 만들기
    Member m = gson.fromJson(jsonStr, Member.class); // static 변수 => 클래스 타입 정보
    // json문자열로 부터 member클래스 타입 정보를 위 준비된 문자열에 맞게 넣는다 "fromJson"이!
    System.out.println(m);
  }
}





