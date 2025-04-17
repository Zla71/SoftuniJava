package DemoIterator;


public class Main {
    public static void main(String[] args) {


        // искам да мога да обходя всички страници на моята книга
        Book book = new Book("page1", "page2", "page3");

        // как работи foreach цикъла?
        // 1. взема достъп до итератора на класа!
        // 2. пита итератора - има ли следващ елемент
        // 3. ако има следващ елемент, пита итератора да му даде този елемент
        for (String page : book) {
            System.out.println(page);
        }
    }
}
