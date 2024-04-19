package com.samul.javaсorelessons.lesson3;

//7. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class SelfStydyTask7 {

	public static void main(String[] args) {
		double a = 10, b = 20, c = 30, d = 40;
		double result;
		
		if (c == 0 || d == 0) {
			System.out.println("Переменная 'c' или 'd' равна 0. Значение выражения не может быть вычислено!");
			return;
		}
		
		result = a / c * b / d - (a * b - c) / c * d;
		
		System.out.print("Result = " + result);

	}

}
