public class Rectangle {
  private int mHeight;
  private int mWidth;

  public Rectangle(int height, int width) {
    mHeight = height;
    mWidth = width;
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
}
