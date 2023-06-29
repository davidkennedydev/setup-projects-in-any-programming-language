project:
	poetry new project
	cp .sample/main.py project/
	cp .sample/test_main.py project/tests

init: project

run: project
	cd project && poetry run python main.py

test: project
	cd project && poetry run pytest tests

clean:
	rm -rf project

.PHONY: init
