// local class : .class 파일명
package com.eomcs.oop.ex11.d;

class B2 {
  void m1() {
    class X {
      // 로컬 클래스의 .class 파일명
      // => [바깥클래스명]$[정의된순서][로컬클래스명].class
      // => 예) B2$1X.class
    }
    class Y {
      // 로컬 클래스의 .class 파일명
      // => [바깥클래스명]$[정의된순서][로컬클래스명].class
      // => 예) B2$1Y.class
    }
  }

  static void m2() {
    class Y {
      // 로컬 클래스의 .class 파일명
      // => [바깥클래스명]$[정의된순서][로컬클래스명].class
      // => 예) B2$2Y.class
    }
    class X {
      // 로컬 클래스의 .class 파일명
      // => [바깥클래스명]$[정의된순서][로컬클래스명].class
      // => 예) B2$2X.class
    }
    class Z {
      // 로컬 클래스의 .class 파일명
      // => [바깥클래스명]$[정의된순서][로컬클래스명].class
<<<<<<< HEAD
      // => 예) B2$1Z.class // 정의된 적 없으니, 1 => "나열된 순서가 아니다"
=======
      // => 예) B2$1Z.class
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    }
  }
}

public class Exam0130 {

  public static void main(String[] args) {
  }

}
