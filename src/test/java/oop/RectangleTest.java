package oop;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

public class RectangleTest {

  @Test
  public void itShouldCalculateItsPerimeter() {
    Rectangle rectangle = new Rectangle(60, 20);
    int actual = rectangle.perimeter();
    assertEquals(160, actual);
  }

  @Test
  public void itShouldCalculateArea() {
    Rectangle rectangle = new Rectangle(80, 20);
    int actual = rectangle.area();
    assertEquals(1600, actual);
  }



}
