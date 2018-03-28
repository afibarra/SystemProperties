FROM open-liberty:latest

# Comment it out to enable encryption
#RUN apt update && \
#    apt upgrade -y && \
#    apt install -y curl
#RUN cd /tmp/ && \
#    curl -k -LO "http://download.oracle.com/otn-pub/java/jce/8/jce_policy-8.zip" -H 'Cookie: oraclelicense=accept-securebackup-cookie' && \
#    unzip jce_policy-8.zip && \
#    rm jce_policy-8.zip && \
#    yes |cp -v /tmp/UnlimitedJCEPolicyJDK8/*.jar /opt/ibm/java/jre/lib/security/

ADD postgresql-42.2.2.jar /tmp

RUN ln -s /opt/ol/wlp/usr/servers/defaultServer/dropins /dropins

ADD rest.war /dropins
ENTRYPOINT ["/opt/ol/wlp/bin/server", "run", "defaultServer"]
