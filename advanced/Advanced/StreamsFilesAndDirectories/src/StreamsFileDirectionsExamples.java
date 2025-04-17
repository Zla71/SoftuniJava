import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;

public class StreamsFileDirectionsExamples {
    public static void main(String[] args) throws IOException {

        // два вида потоци от данни:
        // - Input: четем информация, stream (отваряме този поток от данни към някакъв ресурс)

        Scanner scanner = new Scanner(System.in); // System.in --- от конзолата

        // - Output: пишем информация, stream (отваряме този поток от данни към някакъв ресурс)

        System.out.println("Zlati"); // System.out --- към конзолата

        // -------------------------------------------------------------------------
        // потоци от данни от файлове, .txt -- връща битове

        String path = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolder\\Files-and-Streams\\input.txt";
        FileInputStream fileStream = new FileInputStream(path);

        int oneByte = fileStream.read();
        while (oneByte >= 0) {
            System.out.print(oneByte);
            oneByte = fileStream.read();


        }
    }
}