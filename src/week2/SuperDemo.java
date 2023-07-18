package week2;

class SuperDemo{
  public static void main(String args[]){
    AccountDetails A = new AccountDetails("Harshit",11111,10000,5000,500);
    A.display();
  }
}
class Account{
  String customerName;
  int accountNo;
  Account(String a, int b){
    customerName=a;
    accountNo=b;
  }
  void display(){
    System.out.println ("Customer Name:"+customerName);
    System.out.println ("Account No: "+accountNo);
  }
}
class CurrentAccount extends Account{
  int currentBalance;
  CurrentAccount(String a, int b, int c){
    super(a,b);
    currentBalance=c;
  }
  void display(){
    super.display();
    System.out.println ("Current Balance:"+currentBalance);
  }
}
class AccountDetails extends CurrentAccount{
  int depositAmount, withdrawalAmount;
  AccountDetails(String a, int b, int c, int d, int e){
    super(a,b,c);
    depositAmount=d;
    withdrawalAmount=e;
  }
  void display(){
    super.display();
    System.out.println ("Deposit Amount:"+depositAmount);
    System.out.println ("Withdrawal Amount:"+withdrawalAmount);
  }
}