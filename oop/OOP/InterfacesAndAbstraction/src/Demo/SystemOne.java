package Demo;


// правило - когато един клас иска да плементира интерфейс, той е задължен да даде имплементация на всички методи на интерфейса

// един клас може да имплементира няколко интерфейса
public class SystemOne implements Payable, Discountable{

    @Override
    public boolean payWIthCard(int productCost, int cardBalance) {

        if (productCost > cardBalance) {
            return false;
        } else {
            return true;
        }
    }

    // класа може да си и свои методи
    public void payWithCash() {
        System.out.println("Pay with cash bro..");
    }

    @Override
    public void generateDiscountCode() {
        System.out.println("PROMOCODE");
    }

    @Override
    public double getSum() {
        return 20;
    }
}
