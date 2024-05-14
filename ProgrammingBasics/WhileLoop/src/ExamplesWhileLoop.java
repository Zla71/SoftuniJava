public class ExamplesWhileLoop {
    public static void main(String[] args) {

        //////////////////////////////////////////////////////////

        String testing = "qwdasd213";
        System.out.println(testing.matches("[A-Za-z0-9]+"));

        //////////////////////////////////////////////////////////

        double sum = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(sum); // 0.9999999999999999

        // floating point precision error
        // IEEE 754 standard

        // solution

        // - using different type of data (BigDecimal)
        // - Rounding - Math.round(...);

        System.out.println(Math.round(sum));

        //////////////////////////////////////////////////////////


    }
}