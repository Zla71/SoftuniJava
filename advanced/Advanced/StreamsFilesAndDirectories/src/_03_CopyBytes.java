import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _03_CopyBytes {

    public static void main(String[] args) throws IOException {

        String pathIn = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolder\\input.txt";
        String pathOut = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolder\\03.CopyBytesOutput.txt";

        FileInputStream in = new FileInputStream(pathIn);
        FileOutputStream out = new FileOutputStream(pathOut);

        int oneByte = in.read();
        while (oneByte >= 0) {
            if (oneByte == 32 || oneByte == 10) {
                out.write(oneByte);
            } else {
                String digits = String.valueOf(oneByte);
                for (int i = 0; i < digits.length(); i++) {
                    out.write(digits.charAt(i));
                }
            }
            oneByte = in.read();
        }
    }
}
