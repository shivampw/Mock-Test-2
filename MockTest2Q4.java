/* Create an interface called Drawable with a method draw() that has no implementation.
 Implement this interface in classes Circle and Rectangle. Write a program that
  creates objects of Circle and Rectangle and calls the draw() method on each
   object. */
   
interface Drawable {
  void draw();
}

class Circle implements Drawable {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public void draw() {
    System.out.println("Drawing a circle with radius " + radius);
  }
}

class Rectangle implements Drawable {
  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public void draw() {
    System.out.println("Drawing a rectangle with width " + width + " and height " + height);
  }
}

public class MockTest2Q4 {
  public static void main(String[] args) {
    Drawable circle = new Circle(10);
    circle.draw();

    Drawable rectangle = new Rectangle(20, 30);
    rectangle.draw();
  }
}
