package com.samul.javaсorelessons.lesson3;

//5. Вычислить значение выражения по формуле (все переменные принимают
//действительные значения):


public class Task5 {

	public static void main(String[] args) {
		double x, y;
		double denom;
		double result;
		
		x = Math.PI / 6;
		y = Math.PI / 4;
		
		denom = Math.cos(x) - Math.sin(y);
		
		if (denom == 0) {
			System.out.println("Знаменатель дроби равен 0. Значение выражения не может быть вычислено!");
			return;
		}
		
		result = (Math.sin(x) + Math.cos(y)) / denom * Math.tan(x * y);
		
		System.out.print("Result=" + result);
		
	}

}
