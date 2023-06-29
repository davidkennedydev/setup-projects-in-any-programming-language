project:
	mkdir -p project
	cp .sample/main.go project/
	cp .sample/main_test.go project/
	cd project && go mod init project

init: project

run: project
	cd project && go run main.go

test: project
	cd project && go test -v

clean:
	rm -rf project

.PHONY: init
