class BankTransaction
 {
  int currentBalance=10000;
  int withdrawalAmt=2000;
  int depositAmt= 5000;
 public void withdrawal()
  {
    currentBalance=currentBalance-withdrawalAmt;
    System.out.println("Current balance is"+currentBalance);
  }
 public void deposit()
  {
    currentBalance=currentBalance+depositAmt;
    System.out.println("Current balance is"+currentBalance);
  }
    
 }