package detector.services;
import detector.models.VideoAnalysis;
public class VideoProcessingService {
    public static void analyzeVideoContent(String videoPath, VideoAnalysis analysis) {
        System.out.println("PROCESSAMENTO: Analisando " + videoPath);
        analysis.addFeature("frame_consistency", 0.75);
        analysis.addFeature("noise_pattern", 0.62);
    }
}
