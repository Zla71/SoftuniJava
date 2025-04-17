package Demo;

public class SystemTwo implements Payable, Discountable{
    @Override
    public boolean payWIthCard(int productCost, int cardBalance) {

        // other implementation

        return false;
    }

    @Override
    public void payWithCash() {
        System.out.println("Give me the cash bro..");
    }

    @Override
    public void generateDiscountCode() {
        System.out.println("CODE-PROMO");
    }
}
