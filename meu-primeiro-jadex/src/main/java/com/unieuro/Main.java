package com.unieuro;

import jadex.base.Starter;
import jadex.bridge.IExternalAccess;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando sistema de detecção de vídeos IA...");
        
        try {
            // Iniciar plataforma Jadex com configurações mínimas
            IExternalAccess platform = Starter.createPlatform(
                new String[] { "-gui", "true" }
            ).get();
            
            System.out.println("✅ Plataforma Jadex iniciada!");
            System.out.println("👁️  Agentes de detecção de IA estão rodando...");
            System.out.println("💡 Acesse a interface gráfica para gerenciar os agentes");
            
            // Manter o programa rodando
            while(true) {
                Thread.sleep(1000);
            }
            
        } catch (Exception e) {
            System.err.println("❌ Erro ao iniciar: " + e.getMessage());
            e.printStackTrace();
        }
    }
}