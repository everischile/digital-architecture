# digital-architecture

This is a Gradle based project that uses Spring MVC for exposing a Rest api and Spring Data for integrate with a MongoDB database.

For setting your enviroment you need the following:

* Java 8
* Install gradle
* Install MongoDB. You can follow the instructions given on the Wiki of this repository
* Tomcat

For runing the project:

* Gradle build
* Deploy the .war file that is in \build\libs some web container like Tomcat or use any embedded container like Jetty.

See the documentation and test the API

* http://localhost:8080/swagger-ui.html
