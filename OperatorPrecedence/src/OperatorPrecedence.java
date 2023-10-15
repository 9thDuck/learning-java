public class OperatorPrecedence {
    public static void main(String[] args) {
        double numOne= 20.00D;
        double numTwo = 80.00D;
        double sumAndProduct = (numOne + numTwo) * 100D;
        double remainderOfSumAndProduct = sumAndProduct % 40.00D;
        System.out.println("remainder --> " + remainderOfSumAndProduct);
        boolean hasNoRemainder = remainderOfSumAndProduct == 0;
        if(!hasNoRemainder){
            System.out.println("Got some remainder");
        } else {
            System.out.println("Remainder is zero");
       }
    }
}
