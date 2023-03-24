// anonymous class : 클래스를 상속 받은 익명 클래스 정의
package com.eomcs.oop.ex11.e;

public class Exam0121 {

  // 클래스는 static과 non-static이 구분된다.
  static abstract class A {
    abstract void print();
  }

  public static void main(final String[] args) {
    // 2) 익명 클래스로 서브 클래스 만들기
    // => 인스턴스를 한 번 만 생성할 것이라면,
    //    로컬 클래스로 정의하는 것 보다 익명 클래스로 정의하는 것이 더 낫다.
    // => 특히 객체를 사용하려는 곳에 바로 익명 클래스를 정의하면
    //    읽기 쉽기 때문에 소스 코드를 유지보수에 더 좋다.
    //
    // 익명 클래스로 인터페이스 구현하기
    // 문법:
    // => 수퍼클래스 레퍼런스 = new 수퍼클래스() {};
<<<<<<< HEAD
    //    - 파라미터가 없으면 익명 클래스의 기본 생성자를 호출한다.
    //    - 파라미터가 있으면 수퍼 클래스의 생성자를 찾아 호출한다.
=======
    //    - 호출하는 생성자는 수퍼 클래스의 생성자이다.
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    //
    A obj2 = new A() {
      @Override
      void print() {
        System.out.println("Hello!");
      }
<<<<<<< HEAD
      // 익명 클래스를 만들었다는 것은,
      // 기존 메서드를 오버라이딩해서 쓰겠다는 것.
      // 메서드 추가가 무의미 하다

      void m() {
        System.out.println("이 추가 메서드는 어떻게 호출할까?");
      }
    };
    obj2.print();
    // obj2.m(); // obj2는 A타입인데, A에는 m()이 정의되어 있지 않다. => 컴파일 오류
=======
    };
    obj2.print();
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
  }
}
