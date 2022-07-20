import java.text.NumberFormat;

public class Print {
    public static void print(double word){
        String mortgageFormatted= NumberFormat.getCurrencyInstance().format(word);
        System.out.println("Mortgage "+mortgageFormatted);
        System.out.println("---");
    }
}
