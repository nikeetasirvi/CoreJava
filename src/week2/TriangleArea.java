package week2;

public class TriangleArea extends RectangleArea{ // multilevel inheritance

  public void triangleArea(int b,int h){
  
    float base = b;
    float height = h;
    float result = 0.5f*base*height;
    System.out.println("Area of triangle is = " +result);
  }
  
  public static void main(String[] args){
  
    TriangleArea c = new TriangleArea();
    c.circleArea(2.1f);
    c.rectangleArea(1,2);
    c.triangleArea(2,3);
  }
}

class CircleArea{

  public void circleArea(float r){
  
    float radius = r;
    float result = 3.14f*radius*radius;
    System.out.println("Area of circle is = " +result);
  }
}

class RectangleArea extends CircleArea{ //single level inheritance

  public void rectangleArea(int l,int b){
  
    float length = l;
    float bredth = b;
    float result = length*bredth;
    System.out.println("Area of rectangle is = " +result);
  }
}