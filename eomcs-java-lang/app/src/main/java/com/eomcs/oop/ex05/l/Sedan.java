package com.eomcs.oop.ex05.l;

public class Sedan extends Car {
<<<<<<< HEAD
  public void run() { // 기존 메서드 재정의 => 오버라이딩
=======
  public void run() {
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
    System.out.println("쌩쌩 달린다.");
  }

  public void doSunroof(boolean open) {
    if (open) {
      System.out.println("썬루프를 연다.");
    } else {
      System.out.println("썬루프를 닫는다.");
    }
  }
}
