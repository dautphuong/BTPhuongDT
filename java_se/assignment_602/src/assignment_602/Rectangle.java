package assignment_602;

import java.util.Collections;
import java.util.Comparator;

public class Rectangle implements Shape {
	private int length;
	private int width;
	
	@Override
	public int calculatePerimeter() {
		return (this.length + this.width) * 2;
	}
	@Override
	public int calculateArea() {
		return this.length * this.width;
	}
	@Override
	public int getLength() {
		return this.length;
	}
	@Override
	public int getWidth() {
		return this.width;
	}
	@Override
	public void setLengthWidth(int len, int width) {
		this.length = len;
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "Rectangle {length=" + this.length + ", width=" + this.width + ", Perimeter=" + this.calculatePerimeter()
				+ ", Area=" + this.calculateArea() + "}";
	}
	

}
