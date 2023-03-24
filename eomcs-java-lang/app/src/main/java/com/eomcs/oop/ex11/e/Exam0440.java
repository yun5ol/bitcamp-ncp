// anonymous class - 익명 클래스가 놓이는 장소: 파라미터
package com.eomcs.oop.ex11.e;

public class Exam0440 {
  // 인터페이스의 경우 static으로 선언하지 않아도 스태틱 멤버에서 사용할 수 있다.
  interface A {
    void print();
  }

  static void m1(A obj) {
    obj.print();
  }

  public static void main(String[] args) {

    // 1) 로컬 클래스 만들기
    class X implements A {
      @Override
      public void print() {
        System.out.println("XXXXX");
      }
    }
    m1(new X());

    // 2) 익명 클래스 만들기
    A obj = new A() {
      @Override
      public void print() {
        System.out.println("익명 클래스!!!");
      }
    };
    m1(obj);

    // 3) 익명 클래스를 파라미터 자리에 바로 삽입
    m1(new A() {
      @Override
      public void print() {
        System.out.println("안녕!!!");
      }
    });

<<<<<<< HEAD

    // test step1
    class Y implements A {
      @Override
      public void print() {
        System.out.println("하하하");
      }
    }

    m1(new Y());

    // test step2
    A a = new A () {
      @Override
      public void print() {
        System.out.println("하하하");
      }
    };

    m1(a);

    // test step3
    m1(new A () {
      @Override
      public void print() {
        System.out.println("하하하");
      }
    });


    // test step4 : 람다문법 활용 : 메서드 1개짜리 인터페이스를 구현하는 경우
    // 클래스 껍데기 지우고,
    // 오버라이드 지우고
    // 메서드명 지우고
    // 화살표
    // 문장이 한개면 중괄호, 세미콜론 생략 가능
    m1(() -> System.out.println("하하하"));
=======
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
  }
}
