import java.util.List;
import java.util.ArrayList;

public class Rectangle {
  private int mHeight;
  private int mWidth;
  private static List<Rectangle> instances = new ArrayList<Rectangle>();

  public Rectangle(int height, int width) {
    mHeight = height;
    mWidth = width;
    instances.add(this);
  }

  public int getHeight() {
    return mHeight;
  }

  public int getWidth() {
    return mWidth;
  }

  public boolean isSquare() {
    return mHeight == mWidth;
  }

  public static List<Rectangle> all() {
    return instances;
  }
}
