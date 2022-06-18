#!/bin/bash
clear
COMPILE_BEGIN=$(date +%M:%S.%3N)
g++ main.cpp -o output -std=c++17
EXECUTION_BEGIN=$(date +%M:%S.%3N)
./output
echo $'\n'
EXECUTION_END=$(date +%M:%S.%3N)
echo "${EXECUTION_END} > ${EXECUTION_BEGIN} > ${COMPILE_BEGIN}"