package com.unieuro.agents;

import jadex.bridge.IInternalAccess;
import jadex.bridge.service.annotation.OnStart;
import jadex.micro.annotation.Agent;
import java.io.File;

@Agent
public class VideoAnalysisCoordinatorAgent {
    
    @Agent
    protected IInternalAccess agent;
    
    @OnStart
    public void onStart() {
        System.out.println("🎬 Agente Coordenador de Análise de Vídeos Iniciado!");
        
        // 🔧 MODIFIQUE AQUI: Coloque o caminho do SEU arquivo de vídeo
        String videoPath = "C:/Users/jokin/OneDrive/Área de Trabalho/Rabbit Hunting with beagles.mp4";
      
        
        File videoFile = new File(videoPath);
        
        System.out.println("🔍 Procurando arquivo: " + videoPath);
        
        if (videoFile.exists() && videoFile.isFile()) {
            System.out.println("✅ Arquivo encontrado!");
            analyzeVideo(videoFile);
        } else {
            System.out.println("❌ Arquivo NÃO encontrado: " + videoPath);
            System.out.println("\n💡 SOLUÇÃO: Modifique a variável 'videoPath' no código");
            System.out.println("📝 Abra o arquivo VideoAnalysisCoordinatorAgent.java");
            System.out.println("🔧 Edite a linha: String videoPath = \"SEU_CAMINHO_AQUI\";");
            
            // Mostrar vídeos disponíveis na área de trabalho
            findAvailableVideos();
        }
    }
    
    private void analyzeVideo(File videoFile) {
        System.out.println("\n========================================");
        System.out.println("🔍 INICIANDO ANÁLISE DO VÍDEO");
        System.out.println("========================================");
        
        // Informações do arquivo
        System.out.println("📄 Nome: " + videoFile.getName());
        System.out.println("📁 Local: " + videoFile.getParent());
        System.out.println("📊 Tamanho: " + (videoFile.length() / (1024 * 1024)) + " MB");
        System.out.println("🔢 Bytes: " + videoFile.length() + " bytes");
        
        // Simulação de análise
        System.out.println("\n🎯 PROCESSANDO ANÁLISE:");
        System.out.println("   ⏳ Extraindo frames...");
        System.out.println("   ⏳ Analisando metadados...");
        System.out.println("   ⏳ Verificando padrões de IA...");
        System.out.println("   ✅ Análise concluída!");
        
        // Resultado simulado
        double fakeProbability = Math.random() * 100;
        System.out.println("\n📊 RESULTADO DA ANÁLISE:");
        System.out.println("   🤖 Probabilidade de ser IA: " + String.format("%.2f", fakeProbability) + "%");
        System.out.println("   🎯 Decisão: " + (fakeProbability > 50 ? "POSSÍVEL IA" : "PROVAVELMENTE REAL"));
    }
    
    private void findAvailableVideos() {
        System.out.println("\n🔎 Procurando vídeos na Área de Trabalho...");
        
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        File desktop = new File(desktopPath);
        
        String[] videoExtensions = {".mp4", ".avi", ".mov", ".mkv", ".wmv"};
        
        boolean foundVideos = false;
        
        for (String ext : videoExtensions) {
            File[] videos = desktop.listFiles((dir, name) -> name.toLowerCase().endsWith(ext));
            
            if (videos != null && videos.length > 0) {
                System.out.println("\n🎬 Vídeos " + ext.toUpperCase() + " encontrados:");
                for (File video : videos) {
                    System.out.println("   📍 " + video.getName() + " (" + (video.length() / 1024 / 1024) + " MB)");
                    System.out.println("      Caminho: " + video.getAbsolutePath());
                    foundVideos = true;
                }
            }
        }
        
        if (!foundVideos) {
            System.out.println("📭 Nenhum vídeo encontrado na Área de Trabalho");
            System.out.println("💡 Dica: Coloque um arquivo MP4 na Área de Trabalho e atualize o código");
        }
    }
}