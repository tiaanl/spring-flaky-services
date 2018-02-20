#!/bin/bash

while :
do
    curl http://localhost:8080/ads-circuit-breaker
    echo
    sleep 0.01
done
