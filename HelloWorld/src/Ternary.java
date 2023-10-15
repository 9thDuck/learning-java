public class Ternary {
    public static void main(String[] args) {
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        String s= isDomestic ? "This car is domestic!" : "This car is not domestic!";
        System.out.println(s);
    }
}
