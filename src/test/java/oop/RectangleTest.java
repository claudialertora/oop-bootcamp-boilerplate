package oop;

import static org.testng.AssertJUnit.assertEquals;


import java.util.List;
import org.testng.annotations.Test;

public class RectangleTest {

  @Test
  public void itShouldHaveFourSides() {
      Rectangle rectangle = new Rectangle(80, 20);
      int total = rectangle.numberOfSides();
      assertEquals(4, total);
  }

  @Test
  public void itShouldHaveAllRightAngles() {
    Rectangle rectangle = new Rectangle(80, 20);
    List<Integer> actual = rectangle.getAngleDegrees();
    List<Integer> expected = List.of(90,90,90,90);
    assertEquals(expected, actual);
  }

  @Test
  public void itShouldCalculateItsPerimeter() {
    Rectangle rectangle = new Rectangle(60, 20);
    int actual = rectangle.perimeter();
    assertEquals(160, actual);
  }


  
  


}
