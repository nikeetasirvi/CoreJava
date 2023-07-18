package week1;
import java.util.Scanner;

public class StudlyCaps{

  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string");
    String s = input.nextLine();
    int ascii;
    String convertedText="";
    for(int i=0; i<s.length(); i++){
      
      ascii = s.charAt(i);
      
      if(i % 2 !=0){
      
        if(ascii >= 97 && ascii <= 122){
          ascii=ascii-32;
          convertedText = convertedText + (char)ascii;
        } else if(ascii >= 65 && ascii <= 90){
          convertedText = convertedText + (char)ascii;
        } else{
          convertedText = convertedText + (char)ascii;
        }
        
      }
      if(i % 2 ==0){
      
        if(ascii >= 65 && ascii <= 90){
          ascii=ascii+32;
          convertedText = convertedText + (char)ascii;
        } else if(ascii >= 97 && ascii <= 122){
          convertedText = convertedText + (char)ascii;
        } else{
          convertedText = convertedText + (char)ascii;
        }
        
      }
      
    }
    System.out.println("StudlyCaps = " +convertedText);
    input.close();
  }
}