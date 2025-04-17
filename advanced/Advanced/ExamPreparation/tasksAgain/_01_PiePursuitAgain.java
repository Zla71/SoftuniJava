import java.util.*;
import java.util.stream.Collectors;

public class _01_PiePursuitAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Queue - take first
        ArrayDeque<Integer> contestantsQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(contestantsQueue::offer);

        // STACK - take last
        ArrayDeque<Integer> piecesStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(piecesStack::push);


        while (!piecesStack.isEmpty() && !contestantsQueue.isEmpty()) {

            int currentContestant = contestantsQueue.peek();
            int currentPieces = piecesStack.peek();

            if (currentContestant >= currentPieces) {
                currentContestant -= currentPieces;
                piecesStack.pop();
                contestantsQueue.poll();
                if (currentContestant > 0) {
                    contestantsQueue.offer(currentContestant);
                }
            } else {
                currentPieces -= currentContestant;
                if (currentPieces > 0) {
                    piecesStack.pop();
                    if (piecesStack.isEmpty() || piecesStack.size() == 1) {
                        piecesStack.push(currentPieces);
                    } else {
                        int nextPieces = piecesStack.pop();
                        piecesStack.push(nextPieces + currentPieces);
                    }
                }
                contestantsQueue.poll();
            }

        }

        if (piecesStack.isEmpty() && contestantsQueue.isEmpty()) {
            System.out.println("We have a champion!");
        }

        if (piecesStack.isEmpty() && !contestantsQueue.isEmpty()) {
            System.out.println("We will have to wait for more pies to be baked!");
            String output = contestantsQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Contestants left: " + output);
        }

        if (!piecesStack.isEmpty() && contestantsQueue.isEmpty()) {
            System.out.println("Our contestants need to rest!");
            List<Integer> reversedStack = new ArrayList<>(piecesStack);
            Collections.reverse(reversedStack);
            String output = reversedStack.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Pies left: " + output);
        }

    }
}
