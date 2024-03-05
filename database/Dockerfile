FROM mysql:8.3

COPY ./init.sql /docker-entrypoint-initdb.d


ENV MYSQL_USER=username
ENV MYSQL_PASSWORD=userpw
ENV MYSQL_ROOT_PASSWORD=rootpw
ENV MYSQL_DATABASE=blog
ENV MYSQL_HOST=%

CMD ["--character-set-server=utf8mb4", "--collation-server=utf8mb4_unicode_ci"]