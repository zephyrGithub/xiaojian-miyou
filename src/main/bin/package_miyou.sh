#####################################
#              miyou                # 
#           author:chenxiaojian     #
#           Data:2013-3-9           #
#####################################

#! /bin/bash

app_home="/opt/api/webapp/xiaojian-miyou"
server_app_home="/opt/api/resin"


cd $app_home
git pull origin master
mvn clean install -Dmaven.test.skip=true

sudo cp $app_home/target/xiaojian-miyou.war $server_app_home
echo package finish!
