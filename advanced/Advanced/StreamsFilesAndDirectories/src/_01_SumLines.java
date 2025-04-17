import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _01_SumLines {

    public static void main(String[] args) {
        String path = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolderExercise\\input.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                long sum = 0;

                for (char c : line.toCharArray()) {
                    sum += c;
                }

                System.out.println(sum);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
