package prework;
public class TypeConversion_Manual_NarrowingCasting_Explicit{

  public static void main(String[] args){
    
    //double -> float -> long -> int -> char -> short -> byte
    
    double d = 10000000000.3;
    float f =10.1f;
    long l = 123456789123456789l;
    int i = 123456789;
    char c = 'A';
    short s = 250;
    byte b = 5;
    
    //correct value
    f=(float)d;
    System.out.println("f = " + f);
    f=10.1f;
    
    //data lost
    l=(long)f;
    System.out.println("l = " + l);
    l = 123456789123456789l;
    
    //incorrect value
    i=(int)l;
    System.out.println("i = " + i);
    i= 123456789;
    
    //ASCII character
    c=(char)i;
    System.out.println("c = " + c);
    c='A';
    
    //ASCII value
    s=(short)c;
    System.out.println("s = " + s);
    s=250;
    
    //incorrect value
    b=(byte)s;
    System.out.println("b = " + b);
    b=5;
    
  }
}