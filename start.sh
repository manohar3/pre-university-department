#!/bin/sh
set -e

java -cp /opt/pucapp/*.jar -Dfile.dir="/opt/pucapp" test.puc.pdf.Main