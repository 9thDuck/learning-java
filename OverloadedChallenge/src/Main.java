public class Main {
    public static void main(String[] args) {

        convertToCentimeters(5, 4);

    }

    public static double convertToCentimeters(int inches) {
        return (double) (inches * 2.54d);
    }
    public static void convertToCentimeters(int feet, int inches){
    int totalInches = (feet * 12) + inches;

    double totalInchesInCentimeters = convertToCentimeters(totalInches);

    System.out.println(feet + " feet " + inches + " inches = " + totalInchesInCentimeters + " centimeters.");
    }
}
