package detector.utils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
public class FileUtils {
    public static List<String> findVideosInDirectory(String directoryPath) {
        List<String> videoFiles = new ArrayList<>();
        File directory = new File(directoryPath);
        if (!directory.exists()) return videoFiles;
        
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && isVideoFile(file)) {
                    videoFiles.add(file.getAbsolutePath());
                }
            }
        }
        return videoFiles;
    }
    
    private static boolean isVideoFile(File file) {
        String name = file.getName().toLowerCase();
        return name.endsWith(".mp4") || name.endsWith(".avi") || 
               name.endsWith(".mov") || name.endsWith(".mkv");
    }
}
