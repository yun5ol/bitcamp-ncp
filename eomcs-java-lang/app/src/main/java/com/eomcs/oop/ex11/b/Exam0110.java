// static nested class : 클래스 정의와 인스턴스 생성
package com.eomcs.oop.ex11.b;

class A {
<<<<<<< HEAD
  static class X { // 스태틱 중첩 클래스
=======
  static class X {
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805

  }
}

public class Exam0110 {

  public static void main(String[] args) {
<<<<<<< HEAD

    // 레퍼런스 선언
    A.X obj; // 클래스이름.중첩클래스이름

    // 인스턴스 생성
    obj = new A.X(); // 클래스이름.중첩클래스이름
=======
    // 레퍼런스 선언
    A.X obj;

    // 인스턴스 생성
    obj = new A.X();
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
  }

}
