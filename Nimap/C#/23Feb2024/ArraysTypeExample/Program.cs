using System.Net.Http.Headers;

namespace ArraysTypeExample
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var numbers = new[] {3,4,7,5,6,5 };
            Console.WriteLine(numbers.Length);

           var index = Array.IndexOf(numbers, 7);
            Console.WriteLine("Index of 7: "+ index);

            Array.Reverse(numbers);
            Console.WriteLine("Reverse Array");
            foreach (var number in numbers) {
                Console.Write(number);
            }



            //Copy Method
            int[] another = new int[3];
            Array.Copy(numbers, another, 3);
            Console.WriteLine("Another Array");
            foreach (var num in another) {
                Console.WriteLine(num);
            }

            //Sort the array
            Array.Sort(numbers);
            Console.WriteLine("Sorted Array:");
            foreach (var number in numbers)
            {   
                Console.Write(number);
            }
            
            Array.Clear(numbers,0,2);
            Console.WriteLine("Effect of Clear():");
            foreach(var i in numbers) Console.WriteLine(i);
        }
    }
}
