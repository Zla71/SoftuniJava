package Demo;

public class MainDemo {
    public static void main(String[] args) {

        SystemOne systemOne = new SystemOne();

        boolean resultOne = systemOne.payWIthCard(12, 200);
        System.out.println(resultOne);

        SystemTwo systemTwo = new SystemTwo();
        boolean resultTwo = systemTwo.payWIthCard(55, 200);
        System.out.println(resultTwo);

        systemOne.payWithCash();

        System.out.println(systemOne.MAX_BANK_ACCOUNTS);
        System.out.println(systemTwo.MAX_BANK_ACCOUNTS);

        systemOne.payWithCash();
        systemTwo.payWithCash();

        // класовете имплементират няколко интерфейса
        systemTwo.generateDiscountCode();
        systemOne.generateDiscountCode();

        // интерфейса Payable има дефолтен метод, който е наследен от класовете SystemOne & SystemTwo
        // дефолтните методи се наследяват надолу по веригата, класовете, които имплементират интерфейсите
        systemOne.paid();
        systemTwo.paid();

        // интерфейса може да има и статичен метод
        // статичните методи в интерфейса се извикват без инстанция, както навсякъде
        // статичните методи остават само в интерфейсите, не се наследяват надолу по класовете, които имплементират интерфейса
        Payable.beginning();

    }
}
