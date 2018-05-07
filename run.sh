git clone https://github.com/mareimorsy/vodafone-task.git
docker build -t spring-boot-app .
docker run -it -p 8087:8080 spring-boot-app
curl localhost:8087/
