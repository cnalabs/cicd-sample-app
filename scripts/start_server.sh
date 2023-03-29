#!/bin/bash

echo "Start Application Server"
nohup java -jar /home/ec2-user/app/cicd-sample-app-0.0.1-SNAPSHOT.jar > /home/ec2-user/app/nohup.out 2>&1 &
