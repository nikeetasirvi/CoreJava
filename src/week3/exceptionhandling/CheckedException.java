package week3.exceptionhandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// it is a checked exception so we are bound to import the exception classes

public class CheckedException{

  public static void main(String[] args) throws IOException{
    
    // checked exception is compulsory to handle, either by throws keyword or by try_catch block
    
    FileReader file = new FileReader("C:\\Users\\Manoj\\Desktop\\source.txt");
    BufferedReader fileInput = new BufferedReader(file);
    
    for(int i=0; i<3 ; i++){
      System.out.println(fileInput.readLine());
    }
    fileInput.close();
    file.close();
  }
}