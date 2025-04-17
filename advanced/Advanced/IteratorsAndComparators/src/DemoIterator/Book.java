package DemoIterator;

import java.util.Iterator;
import java.util.List;

// Iterable = дава възможност на моят клас да бъде обходим
// Book implements Iterable<String> = моят клас Книга ще бъде обходим (ще може да се обхожда)
// implements Iterable<тип на елементите, които ще се обхождат в моят клас>
// Iterable & Iterator вървят ръка за ръка !!!
public class Book implements Iterable<String> {

    private List<String> pages;

    public Book(String... pages) {
        this.pages = List.of(pages);
    }

    // как се обхождат тези страници?
    // трябва да напишем Iterator
    // Iterator - начина, по който ще се обхождат елементите на този клас

    // Iterator<тип данни, които се обхождат>
    public Iterator<String> iterator() {

//        // анонимен клас
//        return new Iterator<String>() {
//
//            private int index = 0;
//
//            @Override
//            public boolean hasNext() {
//                return index < pages.size();
//            }
//
//            @Override
//            // връща даденият елемент
//            public String next() {
//                String page = pages.get(index);
//
//                // увеличава индекса, за да отиде на следващият елемент в колекцията
//                index++;
//                return page;
//            }
//        };


        return new PageIterator();
    }

    // вътрешен клас, който ще опише начина, по който ще се  обхождатна страниците на моята книга
    // какво може да прави един клас, който нарича себе си Iterator(обходител)?
    // 1. трябва да знае има ли следваща страница?
    // 2. трябва да може да ми връща следващата страница от моята книга, ако има такава!
    private class PageIterator implements Iterator<String> {

        // индекса в колекцията
        private int index = 0;

        // пита има ли следващ елемент, ако true -> отива към следващият метод next()
        public boolean hasNext() {
            return index < pages.size();
        }


        // връща даденият елемент
        public String next() {
            String page = pages.get(index);

            // увеличава индекса, за да отиде на следващият елемент в колекцията
            index++;
            return page;
        }
    }

}
