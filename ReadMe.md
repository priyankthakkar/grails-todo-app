This grails application is crated with help of grail-cli with rest-api profile.

It has a simple Todo model holding 3 attributes title, description & done (status) & a TodoController exposing endpoints to retrive, add, update, delete & search Todo items.

The master branch is a plain  grails application created from scratch in pristine condition. The code is added over the new branch todo-branch. More branches will added as I am planning to add spring-security, spring-session and liquibase to this application and same will be updated in this readme file.

Build this application using supplied gradle wrapper (./gradlew build && ./gradlew bootRun). I recommend this due to the incompatibiltiy of gradle with modified gson veiws (gsonViewCompile) task or if you using IntelliJ Idea you can run it directly via the main mehtod of the Application.groovy.

I have added spock based unit test-cases to test the domain constraints and search functionality for Todo domain and TodoController respectively.
