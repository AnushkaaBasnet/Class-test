import java.util.Random;
import java.util.Objects;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Username:");
        String username = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();
        int b;
        if (Objects.equals(username, password)) {

            System.out.println("Enter a Number");
            System.out.println("1.Calculator");
            System.out.println("2.Guessing Game");
            System.out.println("3. SI Calculator");
            System.out.println("4. Vowel or Consonant");
            b = sc.nextInt();
            if (b == 1) {
                System.out.println("Calculator");
                double num1, num2, result;
                String operator;
                System.out.println("enter 2 num:");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                System.out.println("enter an operator(+,-,*,/");
                operator = sc.next();


                switch (operator) {
                    case "+" -> {
                        result = num1 + num2;
                        System.out.println(result);
                    }
                    case "-" -> {
                        result = num1 - num2;
                        System.out.println(result);
                    }
                    case "*" -> {
                        result = num1 * num2;
                        System.out.println(result);
                    }
                    case "/" -> {
                        result = num1 / num2;
                        System.out.println(result);
                    }
                }
            } else if (b == 2) {
                System.out.println("Guessing Game");
                float d = sc.nextFloat();
                Random random = new Random();
                int rk = random.nextInt(10);
                if (d == rk) {
                    System.out.println("Congratulations! You're guess is right");

                } else {
                    System.out.println("Better luck next time");
                }


            } else if (b==3) {
                System.out.println("SI Calculator");
                double P, T, R, SI;
                System.out.println("enter principle:");
                P = sc.nextDouble();
                System.out.println("enter time:");
                T = sc.nextDouble();
                System.out.println("enter rate:");
                R = sc.nextDouble();
                SI = ( P * T * R) / 100;
                System.out.println(SI);
            } else if (b==4) {
                System.out.println("Vowel or Consonant");
                System.out.println("enter a letter:");
                String letter = sc.next();
                switch (letter) {
                    case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" -> System.out.println("Vowel");
                    default -> System.out.println("Consonant");
                }
            }else {
                System.out.println("Invalid");
            }
        }
    }
}

