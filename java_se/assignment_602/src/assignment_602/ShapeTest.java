package assignment_602;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class ShapeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of array: ");
		int n = sc.nextInt();
		Rectangle[] rectangleArray = new Rectangle[n];
		int length, width ;

		for (int i = 0; i < n; i++) {
			System.out.println("Retangle " + (i+1));
			rectangleArray[i] = new Rectangle();
			System.out.print("Input length: ");
			length = Integer.parseInt(sc.next());
			System.out.print("Input width: ");
			width = Integer.parseInt(sc.next());
			rectangleArray[i].setLengthWidth(length, width);
		}
		
		System.out.println("----------------------- List Rectangle : ----------------------------");
		for (Rectangle rectangle : rectangleArray) {
			System.out.println(rectangle);
		}
		System.out.println("----------------------- Rectangle Max Area : ----------------------------");
		Rectangle max = rectangleArray[0];
		for (Rectangle rectangle : rectangleArray) {
			if (max.calculateArea() < rectangle.calculateArea()) {
				max = rectangle;
			}
		}
		System.out.println(max);
		System.out.println("----------------------- Rectangle Min Area : ----------------------------");
		Rectangle min = rectangleArray[0];
		for (Rectangle rectangle : rectangleArray) {
			if (min.calculateArea() > rectangle.calculateArea()) {
				min = rectangle;
			}
		}
		System.out.println(min);
	}
}
