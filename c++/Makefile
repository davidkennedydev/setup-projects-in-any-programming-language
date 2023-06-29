CXX = g++
CXXFLAGS = -std=c++17 -Wall

project: .sample/main.cpp .sample/main_test.cpp
	mkdir -p project
	cp .sample/main.cpp project/
	cp .sample/main_test.cpp project/

init: project

build: project
	$(CXX) $(CXXFLAGS) -o project/main project/main.cpp

run: build
	./project/main

test: project
	$(CXX) $(CXXFLAGS) -o project/main_test project/main_test.cpp
	./project/main_test

clean:
	rm -rf project

.PHONY: init
