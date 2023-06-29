const greet = require('./index');

test('greets correctly', () => {
    expect(greet("JavaScript")).toBe("Hello, JavaScript!");
});
