#!/bin/#!/usr/bin/env bash
resize -s 24 80
rm *.class
javac -cp lanterna.jar:. Demo.java
java -cp lanterna.jar:. Demo
