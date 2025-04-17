package BirthdayCelebrations;

public class Robot implements Identifiable {
    String id;
    String model;

    public Robot(String id, String model) {
        this.setId(id);
        this.setModel(model);
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String toString() {
        return String.format("Robot %s %s" , this.getId(), this.getModel());
    }

}
