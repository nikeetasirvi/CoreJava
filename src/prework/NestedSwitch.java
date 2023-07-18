package prework;
public class NestedSwitch{

  public static void main(String[] args){
    
    //switch can also work with String data types, but it dont work in my old system
    char Language = 'X';
    char MovieName = 'A';
    
    switch(Language){
      
      case 'X':{
      
        switch(MovieName){
        
          case 'A':{
          
            System.out.println("Movie A");
            break;
          }
          
          case 'B':{
          
            System.out.println("Movie B");
            break;
          }
        }
        break;
      }
      
      case 'Y':{
      
        switch(MovieName){
        
          case 'C':{
          
            System.out.println("Movie C");
            break;
          }
          
          case 'D':{
          
            System.out.println("Movie D");
            break;
          }
        }
        break;
      }
      
      default:{
      
        System.out.println("incorrect language");
      }
    }
  }
}