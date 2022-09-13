import static java.lang.Math.sqrt; 
import java.util.Scanner;

public class Calculator{



public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Square/SquareRoot or Basic Operations?");
    System.out.println("S for Sqr/Sqrt,B for Basic");
    String type = scanner.next();
    switch (type) {
    case "S":
        System.out.println("Input Number");
        float SNum = scanner.nextFloat();
        System.out.println("Square or SquareRoot?");
        System.out.println("Sqr for Square, Root for SquareRoot");
        String SqrOrRoot = scanner.next();
        switch (SqrOrRoot) {
        case "Sqr":
            System.out.println(SNum*SNum);
        break;
        case "Root":
            double RootOutput = sqrt(SNum);
            System.out.println(RootOutput);
        break;
        }

    break;

    case "B":
        System.out.println("Input First Number");
        float num1 = scanner.nextFloat();
        System.out.println("Input Second Number");
        float num2 = scanner.nextFloat();
        System.out.println("Input Operation");
        System.out.println("+,-,*,/");
        String operation = scanner.next();
        switch (operation) {
        case "+":
                System.out.println(num1+num2);
        break;
        
        case "-":
            System.out.println(num1-num2);
        break;

        case "*":
            System.out.println(num1*num2);
        break;

        case "/":
            System.out.println(num1/num2);
        break;
        }
    break;
    

}
}
}