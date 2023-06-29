project:
	dotnet new console -o project
	cp .sample/Program.cs project/
	dotnet new xunit -o project.Tests
	cp .sample/ProgramTests.cs project.Tests/
	cd project.Tests && dotnet add reference ../project/project.csproj

init: project

run: project
	cd project && dotnet run

test: project
	cd project.Tests && dotnet test

clean:
	rm -rf project project.Tests

.PHONY: init
