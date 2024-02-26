namespace StringFundamentals
{
    internal class Program
    {
        static void Main(string[] args)
        {
           
            var firstName = "Sarthak";
            var lastName = "Rajbhar";

            var fullName = firstName +" "+ lastName;
             Console.WriteLine(fullName);
            var myFullName = string.Format("my Name is {0} {1}", firstName, lastName);

            Console.WriteLine(myFullName);

            var names = new string[] { "jhon", "jack", "mary" };
            var formattedNames = string.Join(", ", names);
            Console.WriteLine(formattedNames);

            var text = "Hi jhon \nLook into the following path\nc:\\foldee2\nc:\folder";
            Console.WriteLine(text);
        }
    }
}
