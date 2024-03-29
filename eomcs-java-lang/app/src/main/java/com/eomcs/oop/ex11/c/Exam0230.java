// inner class : 바깥 클래스의 인스턴스 멤버 접근하기 II
package com.eomcs.oop.ex11.c;

class B3 {

  // 인스턴스 멤버
  int v1 = 10;

  class X {
    int v1 = 100;

    void test() {
      int v1 = 1000;

<<<<<<< HEAD
      System.out.printf("v1 = %d\n", v1); // 로컬 변수
      System.out.printf("this.v1 = %d\n", this.v1); // 인스턴스 변수 = 소속된 클래스(x클래스)의 this 변수다
      System.out.printf("B3.this.v1 = %d\n", B3.this.v1); // 바깥 객체의 인스턴스 변수
=======
      System.out.printf("v1 = %d\n", v1); // 로컬 변수 
      System.out.printf("this.v1 = %d\n", this.v1); // 인스턴스 변수 
      System.out.printf("B3.this.v1 = %d\n", B3.this.v1); // 바깥 객체의 인스턴스 변수 
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    }
  }
}

public class Exam0230 {

  public static void main(String[] args) {
    B3 outer = new B3();
    outer.v1 = 11;

<<<<<<< HEAD
    // inner class를 만들때 준 바깥 객체가 어떤거냐에 따라(outer, outer2), 바깥객체가 달라진다.
=======
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    B3.X x1 = outer.new X();
    x1.test();
    System.out.println("--------------------");

    B3.X x2 = outer.new X();
    x2.test();
    System.out.println("--------------------");

    B3 outer2 = new B3();
    outer2.v1 = 22;

    B3.X x3 = outer2.new X();
    x3.test();
    System.out.println("--------------------");
  }

}
