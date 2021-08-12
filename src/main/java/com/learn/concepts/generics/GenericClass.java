package com.learn.concepts.generics;

public class GenericClass<T> {
  private T object;

  public void addData(T obj) {
    this.object = obj;
  }

  public T getData() {
    return object;
  }

  public static void main(String[] args) {
    GenericClass<String> stringObj = new GenericClass<String>();
    stringObj.addData("Achal Kansal");
    System.out.println(stringObj.getData());
    GenericClass<Integer> integerObj = new GenericClass<Integer>();
    integerObj.addData(28);
    System.out.println(integerObj.getData());
  }
}
