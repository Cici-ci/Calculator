public class Main {
    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Enter wwwte principal:", 100, 10000);
        float annualInterest = (float) Console.readNumber("Enter the Annual Interest Rate:", 1, 10);
        int years = (int) Console.readNumber("Enter the period:", 1, 100);
        double mortgage= CalculateReoport.calculatorMortgage(principal,annualInterest,years);
        Print.print((mortgage));

        double balance= CalculateRepoter.calculatorBalance(principal,annualInterest,years);
        Print.print(balance);
    }

}





