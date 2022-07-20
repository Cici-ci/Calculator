import java.util.Scanner;

public class Console {

    private static Scanner scanner;

    public static  double readNumber(String prompt){
        scanner=new Scanner(System.in);
        return scanner.nextDouble();

    }
    public static double readNumber(String prompt, double min, double max){
        scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max+10)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
