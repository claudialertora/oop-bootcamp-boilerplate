package oop;

import java.util.List;

public class Rectangle {

  private int sides = 4;
  private List<Integer> angleDegrees = List.of(90,90,90,90);
  public int numberOfSides() {
    return sides;
  }

  public List<Integer> getAngleDegrees() {
    return angleDegrees;
  }
}
