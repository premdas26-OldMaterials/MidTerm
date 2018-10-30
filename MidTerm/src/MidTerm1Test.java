import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.Assert.assertArrayEquals;

class MidTerm1Test {

	@Test
	void RectangeConstructorTest() {
		Rectangle r = new Rectangle(3,5);
		assertEquals(r.getiLength(),5);
		assertEquals(r.getiWidth(),3);
	}

	@Test
	void RectangleGettersTest() {
		Rectangle r = new Rectangle(3,5);
		assertEquals(r.getiWidth(),3);
		assertEquals(r.getiLength(),5);
	}
	
	@Test
	void RectangleSettersTest() {
		Rectangle r = new Rectangle(3,5);
		r.setiWidth(10);
		r.setiLength(7);
		assertEquals(r.getiWidth(),10);
		assertEquals(r.getiLength(),7);
	}
	
	@Test
	void TestRectangleArea() {
		Rectangle r = new Rectangle(3,5);
		assertEquals(r.area(),15);
	}
	
	@Test
	void TestRectanglePerimeter() {
		Rectangle r = new Rectangle(3,5);
		assertEquals(r.perimeter(),16);
	}
	
	@Test
	void TestRectanglecompareTo() {
		
		Rectangle r1 = new Rectangle(3,5);
		Rectangle r2 = new Rectangle(5,7);
		
		assertEquals(r1.compareTo(r2),-1);
	}
	
	@Test
	void TestCuboidConstructor() {
		Cuboid c = new Cuboid(5,5,5);
		assertEquals(c.getiDepth(),5);
	}
	
	@Test
	void TestCuboidGetiDepth() {
		Cuboid c = new Cuboid(5,5,6);
		assertEquals(c.getiDepth(),6);
	}
	
	@Test
	void TestCuboidSetiDepth() {
		Cuboid c = new Cuboid(5,5,5);
		c.setiDepth(8);
		assertEquals(c.getiDepth(),8);
	}
	
	@Test
	void TestCuboidArea() {
		Cuboid c = new Cuboid(5,5,5);
		assertEquals(c.area(), 150);
	}
	
	@Test
	void TestCuboidPerimeter() {
		Cuboid c = new Cuboid(5,5,5);
		assertThrows(UnsupportedOperationException.class, () -> {c.perimeter();});
	}
	
	@Test
	void TestCuboidVolume() {
		Cuboid c = new Cuboid(5,5,5);
		assertEquals(c.volume(), 125);
	}
	
	@Test
	void TestSortByArea() {
		Cuboid c1 = new Cuboid(5,5,5);
		Cuboid c2 = new Cuboid(6,6,6);
		Cuboid c3 = new Cuboid(7,7,7);
		ArrayList<Cuboid> arr = new ArrayList<Cuboid>();
		arr.add(c1);
		arr.add(c3);
		arr.add(c2);
		Collections.sort(arr, c1.new sortByArea());
		Cuboid[] expected = {c1, c2, c3};
		assertArrayEquals(expected, arr.toArray());
	}
	
	@Test
	void TestSortByVolume() {
		Cuboid c1 = new Cuboid(2,4,6);
		Cuboid c2 = new Cuboid(3,3,6);
		Cuboid c3 = new Cuboid(10,10,10);
		Cuboid c4 = new Cuboid(1,1,1);
		ArrayList<Cuboid> arr = new ArrayList<Cuboid>();
		arr.add(c3);
		arr.add(c1);
		arr.add(c2);
		arr.add(c4);
		Collections.sort(arr, c1.new sortByVolume());
		Cuboid[] expected = {c4, c1, c2, c3};
		assertArrayEquals(expected, arr.toArray());
		
	}
	
	
	
	
	
	
	
	
}
