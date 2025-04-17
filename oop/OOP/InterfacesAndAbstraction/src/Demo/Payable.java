package Demo;

// интерфейс - съвкупност от методи без имплементация, които ще могат да извършват нашите класове в последствие
// интерфейс = договор
// definition - какво може да прави един метод
// implementation - как се извършва дадено действие
//
public interface Payable extends Cashable {

    // 1. статични полета, които имат стойност
    public static int MAX_BANK_ACCOUNTS = 5;


    // 2. абстрактни методи - дефиниция на метод
    public abstract boolean payWIthCard(int productCost, int cardBalance);

    // интерфейса може да има дефолтен метод
    default void paid() {
        System.out.println("Bill is paid");
    }

    static void beginning() {
        System.out.println("Payment method is started");
    }

}
