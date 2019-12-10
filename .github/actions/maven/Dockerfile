FROM maven:3.6.3-jdk-8-slim

ADD https://raw.githubusercontent.com/pentaho/maven-parent-poms/master/maven-support-files/settings.xml /usr/share/maven/ref/settings.xml
COPY entrypoint.sh /usr/local/bin/entrypoint.sh

ENTRYPOINT ["/usr/local/bin/entrypoint.sh"]