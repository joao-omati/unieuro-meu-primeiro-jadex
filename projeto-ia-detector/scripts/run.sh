#!/bin/bash
echo "EXECUTANDO DETECTOR DE VIDEOS IA"
echo "================================="
mvn clean compile
mvn exec:java -Dexec.args="$@"
