<<<<<<< HEAD
// anonymous class - 익명 클래스가 놓이는 장소: 리턴
=======
// anonymous class - 익명 클래스가 놓이는 장소: 파라미터
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
package com.eomcs.oop.ex11.e;

class My {
  static void m1() {
    System.out.println("오호라!!!!");
  }

  void m2() {
    System.out.println("와우~~~~!");
  }
}

public class Exam0450 {
  // 인터페이스의 경우 static으로 선언하지 않아도 스태틱 멤버에서 사용할 수 있다.
<<<<<<< HEAD
  interface A { // 파라미터 없고, 리턴타입 없는
    void print();
  }

  static A create0() {
    class X implements A {
      @Override
      public void print() {
        System.out.println("Hello0!");
=======
  interface A {
    void print();
  }

  static A create1() {
    class X implements A {
      @Override
      public void print() {
        System.out.println("Hello!");
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
      }
    }
    return new X();
  }

<<<<<<< HEAD
  // 익명 클래스 : 레퍼런스로 리턴
  static A create1() {
    A a = new A() {
      @Override
      public void print() {
        System.out.println("Hello1!");
      }
    };
    return a;
  }

  // return 자리에 정의 및 코드 삽입
=======
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
  static A create2() {
    return new A() {
      @Override
      public void print() {
        System.out.println("Hello2!");
      }
    };
  }

<<<<<<< HEAD

  // 람다 응용
=======
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
  static A create3() {
    return () -> System.out.println("Hello3!");
  }

<<<<<<< HEAD

  // 메서드 레퍼런스 활용 1
  static A create4() { //m1은 A인터페이스와 메서드 시그니처가 같아야 한다
    return My::m1; // static 이니 바깥 클래스명으로 접근
  }

  // 메서드 레퍼런스 활용 2
  static A create5() { //m2도 가능하지만, 인스턴스이니 객체 생성 후 객체 주소로 가능하다
=======
  static A create4() {
    return My::m1;
  }

  static A create5() {
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    return new My()::m2;
  }

  public static void main(String[] args) {
<<<<<<< HEAD
    A obj0 = create0();
    obj0.print();

=======
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    A obj1 = create1();
    obj1.print();

    A obj2 = create2();
    obj2.print();

<<<<<<< HEAD
    A obj3 = create3(); // 람다식은 익명클래스가 아닌 수퍼클래스의 함수로 .class에 존재함
=======
    A obj3 = create3();
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    obj3.print();

    A obj4 = create4();
    obj4.print();

    A obj5 = create5();
    obj5.print();
  }
}
