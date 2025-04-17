import Demo.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExamplesReflectionAndAnnotation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        // благодарения на Reflection можем да достъпваме информацията до даден клас, методите му, полетата му и конструкторите му

        // вземам достъп до информацията на класа Demo.Person
        // има ли такъв клас? търсим по име
        Class personClass = Class.forName("Demo.Person");

        // дава името на класа + пакета
        System.out.println("getName() " + personClass.getName());

        // дава името на класа
        System.out.println("getSimpleName() " + personClass.getSimpleName());

        // бащин клас
        System.out.println("Inherits: " + personClass.getSuperclass().getSimpleName());

        // дай ми интерфейсите на този клас
        Class[] interfaces = personClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("Interface: " + anInterface.getName());
        }


        System.out.println("-------------------");

        // declared - всичко
        // като няма declared - само public
        Field[] fields = personClass.getDeclaredFields();

        for (Field field : fields) {
            String fieldName = field.getName();
            Object fieldType = field.getType();
            System.out.println("Type " + fieldType + ", Name " + fieldName);
        }

        Person person = new Person("Gosho");
        Field field = personClass.getDeclaredField("name");
        System.out.println();

        // полето name e private
        field.setAccessible(true);

        // вземам стойността на private полето name
        System.out.println("Class Demo.Person, Instance person, private field name holds value of: " + field.get(person));

        // променям стойността на private полето name
        field.set(person, "Zlati");
        System.out.println("The changed value of private field: " + field.get(person));


        System.out.println("-------------------");

        Method[] methods = personClass.getDeclaredMethods();

        for (Method method : methods) {
            String methodName = method.getName();
            Object methodReturnType = method.getReturnType();
            System.out.println("Method name: " + methodName + ", method returns: " + methodReturnType);
        }

        System.out.println("-------------------");

        Class[] classes = personClass.getDeclaredClasses();

        for (Class currentClass : classes) {
            String className = currentClass.getName();
            Object classType = currentClass.getComponentType();
            System.out.println(className + " " + classType);
        }

        System.out.println("-------------------");

        Constructor[] constructors = personClass.getConstructors();

        for (Constructor constructor : constructors) {
            String constructorName = constructor.getName();
            Object constructorType = constructor.getTypeParameters();
            System.out.println("Constructor: " + constructorName + " " + constructorType);
        }

        // в една променлива запазих референция за конструктор на класа Demo.Person

        // ако конструктора е public се достъпва така
        Constructor<Person> personConstructor = (Constructor<Person>) personClass.getDeclaredConstructor(String.class);

        // ако конструктора е private можем да го достъпим така временно
        personConstructor.setAccessible(true);

        Person zlati = personConstructor.newInstance("Zlati"); // new Demo.Person("Zlati)
        System.out.println(zlati);


    }
}