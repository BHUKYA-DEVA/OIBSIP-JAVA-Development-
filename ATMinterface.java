import java.util.Scanner;

public class ATMinterface {
    public static void main(String[] args) {
        int balance = 400000;
        int withdraw = 0;
        int deposit = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("--------WELCOME TO ATM-----------");
            System.out.println("---------------------------------");
            System.out.println("option 1:WITHDRAW");
            System.out.println("option 2:DEPOSIT");
            System.out.println("option 3:CHECK BALANCE");
            System.out.println("option 4:EXIT");
            System.out.println("choose any option from the above:------------");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("ENTER WITHDRWAL AMOUNT");
                    withdraw = sc.nextInt();
                    if (balance < withdraw) {
                        System.out.println("SORRY INSUFFICIENT BALANCE ");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("SUCCESSFULLY WITHDRAW");

                    }
                    System.out.println("---------------------------------");
                    break;
                case 2:

                    System.out.println("ENTER DEPOSIT AMOUNT");
                    deposit = sc.nextInt();
                    balance = balance + withdraw;
                    System.out.println("SUCCESFULLY DEPOSITED ");
                    System.out.println("---------------------------------");
                    break;

                case 3:
                    System.out.println("YOUR ACCOUNT BALANCE IS :" + balance);
                    System.out.println("---------------------------------");
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("PLEASE ENTER VALID OPTION");
            }

        }

    }

}
