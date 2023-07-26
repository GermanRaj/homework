import java.util.Random;
public class Calculator {

    public int varNumber =0;



    public Calculator(int number) {
        this.varNumber = number;
    }
    Random randomize = new Random();
    int number1 = randomize.nextInt(0,100);
    int number2 = randomize.nextInt(0,100);


    public void addMethod() {

        System.out.println("First Number -  " + number1 + "  " + "Second Number - " + number2 );
        int summOftwoNumbers = number1 + number2;
        System.out.println("Summ of two numbers = " +summOftwoNumbers);

    }

    public void substractMethod(){

        int substractOftwoNumbers = number1 / number2;
        System.out.println("Substraction of two numbers = " +substractOftwoNumbers);
    }

    public void multiplyMethod(){

        int multiplyOftwoNumbers = number1 * number2;
        System.out.println("Multiply of two numbers = " +multiplyOftwoNumbers);
    }
    public void divideMethod() {

        int divideOftwoNumbers = number1 / number2;
        System.out.println("Divide of two numbers = " + divideOftwoNumbers);
    }


    }













