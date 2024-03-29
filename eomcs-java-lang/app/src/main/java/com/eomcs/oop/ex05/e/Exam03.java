// 상속과 메서드 호출
package com.eomcs.oop.ex05.e;

public class Exam03 {

  public static void main(String[] args) {
    B obj = new D(); // 변수가 어느 클래스인지가 중요
    // 컴파일러는 변수(레퍼런스)의 타입에서 메서드를 찾아 올라간다.
    
    obj.m4(); // obj 레퍼런스의 클래스(B)에서 m4()를 찾아 호출한다.
    obj.m3(); // obj 레퍼런스의 클래스(B)에서 m3()를 찾아보고 없다면 수퍼 클래스에서 찾는다.
    obj.m2(); // 만약 D의 수퍼 클래스에서도 못찾는다면 그 위의 클래스에서 찾아본다.
    obj.m1(); // 그 위에 클래스에서도 없다면 더 위에 클래스에서 찾아본다.

  }

}
