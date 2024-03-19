# ServiceForStudy02
Java приложение, транслирующее при GET запросе ответ от приложения https://github.com/foxolave/ServiceForStudy01
```shell
#в случае доступности целевого приложения
curl -X GET proxy-app:8585/get_status
{"status":"Hello world!"}
#в случае недоступности целевого приложения
curl -X GET proxy-app:8585/get_status
{"timestamp":"2024-03-19T21:17:06.517+00:00","status":500,"error":"Internal Server Error","path":"/get_status"}
```

Пример запуска приложения:
```shell
java -jar ServiceForStudy02-0.0.1-SNAPSHOT.jar
```

Пример запуска теста:
```shell
mvn --batch-mode test
```

Настраиваемые параметры через application.properties
```properties
#Порт, по которому доступно приложение
app.port=8585
#url, по которому доступно приложение
app.url=get_status
#порт целевого приложения
target.app.port=8080
#url целевого приложения
target.app.url=status
#hostname/ip адрес целевого приложения
target.app.host=localhost
```