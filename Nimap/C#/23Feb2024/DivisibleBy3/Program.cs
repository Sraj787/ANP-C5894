namespace DivisibleBy3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
             *  Write a program to count how many numbers between 1 and 100 are divisible by 3 with no remainder.
             *  Display the count on the console.
             */
            for (int i = 1; i <= 100; i++)
            {
                if(i%3 == 0)
                {
                    Console.Write(i + " ");
                }
            }
        }
    }
}
