import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    int correctAnswerPoints = 5;
    int currentScore =0;
    Scanner scanner = new Scanner(System.in);
    Random randomize = new Random();
    int mathOperationChoser = randomize.nextInt();
    int number1 = randomize.nextInt(100);
    int number2 = randomize.nextInt(100);
    int correctAnswer = 1;
    int userAnswer = 0;

    public void start() {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        showFinalScore();

    }

    public void question1() {
        int numberOfAttemp = 1;
        int number1 = randomize.nextInt(100);
        int number2 = randomize.nextInt(100);
        correctAnswer = Calculator.add(number1, number2);

        for (int y = 0; y < numberOfAttemp; y++) {
            System.out.println("first number" + number1);
            System.out.println("Second number" + number2);
            System.out.println("Insert correct answer:" + number1 + "+" + number2 + "=");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Your answer ir right and you earned 5 points");
                currentScore = correctAnswerPoints + currentScore;
                break;
            } else {
                System.out.println("Your answer is wrong and you lost 5 points ");
                currentScore = currentScore - correctAnswerPoints;
            }

        }

    }

    public void question2() {
        int numberOfAttemp = 1;
        int number1 = randomize.nextInt(100);
        int number2 = randomize.nextInt(100);
        correctAnswer = Calculator.substract(number1, number2);

        for (int y = 0; y < numberOfAttemp; y++) {
            System.out.println("first number" + number1);
            System.out.println("Second number" + number2);
            System.out.println("Insert correct answer:" + number1 + "-" + number2 + "=");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Your answer ir right and you earned 5 points");
                currentScore = correctAnswerPoints + currentScore;
                break;
            } else {
                System.out.println("Your answer is wrong and you lost 5 points ");
                currentScore = currentScore - correctAnswerPoints;

            }

        }
    }

    public void question3() {
        int numberOfAttemp = 1;
        int number1 = randomize.nextInt(100);
        int number2 = randomize.nextInt(100);
        correctAnswer = Calculator.multiply(number1, number2);

        for (int y = 0; y < numberOfAttemp; y++) {
            System.out.println("first number" + number1);
            System.out.println("Second number" + number2);
            System.out.println("Insert correct answer:" + number1 + "*" + number2 + "=");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Your answer ir right and you earned 5 points");
                currentScore = correctAnswerPoints + currentScore;
                break;
            } else {
                System.out.println("Your answer is wrong and you lost 5 points ");
                currentScore = currentScore - correctAnswerPoints;
            }

        }
    }

    public void question4() {
        int numberOfAttemp = 1;
        int number1 = randomize.nextInt(100);
        int number2 = randomize.nextInt(100);
        correctAnswer = Calculator.divide(number1, number2);

        for (int y = 0; y < numberOfAttemp; y++) {
            System.out.println("first number" + number1);
            System.out.println("Second number" + number2);
            System.out.println("Insert correct answer:" + number1 + "/" + number2 + "=");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Your answer ir right and you earned 5 points");
                currentScore = correctAnswerPoints + currentScore;
                break;
            } else {
                System.out.println("Your answer is wrong and you lost 5 points ");
                currentScore = currentScore - correctAnswerPoints;

            }

        }
    }

    public void question5() {
        int numberOfAttemp = 1;
        int number1 = randomize.nextInt(100);
        int number2 = randomize.nextInt(100);
        correctAnswer = Calculator.substract(number1, number2);

        for (int y = 0; y < numberOfAttemp; y++) {
            System.out.println("first number" + number1);
            System.out.println("Second number" + number2);
            System.out.println("Insert correct answer:" + number1 + "-" + number2 + "=");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Your answer ir right and you earned 5 points");
                currentScore = correctAnswerPoints + currentScore;

                break;
            } else {
                System.out.println("Your answer is wrong and you lost 5 points ");
                currentScore = currentScore - correctAnswerPoints;
            }

        }
    }

    public void question6() {
        int numberOfAttemp = 1;
        int number1 = randomize.nextInt(100);
        int number2 = randomize.nextInt(100);
        correctAnswer = Calculator.add(number1, number2);

        for (int y = 0; y < numberOfAttemp; y++) {
            System.out.println("first number" + number1);
            System.out.println("Second number" + number2);
            System.out.println("Insert correct answer:" + number1 + "+" + number2 + "=");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Your answer ir right and you earned 5 points");
                currentScore = correctAnswerPoints + currentScore;

                break;
            } else {
                System.out.println("Your answer is wrong and you lost 5 points ");
                currentScore = currentScore - correctAnswerPoints;

            }

        }
    }

    public void showFinalScore() {
        System.out.println("Congratulation you have beaten this quiz, your final Score: " +currentScore);

    }
}












