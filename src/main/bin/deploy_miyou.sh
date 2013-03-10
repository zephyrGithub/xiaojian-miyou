#!/bin/sh

ulimit -n 32768
#LANG=en_US
#LANG=zh_CN.GBK
JAVA_HOME=/usr/local/jdk
RESIN_HOME=/opt/api/resin

export LANG PATH JAVA_HOME CLASSPATH RESIN_HOME

case "$1" in
  start)
         $RESIN_HOME/bin/httpd.sh -conf $RESIN_HOME/conf/miyou.conf  -server xiaojian-miyou start
    sleep 1
    ;;
  stop)
        $RESIN_HOME/bin/httpd.sh  -conf $RESIN_HOME/conf/miyou.conf  -server xiaojian-miyou stop
    sleep 1
    ;;
  restart)
        echo "restart resin"
        sh $0 stop
        sleep 2
        sh $0 start
    ;;
  *)
    echo "Usage: $0 {start|stop|restart} port"
    exit 1
esac