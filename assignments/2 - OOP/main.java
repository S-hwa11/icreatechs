import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner
        BankActions bank = new BankActions(); //Bank Actions
        
        while (true) {
            Utils.cls();
            
            System.out.println("1. Register");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Get Info");
            System.out.println("5. Exit");

            System.out.print("> ");
            int userAction = sc.nextInt();

            switch (userAction) {
               case 1 -> {
                    sc.nextLine();

                    System.out.print("Enter Account Name: ");
                    String accName = sc.nextLine();

                    System.out.print("Enter Initial Deposit: ");
                    int initialDep = sc.nextInt();

                    System.out.print("Enter Account Pin: ");
                    int accPin = sc.nextInt();

                    bank.Register(accName, initialDep, accPin);
                    
                    Utils.sleep(1);
               }

               case 2 -> {
                    sc.nextLine();

                    System.out.print("Enter Pin: ");
                    int accPin = sc.nextInt();

                    boolean isAccValid = bank.validateAccount(accPin);
                    if (!isAccValid) {
                        System.out.println("Account is Invalid!");
                        Utils.sleep(2);
                        break;
                    }

                    System.out.print("Enter Deposit Amount: ");
                    int depAmount = sc.nextInt();

                    bank.Deposit(accPin, depAmount);
                    
                    System.out.println("Deposit Succesful.");

                    Utils.sleep(1);                    
               }

               case 3 -> {
                   sc.nextLine();

                   System.out.print("Enter Pin: ");
                   int accPin = sc.nextInt();

                   boolean isAccValid = bank.validateAccount(accPin);
                   if (!isAccValid) {
                       System.out.println("Account is Invalid!");
                       Utils.sleep(2);
                       break;
                   }

                   System.out.print("Enter Withdrawal Amount: ");
                   int withAmount = sc.nextInt();

                   bank.Withdraw(accPin, withAmount);
                   
                   System.out.println("Withdrawal Successful.");

                   Utils.sleep(1);
               }

               case 4 -> {
                   sc.nextLine();

                   System.out.print("Enter Pin: ");
                   int accPin = sc.nextInt();

                   boolean isAccValid = bank.validateAccount(accPin);
                   if (!isAccValid) {
                       System.out.println("Account is Invalid!");
                       Utils.sleep(2);
                       break;
                   }

                   System.out.println(bank.getAccountInfo(accPin));
                   
                   Utils.sleep(2);
               }

               case 5 -> {
                   System.exit(0);
               }
            }
        }
        
    }
}
