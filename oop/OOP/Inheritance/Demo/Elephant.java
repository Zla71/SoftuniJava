public class Elephant extends Animal {

    private int trunkLength; // дължина на хобот

    public Elephant(String name, int age, int trunkLength) {

        // бащиният конструктор очаква 2 стойности String name, int age
        super(name, age);
        this.setTrunkLength(trunkLength);
    }

    @Override
    public void setAge(int age) {
        if (age > 100) {
            String message = String.format("The age of %s should be less or equal to 100.", this.getClass().getName().toLowerCase());
            throw new IllegalArgumentException(message);
        }
        this.age = age;
    }

    private void setTrunkLength(int trunkLength) {
        this.trunkLength = trunkLength;
    }

    public String toString() {
        return String.format("%s %s is %d years old and has %d meters long trunk.", this.getClass().getName(), this.getName(), this.getAge(), this.trunkLength);
    }

}
