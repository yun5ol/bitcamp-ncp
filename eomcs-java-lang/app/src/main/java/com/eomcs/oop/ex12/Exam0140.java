// Lambda 문법 - 람다 파라미터 II
package com.eomcs.oop.ex12;

public class Exam0140 {

  interface Player {
    void play(String name, int age);
  }

  public static void main(String[] args) {
    // 1) 파라미터는 괄호() 안에 선언한다.
    Player p1 = (String name, int age) -> System.out.printf("%s(%d)님 환영합니다.\n", name, age);
    p1.play("홍길동", 20);

<<<<<<< HEAD
    // 2) 파라미터 타입을 생략할 수 있다. & 바깥클래스와 파라미터명은 달라도 무관
=======
    // 2) 파라미터 타입을 생략할 수 있다.
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    Player p2 = (name, age) -> System.out.printf("%s(%d)님 환영합니다.\n", name, age);
    p2.play("임꺽정", 30);

    // 3) 파라미터가 여러 개일 때는 괄호를 생략할 수 없다.
    //    Player p3 = name, age -> System.out.printf("%s(%d)님 환영합니다.\n", name, age);
    //    p3.play("임꺽정", 30);
  }
}


