import java.util.*;

public class atmminiproject {
    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;

        int addAmount = 0;
        int takeAmount = 0;

        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin number ");

        int password = scanner.nextInt();

        if (password == pin) {
            System.out.println("Enter your name ");
            name = scanner.next();
            System.out.println("Welcome " + name);
            while (true) {
                System.out.println("Press 1 to check your balance ");
                System.out.println("Press 2 to add amount  ");
                System.out.println("Press 3 to take amount ");
                System.out.println("press 4 to take receipt ");
                System.out.println("press 5 to exit ");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("your current balance is " + balance);

                        break;
                    case 2:
                        System.out.println("How much you want to add  your bank account ");
                        addAmount = scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance = addAmount + balance;
                        break;
                    case 3:
                        System.out.println("How much did you want to take");
                        takeAmount = scanner.nextInt();
                        if (takeAmount > balance) {
                            System.out.println("Insufficient balance");
                            System.out.println("try less than current account balance");
                        } else {
                            System.out.println("successfully taken");
                            balance = balance - takeAmount;

                        }
                        break;
                    case 4: {
                        System.out.println("welcome ");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount deposited " + addAmount);
                        System.out.println("amount taken " + takeAmount);
                        System.out.println("Thanks for coming ");

                    }
                        break;
                    default:
                        System.out.println("press the number below 5");
                        break;
                }
                if (opt == 5) {
                    System.out.println("Thankyou");
                    break;
                }
            }
        } else {
            System.out.println("Wrong pin number ");
        }

    }
}