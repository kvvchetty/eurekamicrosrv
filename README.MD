

Startup steps:

#1
Eureka server
java -jar -Dserver.port=8761 target/taxieeurekasrv-0.0.1-SNAPSHOT.jar


#2
Start multiple instance of service in server


java -jar -Dserver.port=9090 target/taxieserver-0.0.1-SNAPSHOT.jar

java -jar -Dserver.port=9091 target/taxieserver-0.0.1-SNAPSHOT.jar

java -jar -Dserver.port=9092 target/taxieserver-0.0.1-SNAPSHOT.jar


#3
Start client app to call server instance

java -jar -Dserver.port=8888 target/taxieclient-0.0.1-SNAPSHOT.jar



eureka check
http://localhost:8761/

backend taxiserver
http://localhost:9090/backend

browser client call:
https://localhost:8888/taxiclient/frontend/88888

