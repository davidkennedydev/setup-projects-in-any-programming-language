project:
	lein new app project
	cp .sample/core.clj project/src/project/
	cp .sample/core_test.clj project/test/project/

init: project

run: project
	cd project && lein run

test: project
	cd project && lein test

clean:
	rm -rf project

.PHONY: init
