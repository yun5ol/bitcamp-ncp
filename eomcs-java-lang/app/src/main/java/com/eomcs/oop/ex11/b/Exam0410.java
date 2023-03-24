//static nested class : import static 사용 전
package com.eomcs.oop.ex11.b;

import com.eomcs.oop.ex11.b.sub.M;

class D {
  static int v1;

  static void m1() {}

  static class X {
    void test() {
      System.out.println("test()");
    }
  }
}

public class Exam0410 {

  public static void main(String[] args) {
    // 같은 패키지 클래스
    D.v1 = 100;
    D.m1();
    D.X obj = new D.X();

<<<<<<< HEAD
    // 다른 패키지 클래스 // import 먼저
=======
    // 다른 패키지 클래스
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    M.v2 = 200;
    M.m2();
    M.Y obj2 = new M.Y();
  }

}
