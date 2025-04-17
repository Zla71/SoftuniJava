import java.io.File;


public class _08_GetFolderSize {

    public static void main(String[] args) {

        String path = "D:\\Java\\advanced\\Advanced\\StreamsFilesAndDirectories\\streamsFolderExercise\\Exercises Resources";

        File directory = new File(path);

        int totalSize = 0;
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            for (File file : files) {
                if (!file.isDirectory()) {
                    totalSize += file.length();
                }
            }
        }

        System.out.println("Folder size: " + totalSize);
    }
}
