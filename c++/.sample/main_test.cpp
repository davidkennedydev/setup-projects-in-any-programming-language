#include <iostream>
#include <string>
#include <cassert>

std::string greet(const std::string& name) {
    return "Hello, " + name + "!";
}

int main() {
    assert(greet("C++") == "Hello, C++!");
    std::cout << "All tests passed.\n";
    return 0;
}
