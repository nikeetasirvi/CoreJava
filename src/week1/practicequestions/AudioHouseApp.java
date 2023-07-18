package week1.practicequestions;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class AudioHouseApp{

  public static void main(String[] args){
  
    AudioHouse audio = new AudioHouse();
    audio.addAlbum(1,"Love",2019,'A');
    audio.addAlbum(2,"Life",2020,'B');
    audio.addAlbum(3,"Family",2021,'C');
    
    System.out.println("1:view all albums\n2:Search album by Year\n3:Search album by AlbumId\n4:Delete an entry by id");
    System.out.println("Enter an option");
    Scanner input = new Scanner(System.in);
    int option = input.nextInt();
    if(option == 1){
      audio.getAlbum();
    } else if(option == 2){
      System.out.println("Enter a year");
      int year = input.nextInt();
      audio.searchByYear(year); 
    } else if(option == 3){
      System.out.println("Enter id");
      int id = input.nextInt();
      audio.searchById(id);
    } else if(option == 4){
      System.out.println("Enter id");
      int id = input.nextInt();
      audio.deleteById(id);
    }else{
      System.out.println("Select proper option");
    }
  }
}
class AudioHouse{

  private ArrayList<Album> albums = new ArrayList<>();
  boolean flag;
  
  public void addAlbum(int id, String name, int year, char group){
    Album album = new Album(id,name,year,group);
    albums.add(album);
  }
  
  public void getAlbum(){
    for(Album album : albums){
      System.out.println();
      album.getAlbum();
    }
  }
  
  public void searchByYear(int year){
    flag = false;
    for(Album album : albums){
      if(album.getYear() == year){
        flag = true;
        System.out.println("Album Name = " +album.getName());
        System.out.println("Album Id = " +album.getId());
        System.out.println("Album Group = " +album.getGroup());
      }
    }
    if(!flag){System.out.println("Entered year is not present");}
  }
  
  public void searchById(int id){
    flag = false;
    for(Album album : albums){
      if(album.getId() == id){
        flag = true;
        System.out.println("Album Name = " +album.getName());
        System.out.println("Album Year = " +album.getYear());
        System.out.println("Album Group = " +album.getGroup());
      }
    }
    if(!flag){System.out.println("Entered id is not present");}
  }
  
  public void deleteById(int id){
    flag = false;
    /*for(Album album : albums){
      if(album.getId() == id){
        flag = true;
        albums.remove(album);
      }  
    }*/
    //the above is correct but it did not worked for this program
    Iterator<Album> itr = albums.iterator();
    while(itr.hasNext()){
      Album album = itr.next();
      if (album.getId() == id){
        flag = true;
        itr.remove();
        System.out.println("deleted successfully");
      }
    }
    for(Album album : albums){
      album.getAlbum();
      System.out.println();
    }
    if(!flag){System.out.println("Entered id is not present");}
  }
}

class Album{

  private int id;
  private String name;
  private int year;
  private char group;
  
  Album(int id,String name,int year,char group){
    this.id = id;
    this.name = name;
    this.year = year;
    this.group = group;
  }

  public void getAlbum(){
    System.out.println("Id = " +id);
    System.out.println("Name = " +name);
    System.out.println("Year = " +year);
    System.out.println("Group = " +group);
  }
  public int getYear(){
    return year;
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public char getGroup(){
    return group;
  }
}