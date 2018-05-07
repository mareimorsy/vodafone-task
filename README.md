Welcome to the vodafone-task!

# Requirements
- Docker CE 17.05 (EE 17.06) or newer version must be installed
- git

# How to run the project

1. Download Project files
```
$ git clone https://github.com/mareimorsy/vodafone-task.git
$ cd vodafone-task/
```
2. build the docker image
```
$ docker build -t spring-boot-app .
```
It may take awhile depends on your internet speed.
The `Dockerfile` contains a  multi-stage builds; the first stage is used to build the application and the second stage will use the jar file which has created at the first stage to run the application to make a lightweight production ready container.

3. Run the container
```
$ docker run -it -p 8087:8080 spring-boot-app
```
press `Ctrl + p + q` in order to turn interactive mode into daemon mode.
this is just for testing purposes but we normally use `docer run -d` to run the container in background
4. Check The application using CURL or just visit `localhost:8087/` in your browser
```
$ curl localhost:8087/
```
