// 리턴 문장에 람다(lambda) 활용
package com.eomcs.oop.ex12;

public class Exam0410 {

  static interface Interest {
    double compute(int money);
  }

  // 팩토리 메서드
  // => Interest 구현체를 생성하여 리턴하는 메서드
  // 
  static Interest getInterest(final double rate) {
    // 로컬 클래스로 인터페이스 구현한 후 객체 리턴하기
    class InterestImpl implements Interest {
<<<<<<< HEAD

=======
      double rate;

      public InterestImpl(double rate) {
        this.rate = rate;
      }
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805

      @Override
      public double compute(int money) {
        return money + (money * rate / 100);
      }
    }
<<<<<<< HEAD
    return new InterestImpl();
=======
    return new InterestImpl(rate);
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
  }

  public static void main(String[] args) {
    Interest i1 = getInterest(1.5);
    System.out.printf("금액: %.2f\n", i1.compute(1_0000_0000));

    Interest i2 = getInterest(2.5);
    System.out.printf("금액: %.2f\n", i2.compute(1_0000_0000));
  }

}


