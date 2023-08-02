import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int number1 = random.nextInt(1, 100);
        int number2 = random.nextInt(1, 100);

        System.out.println("Insert correct answer: " + number1 + "+" + number2 + "=");
        int userAnswer = scanner.nextInt();
        int correctAnswer = number1 + number2;


        while (userAnswer != correctAnswer) {
            System.out.println("Your answer: " + userAnswer + " Correct answer : " + correctAnswer);
            number1 = random.nextInt(1,100);
            number2 = random.nextInt(1,100);
            correctAnswer = number1 + number2;
            System.out.println(" Insert correct answer:"  +number1  +  "+" + number2 + "=");
            userAnswer = scanner.nextInt();

        }

        System.out.println("Congarulations, you have beaten this quiz!");


    }
}







