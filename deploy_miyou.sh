#####################################
#              miyou                # 
#           author:chenxiaojian     #
#           Data:2013-3-9           #
#####################################

#! /bin/bash

app_home="/Users/chenxiaojian/code/xiaojian-miyou"
server_app_home="/opt/api/webapp"

#server_ip="127.0.0.1"

cd $app_home
git pull origin master
mvn clean install -Dmaven.test.skip=true

#scp $app_home/target/xiaojian-miyou.war $server_ip:$server_app_home
sudo cp $app_home/target/xiaojian-miyou.war $server_app_home
echo finish!
