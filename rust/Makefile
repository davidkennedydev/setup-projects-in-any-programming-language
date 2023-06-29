project:
	cargo new project
	cp .sample/main.rs project/src/

init: project

run: project
	cd project && cargo run

test: project
	cd project && cargo test

clean:
	rm -rf project

.PHONY: init
