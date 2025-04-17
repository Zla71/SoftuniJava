public class DefineClassesExamples {
    public static void main(String[] args) {

        CarExample audi = new CarExample();

        audi.brand = "Audi";
        audi.model = "a1";
        audi.horsePower = 150;
        System.out.println(audi.brand);
        audi.drive();

        // имаме достъп до този метод, защото е public, но той ще промени private променливата owner от класа Car
        audi.setOwnerName("Pesho");

        // имаме достъп до публичният метод, който принтира private променлива
        System.out.println(audi.getOwnerName());
    }
}
