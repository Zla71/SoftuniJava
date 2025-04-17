public class Lion extends Animal {

    private String maneColor; // цвят на грива

    public Lion(String name, int age, String maneColor) {

        // super винаги стои на първият ред от конструктора
        super(name, age);
        this.setManeColor(maneColor);
    }

    private void setManeColor(String maneColor) {
        //VALIDATION
        this.maneColor = maneColor;
    }

    @Override
    public void eat() {
        System.out.printf("The %s %s is eating meat.%n", this.getClass().getName().toLowerCase(), this.getName());
    }

    public void roar() {
        System.out.printf("Lion %s roars now.%n", super.getName());
    }
}
