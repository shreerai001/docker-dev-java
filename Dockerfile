FROM tomcat:8.5-alpine

RUN apk add maven
#RUN mvn clean install

#VOLUME  . :/opt/project

COPY target/ROOT.war /usr/local/tomcat/webapps/

EXPOSE 8080

RUN rm -fr /usr/local/tomcat/webapps/ROOT

CMD chmod +x /usr/local/tomcat/bin/catalina.sh

CMD ["/usr/local/tomcat/bin/catalina.sh","run"]


