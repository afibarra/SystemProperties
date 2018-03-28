FROM open-liberty:latest
RUN ln -s /opt/ol/wlp/usr/servers/defaultServer/dropins /dropins

ENV START_MODE=run
ENTRYPOINT /opt/ol/wlp/bin/server $START_MODE
CMD ["defaultServer"]
