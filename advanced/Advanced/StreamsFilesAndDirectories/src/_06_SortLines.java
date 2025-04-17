import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _06_SortLines {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolder\\input.txt");
        Path output = Paths.get("D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolder\\06.SortLinesOutput.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            lines = lines.stream().filter(l ->
                    !l.isBlank()).collect(Collectors.toList());
            Collections.sort(lines);
            Files.write(output, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
