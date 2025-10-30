#!/bin/bash

echo "==============================================="
echo "    JADEX DETECTOR DE V√çDEOS IA - PLATAFORMA MULTIAGENTE"
echo "==============================================="

if [ $# -eq 0 ]; then
    echo "‚ùå ERRO: Especifique o caminho do v√≠deo!"
    echo ""
    echo "Como usar:"
    echo "  ./executar_jadex.sh \"caminho/do/video.mp4\""
    echo ""
    exit 1
fi

VIDEO_PATH="$1"

if [ ! -f "$VIDEO_PATH" ]; then
    echo "‚ùå ERRO: Arquivo n√£o encontrado: $VIDEO_PATH"
    exit 1
fi

echo "ÌæØ Iniciando plataforma Jadex..."
echo "Ì≥π V√≠deo: $VIDEO_PATH"
echo ""

# Compilar
echo "Ì≥¶ Compilando projeto Jadex..."
mvn clean compile

if [ $? -ne 0 ]; then
    echo "‚ùå Erro na compila√ß√£o!"
    exit 1
fi

echo "‚úÖ Compila√ß√£o conclu√≠da!"
echo "Ì∫Ä Iniciando agentes Jadex..."

# Executar classe main simplificada para testar
java -cp "target/classes:$(mvn dependency:build-classpath -q -Dmdep.outputFile=/dev/stdout)" \
     detector.Main "$VIDEO_PATH"

echo ""
echo "==============================================="
echo "        AN√ÅLISE JADEX CONCLU√çDA"
echo "==============================================="
