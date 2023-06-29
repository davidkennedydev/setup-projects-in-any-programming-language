project:
	mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=project -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
	cp .sample/Main.java project/src/main/java/com/mycompany/app/
	cp .sample/MainTest.java project/src/test/java/com/mycompany/app/

init: project

run: project
	cd project && mvn compile exec:java -Dexec.mainClass="com.mycompany.app.Main"

test: project
	cd project && mvn test

clean:
	rm -rf project

.PHONY: init
