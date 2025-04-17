package ListAmount;

import java.util.ArrayList;

public class List {
    private String name;
    private int size;
    private ArrayList<String> classList;
    private int initialSize;


    public List(String name, int size) {
        this.setName(name);
        this.setSize(size);
        this.classList = new ArrayList<>(size);
        this.initialSize = size;
    }

    private void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("You must give a name of this list!");
        }
        this.name = name;
    }

    private void setSize(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("This list must have size more than 0!");
        } else if (size >= 6) {
            System.out.println("Objects in list:");
            for (String object : this.classList) {
                System.out.println(object);
            }
            this.actualListInformationException();
            throw new IllegalArgumentException("You reached the maximum capacity of this list!%n You can't go beyond size of 6!");
        }
        this.size = size;
    }


    public void getListObjects() {
        for (String object : this.classList) {
            System.out.println(object);
        }
    }

    public void putInfoInList(String object) {
        this.loadInfoInList(object);
        this.checkListSize(object);
    }

    private void loadInfoInList(String object) {
        System.out.printf("Loading %s to %s%n", object, this.name);
        this.classList.add(object);
    }

    private void checkListSize(String object) {
        if (this.classList.size() > this.size) {
            this.setSize(this.size + 1);
            System.out.printf("There is not space for %s!%n".formatted(object));
            System.out.println("The list is growing the size + 1!");
        }
    }



    public void actualListInformation() {
        System.out.printf("Actual information about the list.%nList size of %s is %d with maximum capacity of %d%n", this.name, this.classList.size(), this.size);
    }

    private void actualListInformationException() {
        System.out.printf("Actual information about the list.%nList size of %s is %d with maximum capacity of %d%n", this.name, this.classList.size(), this.classList.size());
    }

    public String toString() {
        return "Initial information about the list.%nThis list is called %s with initial maximum capacity of %d".formatted(this.name, this.initialSize);
    }
}
