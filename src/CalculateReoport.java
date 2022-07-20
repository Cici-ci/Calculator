public class CalculateReoport {
    int principal = (int) Console.readNumber("Enter the principal:", 100, 10000);
    float annualInterest = (float) Console.readNumber("Enter the Annual Interest Rate:", 1, 10);
    int years = (int) Console.readNumber("Enter the period:", 1, 100);
    public  static double calculatorMortgage(int principal, float annualInter, int years){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        float monthlyInterest = annualInter / MONTHS_IN_YEAR / PERCENT;
        int NumberOfPayment=years*MONTHS_IN_YEAR;
        double mortgage=principal*monthlyInterest*Math.pow((1+monthlyInterest),NumberOfPayment)/
                        (Math.pow((1+monthlyInterest),NumberOfPayment)-1);
        return mortgage;
        }

}
