package com.driver;

 class A{
    String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
  public static void main(String[] args){
      A obj1 = new A();
      obj1.meth();
      B obj = new B();
      obj.meth();
  }
}