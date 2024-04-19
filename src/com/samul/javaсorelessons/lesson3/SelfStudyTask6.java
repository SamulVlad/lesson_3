package com.samul.javaсorelessons.lesson3;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class SelfStudyTask6 {

	public static void main(String[] args) {
		double a = 5, b = 6, c = 7;
		double d;
		double result;

		if (a == 0) {
			System.out.println("Переменная 'a' равна 0. Значение выражения не может быть вычислено!");
			return;
		}

		if (b == 0) {
			System.out.println("Переменная 'b'  равна 0. Значение выражения не может быть вычислено!");
			return;
		}

		d = b * b + 4 * a * c;

		if (d < 0) {
			System.out.println("Выражение под корнем меньше нуля.  Значение выражения не может быть вычислено!");
			return;
		}

		result = (b + Math.sqrt(d)) / 2 * a - Math.pow(a, 3) * c + 1 / b * b;

		System.out.print("Result = " + result);

	}

}
