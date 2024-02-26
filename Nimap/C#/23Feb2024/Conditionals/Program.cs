namespace Conditionals
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
           int hours = 10;

            if(hours > 0 && hours < 12)
            {
                Console.WriteLine("Its Morning.");
            }else if(hours >=12 && hours<18){
                Console.WriteLine("Its afternoon");
            }else
            {
                Console.WriteLine("Its evening");
            }

            bool isGoldCustomer = true;
            float price = (isGoldCustomer) ? 19.95f : 29.95f;
            Console.WriteLine(price);
        }
    }
}
