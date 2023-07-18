package week1;
public class StringExample{

  public static void main(String[] args){
  
    char ch[] = {'s','t','r','i','n','g'}; 
    int ar[] = {1,2,3,4,5};
    String s1 = "java";
    String s2 = new String("example");
    String s3 = new String(ch); // converting char array to string
    String s4 = s1+" "+s2;
    
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(ch);
    System.out.println(ar);
  }
}