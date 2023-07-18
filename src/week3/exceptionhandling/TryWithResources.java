package week3.exceptionhandling;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources{

  public static void main(String[] args){
  
    String filePath = "C:\\Users\\Manoj\\Desktop\\source2.txt";
    
     /* FileOutputStream fileOutputStream;
      * 
      * written here because we will need to close() this in finally block
      * but now we can write the same thing in the try brackets
      * 
      */
      
    try(FileOutputStream fileOutputStream = new FileOutputStream(filePath)){
      //fileOutputStream = new FileOutputStream(filePath);
      String content = "welcome to try_with_resource demo...!!!";
      fileOutputStream.write(content.getBytes()); //content.getBytes() is a String data type function
      System.out.println("content written to file successfully");
      
    } catch(IOException e){
      System.out.println("caught IOException: " +e.getMessage());
    }
  }
}