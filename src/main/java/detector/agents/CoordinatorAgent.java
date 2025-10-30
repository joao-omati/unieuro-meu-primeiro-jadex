package detector.agents;

import jadex.bridge.service.annotation.Service;
import jadex.bridge.service.annotation.ServiceComponent;
import jadex.micro.annotation.Agent;
import jadex.micro.annotation.AgentBody;
import jadex.micro.annotation.AgentService;
import jadex.micro.annotation.Implementation;
import jadex.micro.annotation.ProvidedService;
import jadex.micro.annotation.ProvidedServices;

import detector.services.IVideoAnalysisService;
import detector.services.VideoAnalysisService;
import detector.models.VideoAnalysis;

import java.util.List;

/**
 * Agente Coordenador Jadex
 * Respons√°vel por orquestrar a an√°lise de v√≠deos
 */
@Agent
@ProvidedServices(@ProvidedService(type=IVideoAnalysisService.class, 
                implementation=@Implementation(VideoAnalysisService.class)))
public class CoordinatorAgent {
    
    @Agent
    protected IInternalAccess agent;
    
    @AgentBody
    public void executeBody() {
        System.out.println("Ì¥Ñ Agente Coordenador Jadex iniciado: " + agent.getComponentIdentifier());
        
        // Aguardar outros agentes
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("‚úÖ Sistema de agentes Jadex pronto para an√°lise!");
    }
}
