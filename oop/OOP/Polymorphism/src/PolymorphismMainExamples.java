import Demo.Computer;
import Demo.Device;
import Demo.Laptop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolymorphismMainExamples {
    public static void main(String[] args) {

        // polymorphism - много форми

        // дава ни възможност да взмем предмет и да го разгледаме в различни форми спрямо контекста, в който се намира
        // вземаме един обект в Java и се обръщам към него по различен начин

        // ПРАВИЛО: всеки обект може да заема форма на тип от бащин клас

        // всеки един обект може да бъде трениран като обект от своите бащини класове

        // примери в пакет Demo

        // при полиморфизма се използват методите, които са характерни за референтните типове(формите)
        Laptop laptopOne = new Laptop(); // форма Laptop, използва методите на класа Laptop
        Computer laptopTwo = new Laptop(); // форма Computer, използва методите на класа Computer
        Object laptopThree = new Laptop(); // форма Object, използва методите на класа Object
        Device laptopDevice = new Laptop(); // форма Device, използва методите на класа Device


        // два типа, с които работим:
        // 1. референтен/форма (това е необходимо на програмиста и на компилатора)
        // 2. реален тип на обекта (това е необходимо на JVM - Java Virtual Machine)

        // форма              реален тип
        Computer compLaptop = new Laptop();


        // използване на високо ниво на абстракция - използване на бащини класове
        List<Integer> numbers = new ArrayList<>();

        // 1000 реда код

        numbers = new LinkedList<>();


        // ако искаме да използваме метода open() на лаптопа трябва да се cast-не, но Tablet и SmartPhone класовете нямат метод open()
        // преди да извършим cast-не трябва да проверим дали обекта е инснтанция на класа, към който ще кастваме

//        if (computer instanceof Laptop) {
//            ((Laptop) computer).close();
//        }


        // типове полиморфизъм

        // 1. Runtime Polymorphism - Overriding
        // Java преценява коя емплементация на метод да изпълни
        // полиморфизъм при методите се среща, когато при бащиният клас се дефинира метод, но в дъщерният клас се променя поведението му
        // Runtime Polymorphism - динамичен полиморфизъм е метода @Override

        // 2. Compile time Polymorphism - Overloading
        // различни версии на един и същ метод
        // method overloading - възможността да имаме метод с едно и също име, но с различни с различен брой/вид аргументи и различен return
        // задача package MathOperation


        // абстрактни класове
        // 1. не може да се инстанцира
        // 2. слага се думичкатра abstract
        // 3. абстрактният клас се създава за общо поведение на всички класове, които го наследяват

        // кастване на променлива и проверка
        // if (cat isInstanceOf Lion)



    }
}