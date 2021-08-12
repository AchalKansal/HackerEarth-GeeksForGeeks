package com.learn.concepts.generics;

public class GenericClassTwoOperator <T,U>{
    private T obj;
    private U obj1;

    public void addData(T obj, U obj1){
        this.obj = obj;
        this.obj1 = obj1;
    }

    public void getData(){
        System.out.println ("Data: "+obj+" and "+obj1);
    }

  public static void main(String[] args) {
    GenericClassTwoOperator<String, Integer> obj = new GenericClassTwoOperator<String,Integer> ();
    obj.addData ( "Achal Kansal", 28 );
    obj.getData ();
  }
}
