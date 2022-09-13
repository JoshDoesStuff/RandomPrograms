import java.util.Scanner;

public class Lesson1{
    

public static void main(String[] args) {
    
    int var2 = 0;
    System.out.println("Hello World");
    if(-1>0){
        //will do this
    }else if(-2>0){
        //will not do this
    }else{
        //will do this
    }

    while(var2<=10){
        System.out.println("var2 = " +  var2);

        var2 = var2+1;    
    }
    for (int i = 0; i<5; i++) {
        //will repeat 5 times
        System.out.println("i = " + i);
    }

    switch (2) {
        case 1:
            //will not do this
            System.out.println("case 1");
        break;

        case 2:
            //will do this
            System.out.println("case 2");
        break;

        case 3:
            //will not do this
            System.out.println("case 3");
        break;

        default:
            //will not do this
            System.out.println("default");
        break;
    }
    Scanner scanner = new Scanner(System.in);
        //creates a scanner in your program

        double var1 = scanner.nextDouble();
        //pauses the program and waits for a decimal number input in the console
        System.out.println("You Typed " + var1);

        int var3 = scanner.nextInt();
        //pauses the program and wait for a whole number input in the console
        System.out.println("You Typed " + var3);

        boolean var4 = scanner.nextBoolean();
        //pauses the program and waits for a T/F input in the console
        
        if (var4 == true) {
            System.out.println("You Typed True");
        }else if(var4 == false) {
            System.out.println("You Typed False");
        }else {
            System.out.println("How the hell did the enviroment accept that?");
        }

        String var5 = scanner.next();
        //pauses the program and waits for a text in put in the console
        System.out.println("You Typed: " + var5);
        System.out.println(squareThatNumber(9));
        printThatLineTwice("Bruh Moment");

}

public static void printThatLineTwice(String input){
    System.out.println(input);
    System.out.println(input);
}

public static int squareThatNumber(int input){
    int output = input*input;
    return output;
}
    
}