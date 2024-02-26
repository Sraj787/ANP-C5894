namespace ForEachExample
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var name = "Sarthak Rajbhar";
           /* for(var i = 0; i < name.Length; i++)
            {
                Console.WriteLine(name[i]);
            }
           */

            foreach(var character in name)
            {
                Console.WriteLine(character);
            }

            var numbers = new int[] { 1, 2, 3,4};
            foreach(var number in numbers)
            {
                Console.WriteLine(number);
            }
        }
    }
}
