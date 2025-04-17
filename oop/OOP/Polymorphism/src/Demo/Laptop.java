package Demo;

public class Laptop extends Computer implements Device{


    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    public void open() {
        System.out.println("Opening " + getClass().getSimpleName().toLowerCase());
    }

    public void close() {
        System.out.println("Closing " + getClass().getSimpleName().toLowerCase());
    }
}
