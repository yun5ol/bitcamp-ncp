// static nested class : 다른 멤버에 접근하기
package com.eomcs.oop.ex11.b;

class B {
<<<<<<< HEAD
  // 클래스(스태틱) 멤버
=======
  // 클래스 멤버
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
  static int v1;
  static void m1() {}

  // 인스턴스 멤버
  int v2;
  void m2() {}

  static void test() {
    B.v1 = 100;
    B.m1();

<<<<<<< HEAD
    // test() 메서드는 같은 멤버이기 때문에
=======
    // test() 메서드는 같은 멤버이기 때문에 
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    // 다음과 같이 클래스 이름을 생략할 수 있다.
    v1 = 100;
    m1();

<<<<<<< HEAD
    // 스태틱 멤버는 this라는 빌트인 변수가 없기 때문에
=======
    // 스태틱 멤버는 this라는 빌트인 변수가 없기 때문에 
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    // 인스턴스 멤버에 접근할 수 없다.
    //    v2 = 100; // 컴파일 오류!
    //    m2(); // 컴파일 오류!
  }
}

public class Exam0210 {
  public static void main(String[] args) {
    // 스태틱 멤버는 클래스명으로 접근 가능
    B.v1 = 100;
    B.m1();
    B.test();
  }
}
