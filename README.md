# Paush

## DB Connection

This project is currently set up to run PostgreSQL in Docker inside the same remote VS Code environment as the Spring Boot app. That means the app connects to `localhost:5432` inside this environment, not to your laptop's local machine.

### Start PostgreSQL

```bash
docker run -d --name bms-postgres \
	-e POSTGRES_DB=bmsdb \
	-e POSTGRES_USER=postgres \
	-e POSTGRES_PASSWORD=postgres \
	-p 5432:5432 \
	-v bms-pgdata:/var/lib/postgresql/data \
	postgres:16
```

### Check Status

```bash
docker ps --filter name=bms-postgres
docker logs --tail 20 bms-postgres
```

### Connect the App

Use this datasource config in `demo/src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/bmsdb
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### Useful Docker Commands

```bash
docker start bms-postgres
docker stop bms-postgres
docker restart bms-postgres
docker exec -it bms-postgres psql -U postgres -d bmsdb
docker rm -f bms-postgres
docker volume ls
docker volume inspect bms-pgdata
```

### Notes

- The PostgreSQL process runs inside Docker, not as a native install on your machine.
- The data is persisted in the Docker volume `bms-pgdata`, so it survives container restarts.
- If the whole remote environment is recreated, the container and volume may be removed unless the platform preserves them.
