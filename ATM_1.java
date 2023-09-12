import java.util.Scanner;
public class ATM_1
{
    public static void main(String[] args)
    {
        int balance = 1000, withdraw, deposit;
        Scanner input = new Scanner(System.in);
        while (true)
        {
            System.out.println("!!!!Automated Teller Machine!!!!");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for deposit");
            System.out.println("Choose 3 for check_balance");
            System.out.println("Choose 4 to EXIT");
            System.out.println("Choose the option that want to perform:");
            int choice = input.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter the money that to be withdrawn.");
                    withdraw = input.nextInt();
                    if (balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your cash.." + withdraw);
                    }
                    else
                    {
                        System.out.println("insufficient balance.." + balance);
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    deposit = input.nextInt();
                    balance = deposit + balance;
                    System.out.println("Your money has been successfully deposited:");
                    System.out.println("your new balance is:" + balance);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Your balance:" + balance);
                    System.out.println(" ");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
