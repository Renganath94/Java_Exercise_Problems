public class RemoveVowela
{

    public static void main(String[] args)
    {
        String string = "Quinbay Welcomes Februray 2021 Interns";
        System.out.println("Input String : "+string);
        string = string.replaceAll("[AaEeIiOoUu]", "");
        System.out.println(string);
    }
}