import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class _05_WriteEveryThirdLine {

    public static void main(String[] args) throws FileNotFoundException {

        String pathRead = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolder\\input.txt";
        String pathWrite = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolder\\05.WriteEveryThirdLineOutput.txt";

        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream outputStream = new FileOutputStream(pathWrite);

        Scanner reader = new Scanner(inputStream);
        PrintWriter writer = new PrintWriter(outputStream);

        int count = 1;
        String line = reader.nextLine();
        while (reader.hasNextLine()) {
            if (count % 3 == 0) {
                writer.println(line);
            }
            count++;
            line = reader.nextLine();
        }

        writer.close();
        reader.close();

    }
}
