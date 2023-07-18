package week1.practicequestions;
import java.util.*;
  
public class Colleges{

  public static void main(String[] args){
  
    CollegeList collegelist = new CollegeList();
    collegelist.addCollegeByConstructor("c01","sdjic","surat","c1",300,20,"desai","bachelors",0);
    collegelist.addCollegeByConstructor("c02","vanita vishram","surat","c2",400,50,"harshita","Masters",0);
    Scanner input = new Scanner(System.in);
    System.out.println("\n1:initialize through constructor\n2:Initialize through getter and setter\n3:display all records");
    System.out.println("select an option");
    int option = input.nextInt();
    input.nextLine(); // consume new line character
    
    if(option == 1 || option == 2){
      System.out.println("Enter collegeId");
      String cid = input.nextLine();
      System.out.println("Enter collegeName");
      String cname = input.nextLine();
      System.out.println("Enter collegeAddress");
      String cadd = input.nextLine();
      System.out.println("Enter collegeLicenseNumber");
      String clno = input.nextLine();
      System.out.println("Enter capacity");
      int cap = input.nextInt();
      System.out.println("Enter staffNumbers");
      int sno = input.nextInt();
      input.nextLine(); // consume new line character
      System.out.println("Enter academicHead");
      String ach = input.nextLine();
      System.out.println("Enter category");
      String cat = input.nextLine();
      if(option == 1){
        collegelist.addCollegeByConstructor(cid,cname,cadd,clno,cap,sno,ach,cat,1);
      } else{
        collegelist.addCollegeByGetSet(cid,cname,cadd,clno,cap,sno,ach,cat);
      }
    } else if(option == 3){
      collegelist.displayAll();
    } else{
      System.out.println("Select the correct option");
    }
  }
}
class CollegeList{

  ArrayList<College> colleges = new ArrayList<>();
  
  public void addCollegeByConstructor(String cid,String cname,String cadd,String clno,int cap,int sno,String ach,String cat,int flag){
    College college = new College(cid,cname,cadd,clno,cap,sno,ach,cat);
    colleges.add(college);
    if(flag == 1){
      for(College clg1 : colleges){
      System.out.println();
      clg1.displayAll();
      }
    }
  }
  public void addCollegeByGetSet(String cid,String cname,String cadd,String clno,int cap,int sno,String ach,String cat){
    College clg1 = new College();
    clg1.setCollegeId(cid);
    clg1.setCollegeName(cname);
    clg1.setCollegeAddress(cadd);
    clg1.setCollegeLicenseNo(clno);
    clg1.setCapacity(cap);
    clg1.setStaffNumbers(sno);
    clg1.setAcademicHead(ach);
    clg1.setCategory(cat);
    colleges.add(clg1);
    for(College college : colleges){
      System.out.println();
      System.out.println("collegeId = " +college.getCollegeId());
      System.out.println("collegeName = " +college.getCollegeName());
      System.out.println("collegeAddress = " +college.getCollegeAddress());
      System.out.println("collegeLicenseNo = " +college.getCollegeLicenseNo());
      System.out.println("capacity = " +college.getCapacity());
      System.out.println("staffNumbers = " +college.getStaffNumbers());
      System.out.println("academicHead = " +college.getAcademicHead());
      System.out.println("category = " +college.getCategory());
    }
  }
  public void displayAll(){
    for(College college : colleges){
      System.out.println();
      college.displayAll();
    }
  }
  
}
class College{

  private String collegeId;
  private String collegeName;
  private String collegeAddress;
  private String collegeLicenseNo;
  private int capacity;
  private int staffNumbers;
  private String academicHead;
  private String category;
  
  College(){}
  College(String cid, String cname, String cadd, String clno, int cap, int sno, String ach, String cat){
      collegeId = cid;
      collegeName = cname;
      collegeAddress = cadd;
      collegeLicenseNo = clno;
      capacity = cap;
      staffNumbers = sno;
      academicHead = ach;
      category = cat;
  }
  
  public void displayAll(){
    System.out.println("collegeId = " +collegeId);
    System.out.println("collegeName = " +collegeName);
    System.out.println("collegeAddress = " +collegeAddress);
    System.out.println("collegeLicenseNo = " +collegeLicenseNo);
    System.out.println("capacity = " +capacity);
    System.out.println("staffNumbers = " +staffNumbers);
    System.out.println("academicHead = " +academicHead);
    System.out.println("category = " +category);
  }
  
  public void setCollegeId(String cid){collegeId = cid;}
  public String getCollegeId(){return collegeId;}
  public void setCollegeName(String cname){collegeName = cname;}
  public String getCollegeName(){return collegeName;}
  public void setCollegeAddress(String cadd){collegeAddress = cadd;}
  public String getCollegeAddress(){return collegeAddress;}
  public void setCollegeLicenseNo(String clno){collegeLicenseNo = clno;}
  public String getCollegeLicenseNo(){return collegeLicenseNo;}
  public void setCapacity(int cap){capacity = cap;}
  public int getCapacity(){return capacity;}
  public void setStaffNumbers(int sno){staffNumbers = sno;}
  public int getStaffNumbers(){return staffNumbers;}
  public void setAcademicHead(String ach){academicHead = ach;}
  public String getAcademicHead(){return academicHead;}
  public void setCategory(String cat){category = cat;}
  public String getCategory(){return category;}
}