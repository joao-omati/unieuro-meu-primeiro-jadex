package detector.models;
import java.util.HashMap;
import java.util.Map;
public class VideoAnalysis {
    private String videoId;
    private String videoPath;
    private Map<String, Double> features;
    private boolean isAIGenerated;
    private double confidence;
    
    public VideoAnalysis(String videoId, String videoPath) {
        this.videoId = videoId;
        this.videoPath = videoPath;
        this.features = new HashMap<>();
    }
    
    public String getVideoId() { return videoId; }
    public String getVideoPath() { return videoPath; }
    public Map<String, Double> getFeatures() { return features; }
    public boolean isAIGenerated() { return isAIGenerated; }
    public double getConfidence() { return confidence; }
    
    public void setAIGenerated(boolean aiGenerated) { isAIGenerated = aiGenerated; }
    public void setConfidence(double confidence) { this.confidence = confidence; }
    public void addFeature(String name, double value) { features.put(name, value); }
}
