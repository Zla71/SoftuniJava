public class Giraffe extends Animal {

    private int neckLength; // дължина на шия

    public Giraffe(String name, int age, int neckLength) {
        super(name, age);
        this.setNeckLength(neckLength);
    }

    private void setNeckLength(int neckLength) {
        this.neckLength = neckLength;
    }

    public String info() {
        return super.toString();
    }
}
