package com.learn.concepts.generics;

public class GenericClassWithConstructor<T> {
    private T object;

    GenericClassWithConstructor(T obj){
        this.object = obj;
    }

    public T getData() {
        return object;
    }

    public static void main(String[] args) {
        GenericClassWithConstructor<String> stringObj = new GenericClassWithConstructor<String>("Achal Kansal");
        System.out.println(stringObj.getData());
        GenericClassWithConstructor<Integer> integerObj = new GenericClassWithConstructor<Integer>(28);
        System.out.println(integerObj.getData());
    }
}
