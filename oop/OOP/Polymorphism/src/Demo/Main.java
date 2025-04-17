package Demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // {форма} променлива = {обект}
        Object computer = new Computer();

        // един обект го разглеждаме по различен начин, защото тези типове данни имат общо помежду си
        // един обект от класа Laptop можем да го третираме като Laptop, Computer или Object, както и класовете, които имплементират - Device
        Laptop laptopOne = new Laptop();
        Computer laptopTwo = new Laptop();
        Object laptopThree = new Laptop();
        Device laptopDevice = new Laptop();

        // не може да се прилага, ако нямат нищо общо
        // --->>>  Computer animal = new Animal();  <<<--- xxx xxx xxx

        // --------------------------------------------------------------------------------------

        // Person IS-A Person връзка
        Person person = new Person();

        // Person IS-A Mammal връзка
        Mammal personMammal = new Person();

        // Person IS-AN Animal връзка
        Animal personAnimal = new Person();

        // Person IS-AN Object връзка
        Object personObject = new Person();

        // --------------------------------------------------------------------------------------

        // List ще го третираме като ArrayList
        List<Integer> list = new ArrayList<>();

        // List го третираме като LinkedList
        List<Integer> listOne = new LinkedList<>();

        // --------------------------------------------------------------------------------------

        Computer laptopComp = new Laptop();
        Computer smartPhoneComp = new SmartPhone();
        Computer tabletComp = new Tablet();

        // можем да използваме обектие от лаптоп, смартфон и таблет да се свържат с интернет само с един метод,
        // защото наследяват компютър
        makeComputerInternetConnection(laptopComp);
        makeComputerInternetConnection(smartPhoneComp);
        makeComputerInternetConnection(tabletComp);

    }

    // използваме полиморфизъм в този метод, по-високо ниво на абстракция
    public static void makeComputerInternetConnection(Computer computer) {

        // ако искаме да използваме метода open() на лаптопа трябва да се cast-не, но Tablet и SmartPhone класовете нямат метод open()
        // преди да извършим cast-не трябва да проверим дали обекта е инснтанция на класа, към който ще кастваме
        if (computer instanceof Laptop) {
            ((Laptop) computer).open();
        }

        computer.establishInternetConnection();

        // ако искаме да използваме метода open() на лаптопа трябва да се cast-не, но Tablet и SmartPhone класовете нямат метод open()
        // преди да извършим cast-не трябва да проверим дали обекта е инснтанция на класа, към който ще кастваме
        if (computer instanceof Laptop) {
            ((Laptop) computer).close();
        }
        System.out.println();

    }

}
