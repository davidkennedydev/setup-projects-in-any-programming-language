using Xunit;
using project;

public class ProgramTests
{
    [Fact]
    public void TestGreet()
    {
        Assert.Equal("Hello, Test!", Program.Greet("Test"));
    }
}
