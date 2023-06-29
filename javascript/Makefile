project:
	mkdir project
	cp .sample/package.json project/
	cp .sample/index.js project/
	cp .sample/test.js project/
	cd project && npm install

init: project

project/package.json: | project
	cd project && npm install

run: project project/package.json
	cd project && node index.js

test: project project/package.json
	cd project && npm test

clean:
	rm -rf project

.PHONY: init
