package day08.poly;
// 여러개의 클래스 - 퍼블릭은 하나
 class A {}

 class B extends A {
}

 class C extends B {
}

 class D extends C {
}

 class E extends D {
}
public class Basic {

  A x1=new A();
  A x2=new B();
  A x3=new C();
  A x4=new D();
  A X5=new E();


}
