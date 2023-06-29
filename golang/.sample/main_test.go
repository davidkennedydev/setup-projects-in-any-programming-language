package main

import "testing"

func TestGreet(t *testing.T) {
    result := Greet("Go")
    if result != "Hello, Go!" {
        t.Errorf("Greet was incorrect, got: %s, want: %s.", result, "Hello, Go!")
    }
}
