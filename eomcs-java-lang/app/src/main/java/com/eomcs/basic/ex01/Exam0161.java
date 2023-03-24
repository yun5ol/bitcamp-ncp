// Object 클래스 - getClass() 와 배열
package com.eomcs.basic.ex01;

public class Exam0161 {

  public static void main(String[] args) {

    String obj1 = new String();
    Class classInfo = obj1.getClass();
<<<<<<< HEAD
    System.out.println(classInfo.getName()); // java.lang.String // 패키지명.클래스명
=======
    System.out.println(classInfo.getName()); // java.lang.String
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805

    // 배열의 클래스 정보
    String[] obj2 = new String[10];
    classInfo = obj2.getClass();
<<<<<<< HEAD
    System.out.println(classInfo.getName()); //[Ljava.lang.String; // [L : 배열
=======
    System.out.println(classInfo.getName()); //[Ljava.lang.String;
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805

    //    int i = 100;
    //    classInfo = i.getClass(); // primitive type은 Object의 서브 클래스가 아니다.

    int[] obj3 = new int[10];
    classInfo = obj3.getClass();
<<<<<<< HEAD
    System.out.println(classInfo.getName()); //[I : int 배열

    float[] obj4 = new float[10];
    classInfo = obj4.getClass();
    System.out.println(classInfo.getName()); //[F : float 배열

    double[] obj5 = new double[10];
    classInfo = obj5.getClass();
    System.out.println(classInfo.getName()); //[D : double 배열

    System.out.println(new byte[10].getClass().getName()); //[B
    System.out.println(new short[10].getClass().getName()); //[S
    System.out.println(new long[10].getClass().getName()); //[J : Long 배열
    System.out.println(new char[10].getClass().getName()); //[C
    System.out.println(new boolean[10].getClass().getName()); //[Z : Boolean 배열
=======
    System.out.println(classInfo.getName()); //[I

    float[] obj4 = new float[10];
    classInfo = obj4.getClass();
    System.out.println(classInfo.getName()); //[F

    double[] obj5 = new double[10];
    classInfo = obj5.getClass();
    System.out.println(classInfo.getName()); //[D

    System.out.println(new byte[10].getClass().getName()); //[B
    System.out.println(new short[10].getClass().getName()); //[S
    System.out.println(new long[10].getClass().getName()); //[J
    System.out.println(new char[10].getClass().getName()); //[C
    System.out.println(new boolean[10].getClass().getName()); //[Z
>>>>>>> fe168bb4781b87d021b44abf4c31866959ff6805
  }
}







