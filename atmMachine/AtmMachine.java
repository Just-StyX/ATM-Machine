package atmMachine;
import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        try (
                Scanner input = new Scanner(System.in)) {
            int[] ids = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            Account[] accounts = new Account[ids.length];

            for (int i = 0; i < ids.length; i++) {
                accounts[i] = new Account(ids[i], 100);
            }

            boolean keepon = true;
            while (keepon) {
                System.out.print("Enter an id: ");
                int id = input.nextInt();

                boolean check = false;

                for (int element : ids) {
                    if (element == id) {
                        check = true;
                        break;
                    }
                }

                if (check) {
                    boolean exit = false;
                    while (!exit) {
                        System.out.println("Main menu");
                        System.out.println("------------------------");
                        System.out.println("1: check balance");
                        System.out.println("2: withdraw");
                        System.out.println("3: deposit");
                        System.out.println("4: exit");
                        System.out.println("------------------------");
                        System.out.print("Enter a choice: ");
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.println("The balance is: " + accounts[id].getBalance());
                            case 2 -> {
                                System.out.print("Enter an amount to withdraw: ");
                                double withdraw = input.nextDouble();
                                accounts[id].withdraw(withdraw);
                            }
                            case 3 -> {
                                System.out.print("Enter an amount to deposit: ");
                                double deposit = input.nextDouble();
                                accounts[id].deposite(deposit);
                            }
                            case 4 -> exit = true;
                        }
                    }
                } else {
                    System.out.println("Enter an appropriate id");
                }
            }
        }
    }
}
