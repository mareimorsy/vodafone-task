Welcome to the vodafone-task!

1. Download Project files
```
$ git clone https://github.com/mareimorsy/vodafone-task.git
```
2. build the docker image
```
$ docker build -t spring-boot-app .
```
It may take awhile depends on your internet speed.

3. Run the container
```
$ docker run -it -p 8087:8080 spring-boot-app
```
4. Check The application using CURL or just visit `localhost:8087/` in your browser
```
$ curl localhost:8087/
```
