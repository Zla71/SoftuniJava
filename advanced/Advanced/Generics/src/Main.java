public class Main {
    public static void main(String[] args) {

        GenericClassExample<String> genericClassExampleString = new GenericClassExample<>();
        GenericClassExample<Integer> genericClassExampleInteger = new GenericClassExample<>();
        GenericClassExample<Double> genericClassExampleDouble = new GenericClassExample<>();

        genericClassExampleString.display("Zlati", "Gosho", "Pesho");
        genericClassExampleDouble.display(2.5, 6.6, 9.7);
        genericClassExampleInteger.display(5, 9, 10);


    }
}
