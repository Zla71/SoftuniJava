// клас - шаблон
public class CarExample {

    // полета - характеристики
    // {модификатор за достъп} {тип данни} {име}
    // модификатор за достъп:
    // public - навсякъде мога да достъпвам това поле
    // private - само в рамките на класа мога да достъпвам това поле (ПО-ПРАВИЛНО)
    public String brand;
    public String model;
    public int horsePower;
    private String owner;

    // статична променлива, която може да се достъпва с името на класа
    public static String text = "Cars";


    // методи - поведение
    public void drive() {
         System.out.println("Car is moving");
    }

    // с този метод давам контрол на достъп до това на поле
    public String getOwnerName() {

        // така може да се достъпи private променлива извън класа
        return this.owner;
    }

    public void setOwnerName(String name) {
        // this - достъп до обекта, който извиква този метод
        this.owner = name;
    }

    public String toString() {
        return "This is car with model " + this.model;
    }

    public static void horn() {
        System.out.println("Beep, beep!");
    }

    public static void main(String[] args) {

        CarExample audi = new CarExample(); // създава се празен обект от класа Car
        audi.brand = "Audi";
        audi.model = "a1";
        audi.horsePower = 150;
        System.out.println(audi.brand);
        audi.drive();

        audi.setOwnerName("Gosho");
//        audi.owner = "Gosho";

        System.out.println(audi.getOwnerName());

        System.out.println();
        CarExample bmw = new CarExample(); // създава се празен обект от класа Car
        bmw.brand = "BMW";
        bmw.model = "740i";
        bmw.horsePower = 350;
        System.out.println(bmw.brand);
        bmw.drive();

        // всеки метод, който идва от най-главният клас (Object) - тези методи имат поведение по подразбиране
        // но ние също можем да си имплементираме такъв метод, както горе
        System.out.println(bmw.toString());

        System.out.println(bmw.equals(audi));

        // достъпвам статичният метод без инстанция
        CarExample.horn();

        // достъпвам статичната променлива с името на класа
        System.out.println(CarExample.text);
    }
}


