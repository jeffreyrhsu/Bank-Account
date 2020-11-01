import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Bank Account");


    System.out.println("Which account are you making adjustments to? Type in 'checking' or 'savings': ");
    String cs = reader.nextLine();
    

    if(cs.equals("checking")){
      System.out.println("Enter starting amount for checking account: ");
    double stAmChecking = reader.nextInt();
      System.out.println("Choose an option (type corresponding number): \n1.Deposit \n2.Withdraw \n3.Transfer");
      int userChoice = reader.nextInt();
      double newAmount = 0;

      if(userChoice == 1){
        System.out.println("Enter deposited amount: ");
        double deposit = reader.nextDouble();
        newAmount = stAmChecking + deposit;
        System.out.println("New Amount: $" + newAmount);
      }

      else if(userChoice == 2){
        System.out.println("How much would you like to withdraw? ");
        double withdrawal = reader.nextDouble();
        newAmount = stAmChecking - withdrawal;
        System.out.println("New Amount: $" + newAmount);
      }

    }

    else if(cs.equals("savings")){
      System.out.println("Enter starting amount for savings account: ");
    double stAmSavings = reader.nextInt();

      System.out.println("Choose an option (type corresponding number): \n1.Deposit \n2.Withdraw \n3.Transfer");
      int userChoice = reader.nextInt();
      double newAmount = 0;

      if(userChoice == 1){
        System.out.println("Enter deposited amount: ");
        double deposit = reader.nextDouble();
        newAmount = stAmSavings + deposit;
        System.out.println("New Amount: $" + newAmount);
      }

      else if(userChoice == 2){
        System.out.println("How much would you like to withdraw? ");
        double withdrawal = reader.nextDouble();
        newAmount = stAmSavings - withdrawal;
        System.out.println("New Amount: $" + newAmount);
      }

    }


  }
}