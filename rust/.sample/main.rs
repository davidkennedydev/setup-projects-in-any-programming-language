pub fn greet(name: &str) -> String {
    format!("Hello, {}!", name)
}

fn main() {
    println!("{}", greet("World"));
}

#[test]
fn test_greet() {
    assert_eq!(greet("Rust"), "Hello, Rust!");
}
