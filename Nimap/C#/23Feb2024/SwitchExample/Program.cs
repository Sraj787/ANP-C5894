using System.Diagnostics;

namespace SwitchExample
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var season = Season.Autumn;

            switch(season){
                case Season.Autumn:
                    Console.WriteLine("It's autumn and a beautiful season.");
                    break;
                case Season.Summer:
                    Console.WriteLine("It's perfect go to beach.");
                    break;
                default:
                    Console.WriteLine("I don't understands that season");   
                    break;
            }
        }
    }
}
