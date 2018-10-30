import java.util.*; 
import java.lang.*; 
import java.io.*; 

public class Rectangle extends Shape {

	private int iWidth;
	private int iLength;
	
	public Rectangle(int width, int length) {
		this.iWidth = width;
		this.iLength = length;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public double area() {
		return iLength*iWidth;
	}
	
	public double perimeter() {
		return (2*iLength) + (2*iWidth);
	}
	
	public int compareTo(Object o) {
		Rectangle R = (Rectangle) o;
		if (this.area() > R.area()) {
			return 1;
		}
		else if (this.area() == R.area()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
}
