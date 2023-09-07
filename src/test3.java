import java.util.Random;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();

        if (username.equals("Anushka") && (password.equals("AnushkaBasnet"))) {
            System.out.println("Logged in");

            System.out.println("Now pick an operation");
            System.out.println("1. Calculator ");
            System.out.println("2. Guessing Game");
            System.out.println("3. SI Calculator");
            System.out.println("4. Vowel or Consonant");

            int i = sc.nextInt();

            if(i == 1) {

                System.out.println("CALCULATOR");
                System.out.println("The available operations are:'+','-','*','/'.");

                System.out.println("Enter your first number:");
                float x = sc.nextFloat();
                System.out.println("Enter your second number:");
                float y = sc.nextFloat();
                System.out.println("Enter your operation");
                String z = sc.next();

                switch (z) {
                    case "+":
                        double v = x + y;
                        System.out.println("The result is" + v);
                        break;
                    case "-":
                        v = x - y;
                        System.out.println("The result is" + v);
                        break;
                    case "*":
                        v = x * y;
                        System.out.println("The result is" + v);
                        break;
                    case "/":
                        v = x / y;
                        System.out.println("The result is" + v);
                        break;
                    default:
                        System.out.println("The input is invalid.");
                }
            } else if (i ==2) {
                System.out.println(" Guessing Game");
                System.out.println("Enter a number:");
                float j = sc.nextFloat();
                Random random = new Random();
                int randomNumber = random.nextInt(10);
                if (j == randomNumber){
                    System.out.println("Congratulations! Your guess is right. You win the prize!");

                }
                else {
                    System.out.println("Wrong Number, better luck next time");
                }


            } else if (i == 3) {


                System.out.println("SI calculator");
                double p, t, r, SI;
                System.out.println("Enter three values: ");
                System.out.println("Enter principle");
                p = sc.nextDouble();
                System.out.println("Enter time");
                t = sc.nextDouble();
                System.out.println("Enter rate");
                r = sc.nextDouble();
                SI = ((p * t * r) / 100);
                System.out.println("Simple interest is:" + SI);

            } else if (i==4) {
                System.out.println("Vowel Or Consonant");
                System.out.println("Enter alphabet: ");
                char alphabet = sc.next().charAt(0);
                switch (alphabet) {
                    case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
                    default -> System.out.println("Consonant");
                }
            }
        } else {
            System.out.println("Invalid");
        }

    }

}




