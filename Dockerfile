FROM tomcat:8.0.20-jre8

COPY target/localeapp.war /usr/local/tomcat/webapps/localeapp.war