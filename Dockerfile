FROM tomcat:8.5-alpine

RUN apk add maven
#RUN mvn clean install

RUN apk add nginx

COPY frontend/dist/* /usr/share/nginx/html

COPY target/ROOT.war /usr/local/tomcat/webapps/

EXPOSE 8080

EXPOSE 80

RUN rm -fr /usr/local/tomcat/webapps/ROOT

CMD chmod +x /usr/local/tomcat/bin/catalina.sh

CMD ["/usr/local/tomcat/bin/catalina.sh","run"]


