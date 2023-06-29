using System;

namespace project
{
    public class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(Greet("World"));
        }

        public static string Greet(string name)
        {
            return $"Hello, {name}!";
        }
    }
}
