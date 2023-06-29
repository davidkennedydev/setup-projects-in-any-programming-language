project:
	npx tsdx create project

init: project

run: project
	cd $< && npm run start

test: project
	cd $< && npm test

clean:
	rm -rf project

.PHONY: init
