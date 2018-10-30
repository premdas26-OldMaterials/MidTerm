import java.util.*; 
import java.lang.*; 
import java.io.*; 

public class Cuboid extends Rectangle{

	int iDepth;
	
	public Cuboid(int width, int length, int depth) {
		super(width, length);
		this.iDepth = depth;
	}
	
	public int getiDepth() {
		return this.iDepth;
	}
	
	public void setiDepth(int depth) {
		this.iDepth = depth;
	}
	
	public double volume() {
		return iDepth*super.getiLength()*super.getiWidth();
	}
	
	public double perimeter() {
		throw new UnsupportedOperationException("Cannot call this method");
	}
	
	@Override
	public double area() {
		return (2*iDepth*super.getiWidth()) + (2*iDepth*super.getiLength()) + (2*super.getiLength()*super.getiWidth());
	}
	
	public int compareToVolume(Cuboid compared) {
		if (this.volume() > compared.volume()) {
			return 1;
		}
		else if (this.volume() == compared.volume()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	public int compareToArea(Object o) {
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
	
	public class sortByArea implements Comparator<Cuboid> {
		
		public int compare(Cuboid c1, Cuboid c2) {
			return c1.compareToArea(c2);
		}
		
	}
	
	public class sortByVolume implements Comparator<Cuboid> {
		
		public int compare(Cuboid c1, Cuboid c2) {
			return c1.compareToVolume(c2);
		}
		
	}
	
}
