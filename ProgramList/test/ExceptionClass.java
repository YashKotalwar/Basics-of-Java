package test;

public class ExceptionClass {
    public static void main(String[] args){
        int withdrawAmount = 5000;
        int currentBalance = 1000;

        try {
            if (withdrawAmount>currentBalance){
                throw new ArithmeticException("Insufficient Balance");
            }
            currentBalance = currentBalance - withdrawAmount;
            System.out.println("Transaction Successfully"+currentBalance);
        }catch (ArithmeticException e){
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Program Continue");
        }
    }
}
