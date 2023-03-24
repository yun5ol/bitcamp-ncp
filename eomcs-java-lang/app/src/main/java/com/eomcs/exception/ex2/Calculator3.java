// 예외 처리 문법을 적용한 후 - 오류일 때 예외 정보를 별도로 호출자에게 전달한다.
package com.eomcs.exception.ex2;

public class Calculator3 {

<<<<<<< HEAD
  public static int compute(String op, int a, int b) throws Throwable {
=======
  public static int compute(String op, int a, int b) {
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    switch (op) {
      case "+": return a + b;
      case "-": return a - b;
      case "*": return a * b;
      case "/": return a / b;
      case "%": return a % b;
      default:
<<<<<<< HEAD
//         유효하지 않은 연산자인 경우 throw 명령을 이용하여 호출자에게 
//         오류 상황을 알린다.
        // 오류 내용은 java.lang.Throwable 객체에 담아 넘긴다.
        // => 이때 메서드 선언부에는 Throwable 예외를 던지는 메서드임을 표시해야 한다.
        throw new Throwable("해당 연산자를 지원하지 않습니다.");
=======
        // 유효하지 않은 연산자인 경우 throw 명령을 이용하여 호출자에게 
        // 오류 상황을 알린다.
        throw new RuntimeException("해당 연산자를 지원하지 않습니다.");
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    }
  }
}
