package com.unieuro.agents;

import jadex.bridge.IInternalAccess;
import jadex.bridge.service.annotation.OnStart;
import jadex.micro.annotation.Agent;

@Agent
public class VideoAnalysisCoordinatorAgent {
    
    @Agent
    protected IInternalAccess agent;
    
    @OnStart
    public void onStart() {
        System.out.println("Agente Coordenador de Análise de Vídeos iniciado!");
        
        // Exemplo de vídeos para análise
        String[] videos = {
            "https://exemplo.com/video1.mp4",
            "https://exemplo.com/video2.mp4", 
            "https://exemplo.com/video3.mp4"
        };
        
        // Aqui você pode adicionar lógica para coordenar a análise
        for(String video : videos) {
            System.out.println("Vídeo para análise: " + video);
        }
    }
}