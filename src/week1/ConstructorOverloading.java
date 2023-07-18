package week1;
public class ConstructorOverloading{

  ConstructorOverloading(){
    
    System.out.println("iam a default constructor");
  }
  
  ConstructorOverloading(String name, int age, String location){
  
    System.out.println("my name is " +name+ ", iam " +age+ " and i live in " +location+ ".");
  }
  
  ConstructorOverloading(int no1, int no2, char a){
  
    System.out.println("Addition of no1 and no2 is " +(no1+no2));
    System.out.println("character is " +a);
  }
  
  public static void main(String[] args){
  
    ConstructorOverloading cd;
    cd = new ConstructorOverloading();
    cd = new ConstructorOverloading("Nikeeta sirvi", 25, "Surat");
    cd = new ConstructorOverloading(25, 25, 'z');
    
  }
}