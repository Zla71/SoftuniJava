package ListAmount;

public class Main {

    public static void main(String[] args) {
        String listName = "My List";
        int listSize = 1;

        List list = new List(listName, listSize);

        System.out.println(list);

        System.out.println();

        list.putInfoInList("Zlatio");
        list.putInfoInList("Gosho");
        list.putInfoInList("Pesho");
        list.putInfoInList("Vancho");
        list.putInfoInList("Stancho");
        list.putInfoInList("Gancho");
        list.putInfoInList("Pencho");
        list.putInfoInList("Vasko");

        System.out.println();
        list.actualListInformation();

        System.out.println();
        System.out.println("All objects in list:");
        list.getListObjects();

        System.out.println();
        System.out.println(list);


    }
}
