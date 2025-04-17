import java.util.Collections;

public class MainLists {
    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>(5);

        randomList.add("5");
        randomList.add("2");
        randomList.add("1");
        randomList.add("4");

        System.out.println(randomList);

    }
}
