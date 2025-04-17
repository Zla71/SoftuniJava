package School;



public class Main {
    public static void main(String[] args) {

        // веднъж зададено името Гошо то не може да бъде променено
        Person gosho = new Person("Gosho", "gosho@gmail.com");

        System.out.println(gosho.getName());

    }
}
