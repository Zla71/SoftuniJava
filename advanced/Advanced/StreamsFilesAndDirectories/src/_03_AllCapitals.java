import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _03_AllCapitals {

    public static void main(String[] args) {

        String inputPath = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolderExercise\\input.txt";
        String outputPath = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolderExercise\\output.txt";

        try (
                BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
                BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))
        ) {
            String line = reader.readLine();
            while (line != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
