package prework;
class Animal{

  static String planet; //class attribute
  static int count;
  
  String name; //normal instance attribute
  String color;
  boolean canFly;
  
  void setName(String name){
    this.name = name;
  }
  
  String getName(){ //normal instance method
    return name;
  }
  
  static void updateCount(){ //class method
    count ++;
    System.out.println(count);
    //the static attribute such as count can be used in normal instance method as well as class method.
    //But a normal instance atribute such as name can only be used in a normal instance method and not in a class method.
  }
  
}

class AnimalDemo{

  public static void main(String[] args){
  
    Animal cat = new Animal();
    Animal dog = new Animal();
    
    cat.name = "Puffy";
    dog.name = "Pluto";
    
    System.out.println(cat.name);
    System.out.println(dog.name);
    
    /*the static attribute and method will have same value for all the animals,
     * hence we can call all the static attributes and methods with the class name rather than different animal objects.such as,
     * 
     * Animal.planet = "Earth";
     * System.out.println(Animal.planet);
     * System.out.println(Animal.planet);
     * 
     * this will be a good thing as it will remove warnings when compiled
     * 
     */
    
    cat.planet = "Earth";//planet name given to cat but both cat and dog will share this attribute
    System.out.println(cat.planet);
    System.out.println(dog.planet);
    
    dog.planet = "Mars";//planet name changed for dog but both cat and dog will share this attribute
    System.out.println(cat.planet);
    System.out.println(dog.planet);
    
    Animal monkey = new Animal();
    monkey.setName("Jaggu");
    System.out.println("monkey name is " + monkey.getName());
    monkey.updateCount();
    
    Animal deer = new Animal();
    deer.setName("sundari");
    System.out.println("deer name is " + deer.getName());
    deer.updateCount();
    
  }
}