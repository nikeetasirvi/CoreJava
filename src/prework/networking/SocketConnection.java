package prework.networking;
//import networking.protocol.HttpProtocol; //selectiveimport
import prework.networking.protocols.*; //bulk import

public class SocketConnection{

  public static void main(String[] args){
  
    //import is not required here
    Socket s = new Socket();
    
    //import is required here
    HttpProtocol http = new HttpProtocol();
    TcpProtocol tcp = new TcpProtocol();
    
  }
}