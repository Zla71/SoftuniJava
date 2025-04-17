import java.util.*;

public class _07_CitiesByContinentAndCountry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, LinkedHashMap<String, List<String>>> continentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] commandArr = scanner.nextLine().split("\\s+");
            String continent = commandArr[0];
            String country = commandArr[1];
            String city = commandArr[2];

            continentsMap.putIfAbsent(continent, new LinkedHashMap<>());
            continentsMap.get(continent).putIfAbsent(country, new ArrayList<>());
            continentsMap.get(continent).get(country).add(city);

        }

        printInformation(continentsMap);
    }

    private static void printInformation(Map<String, LinkedHashMap<String, List<String>>> continentsMap) {
        for (Map.Entry<String, LinkedHashMap<String, List<String>>> entry : continentsMap.entrySet()) {
            String currentContinent = entry.getKey();
            System.out.printf("%s:%n", currentContinent);

            for (Map.Entry<String, List<String>> nestedEntry : entry.getValue().entrySet()) {
                String currentCountry = nestedEntry.getKey();
                System.out.printf("%s -> ", currentCountry);

                StringJoiner citiesString = new StringJoiner(", ");
                for (String city : nestedEntry.getValue()) {
                    citiesString.add(city);
                }
                System.out.printf("%s", citiesString);

                System.out.println();
            }
        }
    }
}
