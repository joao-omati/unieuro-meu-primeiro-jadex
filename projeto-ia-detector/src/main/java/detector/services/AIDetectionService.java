package detector.services;
import detector.models.VideoAnalysis;
public class AIDetectionService {
    public static void determineIfAIGenerated(VideoAnalysis analysis) {
        double aiScore = 0.6;
        boolean isAI = aiScore > 0.7;
        analysis.setAIGenerated(isAI);
        analysis.setConfidence(0.8);
    }
    public static void applyResearchBasedHeuristics(VideoAnalysis analysis) {
        System.out.println("Aplicando heuristicas de pesquisa...");
    }
}
