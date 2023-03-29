#!/bin/bash

PID=$(ps -ef | grep 'demo-app' | grep -v grep | awk '{print $2}')
if [ -n "${PID}" ]; then
  echo "kill process"
  kill -9 ${PID}
fi
