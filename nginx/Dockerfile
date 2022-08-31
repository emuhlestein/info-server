# a comment
FROM ubuntu
#RUN apt-get -y update
RUN apt-get -y update && apt-get -y install nginx
#FROM nginx:latest
##RUN rm /etc/nginx/nginx.conf /etc/nginx/conf.d/default.conf
RUN rm /var/log/nginx/access.log
RUN rm /var/log/nginx/error.log
##RUN mkdir /etc/nginx/sites-available
##COPY nginx/sites-available /etc/nginx/site-available/sites.intelliviz.com
##COPY nginx/nginx.conf /etc/nginx/nginx.conf
COPY nginx/nginx.conf /etc/nginx/conf.d/default.conf
COPY nginx/index.html /usr/share/nginx/html

EXPOSE 80
EXPOSE 8081
CMD ["nginx", "-g", "daemon off;"]