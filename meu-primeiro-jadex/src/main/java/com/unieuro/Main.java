package com.unieuro;

import jadex.base.Starter;
import jadex.bridge.IExternalAccess;
import jadex.bridge.service.types.cms.CreationInfo;

public class Main {
    public static void main(String[] args) {
        System.out.println("🎬 Iniciando sistema de detecção de vídeos IA...");
        
        try {
            // Iniciar plataforma Jadex
            IExternalAccess platform = Starter.createPlatform(
                new String[] { "-gui", "true" }
            ).get();
            
            System.out.println("✅ Plataforma Jadex iniciada!");
            
            // 🎯 **ADICIONAR AGENTE AUTOMATICAMENTE**
            System.out.println("🤖 Criando agente de análise de vídeos...");
            
            CreationInfo agentInfo = new CreationInfo();
            agentInfo.setFilename("com.unieuro.agents.VideoAnalysisCoordinatorAgent.class");
            platform.createComponent(agentInfo).get();
            
            System.out.println("✅ Agente criado com sucesso!");
            System.out.println("📁 Verificando vídeos...");
            System.out.println("💡 Acesse: http://localhost:64844");
            
            // Manter rodando
            while(true) {
                Thread.sleep(1000);
            }
            
        } catch (Exception e) {
            System.err.println("❌ Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}