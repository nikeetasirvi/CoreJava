package week1;
class ThisDemo{
  
  int age = 10;
    
  /* Invoke current class constructor
   * Invoke current class method
   * Pass an argument in the method call
   * Pass an argument in the constructor call
   * Return the current class object
   */
  
  ThisDemo(){
    
    this(1);
    //this();
    
    this.Name("Nikeeta");
    //this.name();
    
    /*Call to this must be first statement in constructor(if i interchange the above lines up
    and down the compiler will give an error, hence the constructor call should be first statement)*/
    
    SurName(this);
    
    this.age = 25;
    System.out.println(age);
  }
  
  ThisDemo(int x){
    System.out.println("hi");
  }
  
  void Name(String a){
    System.out.println(a);
  }
  
  void SurName(ThisDemo ob){
    System.out.println("Sirvi");
  }
  
  public static void main(String args[]){
    ThisDemo t = new ThisDemo();
  }
}
