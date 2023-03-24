// String - String 인스터스에 있는 값을 비교하기 : equalsIgnoreCase()
package com.eomcs.basic.ex02;

public class Exam0121 {
  public static void main(String[] args) {

<<<<<<< HEAD
    String s1 = new String("Hello"); // new니깐 일단 주소(인스턴스) 달라
=======
    String s1 = new String("Hello");
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    String s2 = new String("HELLO");

    // equals()는 대소문자를 구분한다.
    System.out.println(s1.equals(s2));

    // 대소문자 구분없이 문자열을 비교하고 싶다면,
    System.out.println(s1.equalsIgnoreCase(s2));
  }
}


