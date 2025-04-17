import java.util.*;

public class SetsMapsAdvancedExamples {
    public static void main(String[] args) {
        // създаване на HashSet
        Set<String> hashSet = new HashSet<>(); // този тип сет не пази подредба на елементите, не е гарантирана подредбата
        hashSet.add("Gosho");
        hashSet.add("Pencho");
        hashSet.add("Gancho");
        hashSet.add("Gosho"); // дублиране на елемент, който няма да бъде вкаран в сета
        hashSet.add("Zlatko");
        hashSet.add("Stancho");
        hashSet.add("Vancho");

        System.out.println(hashSet);
        System.out.println(hashSet.contains("Sasho")); // -> false, защото това име го няма в сета

        System.out.println();
        // създаване на TreeSet
        Set<Integer> treeSet = new TreeSet<>(); // елемнтите се подреждат в естественият им вид, 1 -> 10; а -> z
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(4);
        treeSet.add(4); // дублиране на елемент, който няма да бъде вкаран в сета
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(7);

        System.out.println(treeSet);

        System.out.println();
        // създаване на LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>(); // подредбата на елементите отговаря на реда на добавянето им
        linkedHashSet.add(12341);
        linkedHashSet.add(12);
        linkedHashSet.add(777);
        linkedHashSet.add(7);
        linkedHashSet.add(7); // дублиране на елемент, който няма да бъде вкаран в сета
        linkedHashSet.add(89);
        linkedHashSet.add(1);
        linkedHashSet.add(-15);

        System.out.println(linkedHashSet);

        ///////////////////// MAPS

        Map<Integer, String> users = new HashMap<>();
        users.put(1, "Pencho");
        users.put(2, "Gancho");
        users.put(3, "Stancho");
        users.put(7, "Gosho");
        users.put(7, "ZLati"); // обновяване на стойността срещу ключа - 7
        System.out.println(users);
        System.out.println(users.values());
        System.out.println(users.keySet());



    }
}