public class CalculateRepoter {
    public  static double calculatorBalance(int principal, float annualInter, int years){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        float monthlyInterest = annualInter / MONTHS_IN_YEAR / PERCENT;
        int numberOfPayment=years*MONTHS_IN_YEAR;
        double p=principal* monthlyInterest
                *Math.pow((1+monthlyInterest),numberOfPayment)
                /(Math.pow((1+monthlyInterest),numberOfPayment)-1);;
        double balance=principal*
                (Math.pow((1+monthlyInterest),numberOfPayment) - Math.pow((1+monthlyInterest),p))
                /(Math.pow((1+monthlyInterest),numberOfPayment)-1);
        return balance;
    }
}
