package week3.exceptionhandling;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class TryCatchDemo{

  public static void main(String[] args){
    
    Help help = new Help();
    try{ // if i do not handle this exception here, the other option is to throw it to JVM by writting "throws IOException" in main method signature 
      help.helping();
    } catch(IOException e){
      System.out.println(e.getMessage());
    }
    
  }
}
class Help{

  public void helping() throws IOException{
  
    FileReader file = null;
    BufferedReader fileRead = null;
    // if we write the above code in try block then, the finally block will not get the above objects and we will not be able to close the opened files
    
    try{
      file = new FileReader("C:\\Users\\Manoj\\Desktop\\source.txt"); // this exception is handled by FileNotFoundException
      fileRead = new BufferedReader(file);
      for(int i=0; i<3; i++){
        System.out.println(fileRead.readLine()); // this exception is handled by throws IOException
      }
    } catch(FileNotFoundException e){
      System.err.println("caught FileNotFoundException: " +e.getMessage());
    } finally{
      if(fileRead != null){
        System.out.println("closing buffered file");
        fileRead.close(); // this exception is handled by throws IOException
      } else{
        System.out.println("Buffered reader is null, no need to close the file");
      }
      if(file != null){
        System.out.println("closing file");
        file.close(); // this exception is handled by throws IOException
      } else{
        System.out.println("File is null, no need to close the file");
      }
    }
  }
}