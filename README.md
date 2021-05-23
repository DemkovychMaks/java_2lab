
 ## Lab 9
 ### Task
  - Write code for Lab 2
  - Use java code convention
  - CLasses must be distributed in packages
  - Work with console must be minimal
  - Code must contain only that classes that are described in the diagram
  - Sorting must use java built-in methods
  - Sorting must be implemented in separate method
  - No static methods/attributes are allowed (the only exception is a main method)
  - You must use an Enum
  - Code must be in a separate branch with PR
  - Comparison must be implemented using lambdas
  - Instead of getters/setters you should use @Data annotation from lombok
  - Use maven and Jococo(in build section), FindBugs, PMD, CheckStyle plugins(reporting section)
  - Run `mvn site` and fix errors reported by checkstyle, pmd and findbugs
  - Build REST service
  - Use JAX-RS
  - Create ArmamentController and implement GET/POST/PUT/DELETE
  - Check code with findbags/checkstyle/pmd plugins
  - Code from ArmamentController and RestApplication must be in different packages
  - Use Map for saving objects
  - modify your pom.xml

 ## To run:
 ## To run server:
  - git clone 
  - Intellij IDEA: push 'RUN'
 ## Or:
  - Run `mvn compile`
  - Run `mvn package`
  - Run `java -cp target/LAB_2-1.0-SNAPSHOT.jar ua.lviv.iot.lightShop.App` 
  - Run `java -cp target/LAB_2-1.0-SNAPSHOT.jar ua.lviv.iot.lightShop.Main` 

 ## For sending requests use this commands
  - GET : `curl -v http://localhost:8080/good/1`
  - POST : `curl -v -d "name=name" http://localhost:8080/good`
  - PUT : `curl -v -X PUT -d "name=newName http://localhost:8080/good/1`
  - DELETE : `curl -v -X DELETE http://localhost:8080/good/1`
