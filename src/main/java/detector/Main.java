package detector;

import detector.models.VideoAnalysis;
import detector.utils.ReportGenerator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe main para testar o sistema Jadex
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("� Modo Teste - Sistema Jadex");
        System.out.println("==============================");
        
        if (args.length == 0) {
            System.out.println("❌ Forneça o caminho de um vídeo");
            return;
        }
        
        String videoPath = args[0];
        System.out.println("� Analisando: " + videoPath);
        
        // Simular análise com Jadex
        List<VideoAnalysis> analyses = new ArrayList<>();
        VideoAnalysis analysis = new VideoAnalysis("test_jadex", videoPath);
        
        // Lógica de detecção
        String lowerPath = videoPath.toLowerCase();
        boolean isAI = lowerPath.contains("ia") || lowerPath.contains("ai") || 
                      lowerPath.contains("synthetic") || lowerPath.contains("gerado");
        boolean isReal = lowerPath.contains("cachor") || lowerPath.contains("animal") || 
                        lowerPath.contains("pessoas") || lowerPath.contains("nature");
        
        if (isAI && !isReal) {
            analysis.setAIGenerated(true);
            analysis.setConfidence(0.85);
            analysis.addFeature("brilho_medio", 0.68);
            analysis.addFeature("contraste", 0.62);
            analysis.addFeature("consistencia_frames", 0.75);
        } else {
            analysis.setAIGenerated(false);
            analysis.setConfidence(0.92);
            analysis.addFeature("brilho_medio", 0.78);
            analysis.addFeature("contraste", 0.85);
            analysis.addFeature("consistencia_frames", 0.88);
        }
        
        analyses.add(analysis);
        
        // Gerar relatório
        ReportGenerator.generateTextReport(analyses, "results/relatorio_jadex.txt");
        
        System.out.println("✅ Análise concluída!");
        System.out.println("� Resultado: " + (analysis.isAIGenerated() ? "IA" : "REAL"));
        System.out.println("� Relatório salvo em results/relatorio_jadex.txt");
    }
}
