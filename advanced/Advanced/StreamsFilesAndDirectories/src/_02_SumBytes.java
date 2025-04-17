import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _02_SumBytes {

    public static void main(String[] args) {
        String path = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolderExercise\\input.txt";

        long sum = 0;

        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(path))) {
//            int read = bufferedReader.read();
//            while (read != -1) {
//
//                System.out.print((char)read);
//                read = bufferedReader.read();
//            }

            String line = bufferedReader.readLine();
            while (line != null) {

                for (char c : line.toCharArray()) {
//                    System.out.print(c);
                    sum += c;
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

         System.out.println(sum);
    }
}
