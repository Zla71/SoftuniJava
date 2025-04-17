import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _07_MergeTwoFiles {

    public static void main(String[] args) {

        String inputPath1 = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolderExercise\\Exercises Resources\\inputOne.txt";
        String inputPath2 = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolderExercise\\Exercises Resources\\inputTwo.txt";
        String outputPath = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolderExercise\\OutputThree.txt";

        try (BufferedReader reader1 = Files.newBufferedReader(Path.of(inputPath1));
             BufferedReader reader2 = Files.newBufferedReader(Path.of(inputPath2));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))) {

            String line = reader1.readLine();

            while (line != null) {
                writer.write(line);
                writer.newLine();
                line = reader1.readLine();
            }

            line = reader2.readLine();

            while (line != null) {
                writer.write(line);
                writer.newLine();
                line = reader2.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
