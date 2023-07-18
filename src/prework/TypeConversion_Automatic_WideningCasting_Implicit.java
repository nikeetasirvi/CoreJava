package prework;
public class TypeConversion_Automatic_WideningCasting_Implicit{

 public static void main(String[] args) {
  
  byte b = 10;
  short s = 120;
  char c = 'A';
  int i = 123456789;
  long l = 123456789123456789l;
  float f = 10.1f;
  double d = 100.3;
  
  // byte -> short -> char -> int -> long -> float -> double
  
  // correct
  s = b;
  System.out.println("Short's value is ->" + s);
  s = 200;
  
  // not happen
  //c = s;
  //System.out.println("char's value is ->" + c);
  //c = 'A';
  
  //correct
  i = c;
  System.out.println("integer's value is ->" + i);
  i = 123456789;
  
  //correct
  l = i;
  System.out.println("long's value is ->" + l);
  l = 123456789123456789l;
  
  //correct
  f = l;
  System.out.println("float's value is ->" + f);
  f = 10.1f;
  
  //correct
  d = f;
  System.out.println("double's value is ->" + d);
  d = 100.3;
  
 }
 
}
