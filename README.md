打包和发布的脚本已经给出，在bin目录下
bin/deploy_miyou.sh
bin/package_miyou.sh
但是需要配置一下resin的conf文件，增加一个xiaojian-miyou的server-id配置



建议使用maven的jetty插件启动项目：
在xiaojian-miyou目录下：
mvn clean install -Dmaven.test.skip=true
mvn jetty:run

或者直接在IntelliJ IDEA import这个maven工程，用jetty插件运行

我在pom.xml中配置的是8080端口

