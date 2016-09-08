import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console c = System.console();
    int intHeight = Integer.parseInt(c.readLine("Enter the height of your rectangle: "));
    int intWidth = Integer.parseInt(c.readLine("Enter the width of your rectangle: "));
    Rectangle rectangle = new Rectangle(intHeight, intWidth);

    if(rectangle.isSquare()) {
      System.out.println("Hey, that's a square!");
    } else {
      System.out.println("Just your typical rectangle...");
    }
  }
}
