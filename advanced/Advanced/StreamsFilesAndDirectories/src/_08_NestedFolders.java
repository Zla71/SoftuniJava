import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class _08_NestedFolders {
    public static void main(String[] args) {
        String path = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolder\\Files-and-Streams";
        File root = new File(path);
        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);

        int count = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File nestedFile : nestedFiles)
                if (nestedFile.isDirectory())
                    dirs.offer(nestedFile);
            count++;
            System.out.println(current.getName());
        }
        System.out.println(count + " folders");
    }
}
