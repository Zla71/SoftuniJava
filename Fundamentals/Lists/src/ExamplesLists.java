import java.util.*;
import java.util.stream.Collectors;

public class ExamplesLists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // string list population
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alan");
        names.add("Clara");

        System.out.println("\nInfo from row 11");
        System.out.println(names);

        // integer list population
        List<Integer> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(159);
        numbers.add(456);

        System.out.println("\nInfo from row 19");
        System.out.println(numbers);

        // create list with values
        List<String> namesTwo = new ArrayList<>(Arrays.asList("George", "Peter"));
        List<Integer> numbersTwo = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("\nInfo from row 29");
        System.out.println(namesTwo);
        System.out.println(numbersTwo);

        // remove by index
        List<String> namesThree = new ArrayList<>();
        namesThree.add("Ivan");
        namesThree.add("Dimitar");
        namesThree.add("Kaloyan");

        namesThree.remove(1);

        namesThree.add("Georgi");

        System.out.println("\nInfo from row 36");
        System.out.println(namesThree);

        // remove by value
        namesThree.remove(String.valueOf("Georgi"));
        System.out.println("\nInfo from row 49");
        System.out.println(namesThree);

        List<Integer> numbersThree = new ArrayList<>(Arrays.asList(123, 432, 565));
        numbersThree.remove(Integer.valueOf(432));
        System.out.println(numbersThree);

        // add by index
        List<Integer> numbersFour = new ArrayList<>(Arrays.asList(234, 654, 123));
        numbersFour.add(1, 555);
        System.out.println("\nInfo from row 58");
        System.out.println(numbersFour);

        // for loop though List
        List<Integer> numbersFive = new ArrayList<>(Arrays.asList(324, 345, 657, 999));
        System.out.println("\nInfo from row 64");

        for (int i = 0; i < numbersFive.size(); i++) {
            System.out.println(numbersFive.get(i));
        }

        // for each
        System.out.println("\nInfo from row 72");
        for (Integer num : numbersFive) {
            System.out.println(num);
        }

        // size() – number of elements in the List<E>
        // add(element) – adds an element to the List<E>
        // add(index, element) – inserts an element to given position
        // remove(element) – removes an element (returns true / false)
        // remove(index) – removes element at index
        // contains(element) – determines whether an element is in the list
        // set(index, item) – replaces the element at the given index

        // contains
        List<String> namesFour = new ArrayList<>(Arrays.asList("Zlati", "Gosho", "Pesho"));
        String name = "Zlati";

        System.out.println("\nInfo from row 86");
        if (namesFour.contains(name)) {
            System.out.println(name);
        }

        // replace element at given index
        namesFour.set(1, "Stancho");
        System.out.println("\nInfo from row 95");
        System.out.println(namesFour);

        // reading list values from a single line of code
        // 2 8 30 25 40 72 -2 44 56

        System.out.println("\nInfo from row 101");
//        System.out.print("input numbers: ");
        String values = "2 8 30 25 40 72 -2 44 56";
        List<String> items = Arrays.stream(values.split(" "))
                .collect(Collectors.toList());

        System.out.println(items);

        // second way reading list values from a single line of code
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            nums.add(Integer.parseInt(items.get(i)));
        }
        System.out.println("\nInfo from row 112");
        System.out.println(nums);

        // third way reading list values from a single line of code
        List<Integer> itemsTwo = Arrays.stream(values.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("\nInfo from row 120");
        System.out.println(itemsTwo);

        // printing lists on the console using a String.join():
        List<String> list = new ArrayList<>(Arrays.asList(
                "one", "two", "three", "four", "five", "six"));
        System.out.println("\nInfo from row 128");
        System.out.println(String.join("; ", list));

        // printing lists on the console using a for-loop:
        List<String> listNumbers = new ArrayList<>(Arrays.asList(
                "one", "two", "three", "four", "five", "six"));
        System.out.println("\nInfo from row 134");
        for (int index = 0; index < listNumbers.size(); index++)
            System.out.printf
                    ("arr[%d] = %s%n", index, listNumbers.get(index));

        // printing integer list with white spaces between numbers
        List<Integer> listOfnumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("\nInfo from row 142");
        System.out.println(listOfnumbers.toString().replaceAll("[\\[\\],]", ""));

        // merging lists
        List<Integer> mergeListOne = new ArrayList<>(Arrays.asList(213, 123, 435, 654));
        List<Integer> mergeListTwo = new ArrayList<>(Arrays.asList(213, 123, 435, 654));
        List<Integer> resultMerge = new ArrayList<>();
        resultMerge.addAll(mergeListOne);
        resultMerge.addAll(mergeListTwo);

        System.out.println("\nInfo from row 147");
        System.out.println(resultMerge);

        // sorting list alphabetically
        Collections.sort(mergeListOne);
        Collections.sort(listNumbers);
        System.out.println("\nInfo from row 154");
        System.out.println(mergeListOne);
        System.out.println(listNumbers);

        // reverse list
        List<Integer> reverseList = new ArrayList<>(Arrays.asList(213, 123, 435, 654, 444));
        Collections.reverse(reverseList);
        System.out.println("\nInfo from row 161");
        System.out.println(reverseList);

        // find the index of element
        List<String> namesByIndex = Arrays.asList("Zlati", "Gosho", "Pesho", "Stancho");
        int indexName = namesByIndex.indexOf("Zlati");
        System.out.println("\nInfo from row 167");
        System.out.printf("Index of Zlati is %d", indexName);
    }
}