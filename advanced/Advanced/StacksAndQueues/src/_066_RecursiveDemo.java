public class _066_RecursiveDemo {
    public static void main(String[] args) {

        doSomething(5);
    }

    private static void doSomething(int count) {
        System.out.println("Invoke doSomething");
        count--; // bottom of recursion, without this it will be infinity
        if (count == 0) {
            return;
        }
        doSomething(count);

    }
}

