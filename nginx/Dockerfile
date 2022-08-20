# a comment
FROM nginx
RUN rm /etc/nginx/nginx.conf /etc/nginx/conf.d/default.conf
RUN rm var/log/nginx/access.log
RUN rm var/log/nginx/error.log
COPY nginx/nginx.conf /etc/nginx
COPY nginx/index.html /usr/share/nginx/html
EXPOSE 80
EXPOSE 8081
CMD ["nginx", "-g", "daemon off;"]