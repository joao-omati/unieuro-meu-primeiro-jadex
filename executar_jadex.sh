#!/bin/bash

echo "==============================================="
echo "    JADEX DETECTOR DE VÍDEOS IA - PLATAFORMA MULTIAGENTE"
echo "==============================================="

if [ $# -eq 0 ]; then
    echo "❌ ERRO: Especifique o caminho do vídeo!"
    echo ""
    echo "Como usar:"
    echo "  ./executar_jadex.sh \"caminho/do/video.mp4\""
    echo ""
    exit 1
fi

VIDEO_PATH="$1"

if [ ! -f "$VIDEO_PATH" ]; then
    echo "❌ ERRO: Arquivo não encontrado: $VIDEO_PATH"
    exit 1
fi

echo "� Iniciando plataforma Jadex..."
echo "� Vídeo: $VIDEO_PATH"
echo ""

# Compilar
echo "� Compilando projeto Jadex..."
mvn clean compile

if [ $? -ne 0 ]; then
    echo "❌ Erro na compilação!"
    exit 1
fi

echo "✅ Compilação concluída!"
echo "� Iniciando agentes Jadex..."

# Executar classe main simplificada para testar
java -cp "target/classes:$(mvn dependency:build-classpath -q -Dmdep.outputFile=/dev/stdout)" \
     detector.Main "$VIDEO_PATH"

echo ""
echo "==============================================="
echo "        ANÁLISE JADEX CONCLUÍDA"
echo "==============================================="
