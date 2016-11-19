#!/bin/bash
name=$1
filename=$2

echo $name
echo $name >> /var/log/$filename
