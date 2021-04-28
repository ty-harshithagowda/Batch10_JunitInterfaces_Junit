package com.te.mathutil;

public class MathUtil {

	public int addNumber(int a,int b) {
		return a+b;
	}
	public double computeCircleArea(double radius) {
	return Math.PI*radius *radius;
}
	public double divide(int a,int b) {
		return a/b;  //a/0 -->arithmetic exception
	}
	
}
