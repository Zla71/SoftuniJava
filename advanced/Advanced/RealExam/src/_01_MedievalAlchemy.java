import java.util.*;
import java.util.stream.Collectors;

public class _01_MedievalAlchemy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // STACK - take last
        ArrayDeque<Integer> substancesStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .forEach(substancesStack::push);

        // QUEUE - take first
        ArrayDeque<Integer> crystalsQueue  = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .forEach(crystalsQueue::offer);

        int potions = 0;
        List<String> potionsList = new LinkedList<>();

        boolean allCreated = false;

        int brew = 0;
        int essence = 0;
        int draught = 0;
        int agility = 0;
        int elixir = 0;


        while (!substancesStack.isEmpty() && !crystalsQueue.isEmpty()) {

            int currentSubstance = substancesStack.peek();
            int currentCrystal = crystalsQueue.peek();

            int result = currentCrystal + currentSubstance;

            if (result == 70 && elixir == 0) {
                potionsList.add("Elixir of Strength");
                elixir++;
                potions++;
                substancesStack.pop();
                crystalsQueue.poll();

            } else if (result == 80 && agility == 0) {
                potionsList.add("Potion of Agility");
                agility++;
                potions++;
                substancesStack.pop();
                crystalsQueue.poll();

            } else if (result == 90 && draught == 0) {
                potionsList.add("Draught of Wisdom"); //////////////////////////////////////////////////////////////
                draught++;
                potions++;
                substancesStack.pop();
                crystalsQueue.poll();

            } else if (result == 100 && essence == 0) {
                potionsList.add("Essence of Resilience"); //////////////////////////////////////////////////////////////
                essence++;
                potions++;
                substancesStack.pop();
                crystalsQueue.poll();

            } else if (result == 110 && brew == 0) {
                potionsList.add("Brew of Immortality"); //////////////////////////////////////////////////////////////
                brew++;
                potions++;
                substancesStack.pop();
                crystalsQueue.poll();

            } else {
                if (result >= 110) {
                    if (brew == 0) {
                        potionsList.add("Brew of Immortality"); //////////////////////////////////////////////////////////////
                        brew++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else if (essence == 0) {
                        potionsList.add("Essence of Resilience"); //////////////////////////////////////////////////////////////
                        essence++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else if (draught == 0) {
                        potionsList.add("Draught of Wisdom"); //////////////////////////////////////////////////////////////
                        draught++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else if (agility == 0) {
                        potionsList.add("Potion of Agility"); //////////////////////////////////////////////////////////////
                        agility++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else if (elixir == 0) {
                        potionsList.add("Elixir of Strength"); //////////////////////////////////////////////////////////////
                        elixir++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else {
                        substancesStack.pop();
                        crystalsQueue.poll();
                        currentCrystal -= 5;
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    }

                } else if (result >= 100) {
                    if (essence == 0) {
                        potionsList.add("Essence of Resilience"); //////////////////////////////////////////////////////////////
                        essence++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    }  else if (draught == 0) {
                        potionsList.add("Draught of Wisdom"); //////////////////////////////////////////////////////////////
                        draught++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else if (agility == 0) {
                        potionsList.add("Potion of Agility"); //////////////////////////////////////////////////////////////
                        agility++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else if (elixir == 0) {
                        potionsList.add("Elixir of Strength"); //////////////////////////////////////////////////////////////
                        elixir++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else {
                        substancesStack.pop();
                        crystalsQueue.poll();
                        currentCrystal -= 5;
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    }

                } else if (result >= 90) {
                    if (draught == 0) {
                        potionsList.add("Draught of Wisdom"); //////////////////////////////////////////////////////////////
                        draught++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else if (agility == 0) {
                        potionsList.add("Potion of Agility"); //////////////////////////////////////////////////////////////
                        agility++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else if (elixir == 0) {
                        potionsList.add("Elixir of Strength"); //////////////////////////////////////////////////////////////
                        elixir++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else {
                        substancesStack.pop();
                        crystalsQueue.poll();
                        currentCrystal -= 5;
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    }

                } else if (result >= 80 ) {
                    if (agility == 0) {
                        potionsList.add("Potion of Agility"); //////////////////////////////////////////////////////////////
                        agility++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else if (elixir == 0) {
                        potionsList.add("Elixir of Strength"); //////////////////////////////////////////////////////////////
                        elixir++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else {
                        substancesStack.pop();
                        crystalsQueue.poll();
                        currentCrystal -= 5;
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    }

                } else if (result >= 70) {
                    if (elixir == 0) {
                        potionsList.add("Elixir of Strength"); //////////////////////////////////////////////////////////////
                        elixir++;
                        potions++;
                        substancesStack.pop();
                        currentCrystal -= 20;
                        crystalsQueue.poll();
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    } else {
                        substancesStack.pop();
                        crystalsQueue.poll();
                        currentCrystal -= 5;
                        if (currentCrystal > 0) {
                            crystalsQueue.offer(currentCrystal);
                        }
                    }
                } else {
                    substancesStack.pop();
                    crystalsQueue.poll();
                    currentCrystal -= 5;
                    if (currentCrystal > 0) {
                        crystalsQueue.offer(currentCrystal);
                    }
                }
            }

            if (potions == 5) {
                allCreated = true;
                break;
            }


        }

        if (allCreated) {
            System.out.println("Success! The alchemist has forged all potions!");
        } else {
            System.out.println("The alchemist failed to complete his quest.");
        }

        if (!potionsList.isEmpty()) {
            String output = potionsList.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Crafted potions: " + output);
        }

        if (!substancesStack.isEmpty()) {
//            List<Integer> reversedStack = new ArrayList<>(substancesStack);
//            Collections.reverse(reversedStack);
            String output = substancesStack.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Substances: " + output);
        }

        if (!crystalsQueue.isEmpty()) {
            String output = crystalsQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Crystals: " + output);
        }


    }
}
