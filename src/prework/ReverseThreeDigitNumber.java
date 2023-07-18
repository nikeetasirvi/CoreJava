package prework;
public class ReverseThreeDigitNumber{

  public static void main(String[] args){
  
    int Number = 895;
    
    int DigitAt100s = Number / 100; //5
    
    int Tempnumber = Number / 10;
    int DigitAt10s = Tempnumber % 10; //9
    
    int DigitAt1s = Number % 10;
    
    int ReverseNumber = (100 * DigitAt1s) + (10 * DigitAt10s) + (1 * DigitAt100s);
    
    System.out.println("The reverse number for " + Number + " is " + ReverseNumber);
  }
}