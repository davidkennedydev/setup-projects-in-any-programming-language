project:
	mkdir -p project/src/main/kotlin
	mkdir -p project/src/test/kotlin
	cp .sample/Main.kt project/src/main/kotlin/
	cp .sample/MainTest.kt project/src/test/kotlin/
	cp .sample/build.gradle.kts project/

init: project

run: project
	cd project && gradle run

test: project
	cd project && gradle test

clean:
	rm -rf project

.PHONY: init
