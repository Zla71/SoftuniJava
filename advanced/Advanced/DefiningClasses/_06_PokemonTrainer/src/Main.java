import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Trainer> trainers = new ArrayList<>();

        while (!input.equals("Tournament")) {

            // Peter Charizard Fire 100
            String[] data = input.split("\\s+");
            String trainerName = data[0];
            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);

            // new instance of Trainer which will be new, or existing one
            Trainer trainer = getTrainerByName(trainers, trainerName);

            // new instance of Pokemon
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            // add Pokemon to trainer's list
            trainer.addPokemon(pokemon);

            input = scanner.nextLine();
        }

        String element = scanner.nextLine();

        while (!element.equals("End")) {

            // check each trainer has a pokemon with given element
            for (Trainer trainer : trainers) {
                trainer.checkIfPokemonExistWithGivenElement(element);
            }

            element = scanner.nextLine();
        }

        // sorting trainers by number of badges for every trainer in descending order
        Collections.sort(trainers, Comparator.comparing(Trainer::getNumberOfBadges).reversed());

        for (Trainer trainer : trainers) {
            System.out.println(trainer);
        }

    }

    private static Trainer getTrainerByName(List<Trainer> trainers, String trainerName) {

        // 1. return existing
        for (Trainer trainer : trainers) {
            if (trainer.getName().equals(trainerName)) {
                return trainer;
            }
        }

        // 2. return new
        Trainer trainer = new Trainer(trainerName);
        trainers.add(trainer);
        return trainer;
    }
}