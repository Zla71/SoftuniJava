import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemons = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfBadges() {
        return this.numberOfBadges;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }


    public void checkIfPokemonExistWithGivenElement(String element) {

        boolean isAtLeastOneExist = false;
        for (Pokemon pokemon : this.pokemons) {
            if (pokemon.getElement().equals(element)) {
                isAtLeastOneExist = true;
                break;
            }
        }

        if (isAtLeastOneExist) {
            this.numberOfBadges++;
        } else {
            for (Pokemon pokemon : this.pokemons) {
                pokemon.looseHealth();
            }

            // remove all pokemons that has 0 or less Health
            this.pokemons.removeIf(pokemon -> pokemon.getHealth() <= 0);
        }

    }

    public String toString() {
        // Peter 2 2
        return String.format("%s %d %d", this.name, this.numberOfBadges, this.pokemons.size());
    }
}
