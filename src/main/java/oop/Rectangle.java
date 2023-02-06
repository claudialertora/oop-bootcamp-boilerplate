package oop;

import java.util.List;

public class Rectangle {

  private int sides = 4;
  private int base;
  private int height;
  private List<Integer> angleDegrees = List.of(90,90,90,90);

  public Rectangle(int base, int height) {
    this.base = base;
    this.height = height;
  }

  public int numberOfSides() {
    return sides;
  }

  public List<Integer> getAngleDegrees() {
    return angleDegrees;
  }

  public int perimeter() {
    return 2*base + 2*height;
  }
}
