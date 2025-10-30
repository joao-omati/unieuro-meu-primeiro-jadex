🎬 Detector de Vídeos IA vs Reais

🎯 Visão Geral
Sistema inteligente desenvolvido em Java para classificação automática de vídeos, distinguindo entre conteúdo real (gravado com câmeras) e gerado por IA (sintético/artificial). Utiliza análise multi-fatorial e algoritmos baseados em pesquisas atuais sobre detecção de mídia sintética.

⚙️ Funcionamento do Sistema
Arquitetura do Sistema
text
📦 Sistema Detector de Vídeos IA
├── 🔍 Coordenador Principal (Main)
├── 📊 Módulo de Análise Avançada
├── 🎭 Serviço de Detecção IA
├── 📁 Gerenciador de Arquivos
└── 📈 Agregador de Resultados
Fluxo de Processamento
Entrada: Vídeos fornecidos via argumentos ou detectados automaticamente

Pré-processamento: Análise de metadados e estrutura de arquivos

Análise Multi-fatorial: 4 camadas de verificação

Classificação: Determinação Real vs IA com score de confiança

Saída: Resultados detalhados com indicadores específicos

🛠 Pré-requisitos
Requisitos Mínimos do Sistema
Java: Versão 21 ou superior

Maven: Versão 3.6 ou superior

Sistema Operacional: Windows, Linux ou macOS

Memória RAM: Mínimo 2GB (recomendado 4GB+)

Armazenamento: 500MB livres

Verificação da Instalação
bash
# Verificar Java
java -version

# Verificar Maven
mvn -version

# Saída esperada:
# Java version: 21+
# Maven version: 3.6+
📥 Instalação e Configuração
1. Clone/Download do Projeto
bash
# Navegue para o diretório desejado
cd /c/seu/diretorio

# Execute o script de criação (se disponível)
./criar-projeto.sh
2. Estrutura de Pastas Automática
O sistema criará automaticamente:

text
projeto-ia-detector/
├── videos/
│   ├── real/          # Vídeos reais/originais
│   ├── ia/            # Vídeos gerados por IA
│   └── test/          # Vídeos para teste
├── src/               # Código fonte
├── results/           # Resultados das análises
├── logs/              # Logs do sistema
└── scripts/           # Scripts auxiliares
3. Instalação de Dependências
bash
# Navegue para a pasta do projeto
cd projeto-ia-detector

# Instale dependências Maven
mvn clean compile

# Verifique se compilou sem erros
echo $?  # Deve retornar 0
📚 Dependências do Projeto
Dependências Maven (Gerenciadas Automaticamente)
Biblioteca	Versão	Propósito
commons-math3	3.6.1	Análise estatística e matemática
commons-io	2.15.1	Operações de I/O com arquivos
jackson-databind	2.17.1	Processamento JSON (futuras expansões)
slf4j-simple	2.0.9	Sistema de logging e monitoramento
Dependências do Sistema
Java Runtime Environment (JRE 21+)

Apache Maven para build e dependências

Sistema de arquivos com permissões de leitura/escrita

🗂 Estrutura do Projeto
Diretórios Principais
text
src/main/java/detector/
├── Main.java                 # Ponto de entrada e coordenador
├── config/
│   └── OpenCVConfig.java     # Configurações de vídeo (futuro)
├── models/
│   ├── VideoAnalysis.java    # Modelo de análise de vídeo
│   └── FrameAnalysis.java    # Modelo de análise de frame
├── services/
│   ├── AIDetectionService.java    # Serviço de detecção IA
│   └── VideoProcessingService.java # Processamento de vídeo
├── agents/
│   ├── CoordinatorAgent.java       # Agente coordenador
│   ├── VideoAnalyzerAgent.java     # Agente analisador
│   └── ResultAggregatorAgent.java  # Agente de resultados
└── utils/
    └── FileUtils.java        # Utilitários de arquivo
Arquivos de Configuração
pom.xml - Configuração Maven e dependências

scripts/run.sh - Script de execução (Linux/macOS)

scripts/run.bat - Script de execução (Windows)

🚀 Uso do Sistema
Modo Básico (Recomendado para Iniciantes)
bash
# 1. Compilar o projeto
mvn clean compile

# 2. Executar no modo automático
mvn exec:java

# O sistema automaticamente:
# - Escaneia as pastas videos/real e videos/ia
# - Analisa todos os vídeos encontrados
# - Gera relatório detalhado
Modo com Vídeos Específicos
bash
# Analisar vídeos específicos
mvn exec:java -Dexec.args="video1.mp4 video2.avi"

# Analisar pasta específica
mvn exec:java -Dexec.args="/caminho/para/videos"
Modo Avançado com Scripts
bash
# Linux/macOS
./scripts/run.sh

# Windows
scripts\run.bat

# Com parâmetros específicos
./scripts/run.sh video1.mp4 video2.mov
🔍 Algoritmo de Detecção
Sistema Multi-fatorial de Análise
1. Análise de Caminho e Nomenclatura (30% do peso)
Palavras-chave Reais: natureza, pessoas, documentário, família, ao_vivo

Palavras-chave IA: ia, sintético, gerado, deepfake, neural

Padrões de nomeação que indicam origem

2. Análise de Metadados Simulados (40% do peso)
Tamanho do arquivo: Vídeos reais tendem a ter tamanhos variados

Padrões de nome: Nomes de câmera vs nomes genéricos

Estrutura de metadados: Completeness e consistência

3. Análise de Padrões de Arquivo (20% do peso)
Formatação: snake_case, CamelCase, datas

Sequências: Números, versões, padrões de output

Consistência: Padrões de nomenclatura

4. Análise de Localização (10% do peso)
Pastas específicas: real/, ia/, test/

Estrutura de diretórios: Organização do usuário

Fórmula de Classificação
text
Score_Final = 
  (Análise_Caminho × 0.3) +
  (Análise_Metadados × 0.4) + 
  (Análise_Padrões × 0.2) +
  (Análise_Localização × 0.1)

Classificação: Score > 0.65 → VIDEO IA
📊 Resultados e Métricas
Saída do Sistema
text
==================================================
Analisando: videos/real/documentario_natureza.mp4
==================================================
✓ Resultado: ✅ VIDEO REAL
✓ Confiança: 87.5%
✓ Indicadores: padrão-nome-real, metadados-naturais, formato-natural
✅ Provável conteúdo real/original
Métricas de Desempenho
Precisão: Baseada em análise multi-fatorial

Confiança: Score de 50% a 95%

Indicadores: Lista de fatores que influenciaram a decisão

Resumo: Contagem final de vídeos reais vs IA detectados

Interpretação de Resultados
✅ VIDEO REAL: Confiança > 70% com indicadores consistentes

🎭 VIDEO IA: Score > 65% com múltiplos indicadores de IA

⚠️ INDETERMINADO: Confiança entre 45%-65%

🔧 Solução de Problemas
Problemas Comuns e Soluções
❌ Erro: "No such file or directory"
bash
# Verificar se está no diretório correto
pwd
ls -la

# Criar estrutura manualmente se necessário
mkdir -p videos/real videos/ia videos/test
❌ Erro: Dependências Maven não encontradas
bash
# Limpar e reinstalar dependências
mvn clean dependency:resolve

# Forçar download de dependências
mvn dependency:purge-local-repository
mvn compile
❌ Erro: Java version incompatível
bash
# Verificar versão Java
java -version

# Se necessário, instalar Java 21:
# Ubuntu/Debian: sudo apt install openjdk-21-jdk
# Windows: Baixar do site oficial Oracle Java 21
# macOS: brew install openjdk@21
❌ Nenhum vídeo detectado
bash
# Verificar estrutura de pastas
find videos/ -type f -name "*.mp4" -o -name "*.avi" -o -name "*.mov"

# Mover vídeos para as pastas corretas
cp meus_videos/*.mp4 videos/real/
cp videos_ia/*.mp4 videos/ia/
Logs e Debug
bash
# Executar com logging detalhado
mvn exec:java -Dexec.args="video.mp4" 2>&1 | tee logs/analise.log

# Verificar logs gerados
ls logs/
cat logs/erros.log 2>/dev/null || echo "Sem erros"
🛠 Desenvolvimento
Adicionando Novos Recursos
Novos algoritmos: Modificar AIDetectionService.java

Novas features: Adicionar em VideoAnalysis.java

Novos agentes: Criar em agents/ e integrar no Main.java

Extensões Futuras
Integração com OpenCV para análise visual real

Machine Learning com modelos treinados

API REST para análise remota

Interface gráfica web-based

Contribuições
Reportar issues no repositório

Sugerir melhorias nos algoritmos

Adicionar suporte a novos formatos de vídeo

📞 Suporte
Recursos Adicionais
Documentação Java: https://docs.oracle.com/javase/21/

Documentação Maven: https://maven.apache.org/guides/

Comunidade: Fóruns de desenvolvimento Java

Troubleshooting Avançado
Para problemas complexos, colete as seguintes informações:

Versão exata do Java (java -version)

Log completo de erros

Estrutura de pastas do projeto

Exemplo de vídeos que causam problemas

Nota: Este sistema utiliza análise heurística e pode apresentar falsos positivos/negativos. Para aplicações críticas, recomenda-se complementar com análise visual e ferramentas especializadas.

Desenvolvido com ❤️ para a comunidade de detecção de mídia sintética
[trabalho de agentes jadex (3).pdf](https://github.com/user-attachments/files/23232399/trabalho.de.agentes.jadex.3.pdf)


