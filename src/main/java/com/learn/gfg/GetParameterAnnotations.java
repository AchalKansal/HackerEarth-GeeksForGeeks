package com.learn.gfg;

//Java program to demonstrate how to 
//apply getParameterAnnotations() method 
//of Method Class. 

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class GetParameterAnnotations {

	// Main method
	public static void main(String[] args) {
		try {
			// create class object
			Class classobj = GetParameterAnnotations.class;

			// create method object of setManyValues
			Method setManyValueObject = null;

			Method[] methods = classobj.getMethods();

			for (Method m : methods) {
				if (m.getName().equals("setManyValues"))
					setManyValueObject = m;
			}

			// get Annotation of parameter
			Annotation[][] Arrayannotations = setManyValueObject.getParameterAnnotations();

			System.out.println("Method Name: " + setManyValueObject.getName());

			// print parameter annotation
			for (Annotation[] annotationRow : Arrayannotations) {
				for (Annotation annotation : annotationRow) {
					AnnotationDemo anndemo = (AnnotationDemo) annotation;
					System.out.println("key of annotation: " + anndemo.key());
					System.out.println("value of annotation: " + anndemo.value());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// method name setManyValues
	public void setManyValues(@AnnotationDemo(key = "methodParameter1", value = "Some value") String parameter1) {
		System.out.println("setManyValues");
	}
}

// create a custom Annotation to apply on method
@Retention(RetentionPolicy.RUNTIME)
@interface AnnotationDemo {

	// This annotation has two attributes.
	public String key();

	public String value();
}
