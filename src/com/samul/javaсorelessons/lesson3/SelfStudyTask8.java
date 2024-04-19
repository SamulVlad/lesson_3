package com.samul.javaсorelessons.lesson3;

//8. Написать программу, которая выводит на экран первые четыре степени числа π.

public class SelfStudyTask8 {

	public static void main(String[] args) {
		double pi = Math.PI;

		for (int i = 1; i <= 4; i++) {
			System.out.println("\u03c0^" + i + " = " + Math.pow(pi, i));
		}

	}
}