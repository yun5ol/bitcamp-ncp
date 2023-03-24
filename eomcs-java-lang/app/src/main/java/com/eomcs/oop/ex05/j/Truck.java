package com.eomcs.oop.ex05.j;

// 기존의 Car 클래스를 상속 받아 특별한 기능을 덧붙인다.
// - specialization 이라 한다.
//

public class Truck extends Car {
<<<<<<< HEAD
  @Override // 메서드 재정의
=======
  @Override
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
  public void run() {
    System.out.println("덜컹 덜컹 달린다.");
  }

  public void dump() {
    System.out.println("짐을 내린다.");
  }
}
