package week2;
public class Encapsulation{
  
  private int age;
  private boolean decision;
  public void setage(int age){
    this.age = age;
  }
  public void getdata(){
    if(age < 60){
      System.out.println("your age is " +age+ ", hence you are eligible for licence");
      decision = true;
      System.out.println("desicion = " +decision);
    } else{
      System.out.println("not eligible for licence");
      decision = false;
      System.out.println("desicion = " +decision);
    }
  }
  public static void main(String[] args){
    Encapsulation e = new Encapsulation();
    e.setage(70);
    e.getdata();
  }
}