#!/bin/bash
clear
COMPILE_BEGIN=$(date +%T)
g++ main.cpp -o output -std=c++17
EXECUTION_BEGIN=$(date +%T)
./output
echo $'\n'
EXECUTION_END=$(date +%T)
echo "${COMPILE_BEGIN} -> ${EXECUTION_BEGIN} -> ${EXECUTION_END}"