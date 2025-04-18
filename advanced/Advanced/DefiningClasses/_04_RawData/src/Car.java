public class Car {

    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire tire;

    public Car(String model, Engine engine, Cargo cargo, Tire tire) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tire = tire;
    }

    public String getModel() {
        return model;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tire getTire() {
        return tire;
    }

    public Engine getEngine() {
        return engine;
    }
}
