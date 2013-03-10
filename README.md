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

RecentMiyouServiceImp.java中留了有多个测试用的accesstoken，因为是未审核应用所以
容易执行两三次就超出频率限制了，可以替换accesstoken来测功能

    //2.00000xCq0lQxAK7287214febicBx3B
    //2.00K2RpoBUfU9QB7d8acaec42Ap9LlB
    //2.00K2RpoBg2fUkD576432a2ab0vDMau
    //2.00K2RpoBkS7GQD68d7d6f6a6iLw4KB
    //2.00K2RpoB0ysgCmeb17074e77T5_slC
    //2.00K2RpoBRGtvLD25849cb97dXFzZcD
    //2.00K2RpoB0Tfi2U03a11dae7a0WBrf2
    private final String ACCESS_TOKEN = "2.00K2RpoBg2fUkD576432a2ab0vDMau";
