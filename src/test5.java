import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();
        if (Objects.equals(username, password)) {

            System.out.println("Choose a program");
            System.out.println("1=Calculator");
            System.out.println("2=GuessingGame");
            System.out.println("3=SI Calculator");
            System.out.println("4=Vowel or Calculator");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println("\t\t\t\t\t\t\t\tCalculator\t\t\t\t\t\t\t\t");
                System.out.println(" Operators: '+' '-' '/' '*'");
                System.out.print("Enter one number: ");
                float b = sc.nextFloat();
                System.out.print("Enter the operation: ");
                char operation = sc.next().charAt(0);
                System.out.print("Enter 2nd number: ");
                float c = sc.nextFloat();
                double result;
                switch (operation) {
                    case '+':
                        result = b + c;
                        System.out.println("The result is " + result);
                        break;
                    case '-':
                        result = b - c;
                        System.out.println("The result is " + result);
                        break;
                    case '*':
                        result = b * c;
                        System.out.println("The result is " + result);
                        break;
                    case '/':
                        result = (int) b / c;
                        System.out.println("The result is" + result);
                    default:
                        System.out.println("Invalid operation was entered");
                }

            } else if (a==2) {
                System.out.println("The Guessing Game");
                float d = sc.nextFloat();
                Random random = new Random();
                int rk = random.nextInt(10);
                if (d == rk) {
                    System.out.println(" You're guess is correct");

                } else {
                    System.out.println("Better luck next time");
                }

            } else if (a==3) {
                System.out.println("The SI Calculator");
                System.out.println("Enter principle");
                float P = sc.nextFloat();
                System.out.println("Enter Rate");
                double R = sc.nextDouble();
                System.out.println("Enter Time:");
                double T = sc.nextDouble();
                double SI = (P * T * R) / 100;
                System.out.println("The SI is :" + SI);

            } else if (a==4) {
                System.out.println("Enter a Letter");
                String letter = sc.next();
                switch (letter) {
                    case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" -> System.out.println("Vowel");
                    default -> System.out.println("Consonant");
                }
            }

        }else {
            System.out.println("Invalid");
        }


    }

}
