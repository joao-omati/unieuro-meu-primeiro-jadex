package detector.services;

import jadex.bridge.service.annotation.Security;
import jadex.commons.future.IFuture;
import detector.models.VideoAnalysis;
import java.util.List;

/**
 * Interface do serviço de análise de vídeo para Jadex
 */
@Service
@Security(Security.UNRESTRICTED)
public interface IVideoAnalysisService {
    
    /**
     * Analisa um vídeo e retorna se é IA ou real
     */
    public IFuture<VideoAnalysis> analyzeVideo(String videoPath);
    
    /**
     * Analisa múltiplos vídeos
     */
    public IFuture<List<VideoAnalysis>> analyzeVideos(List<String> videoPaths);
    
    /**
     * Retorna estatísticas do sistema
     */
    public IFuture<String> getSystemStatus();
}
