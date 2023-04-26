import java.util.*;
public class convertor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("HI This is a currency converter app.");
        System.out.println("Be aware of the current exchange prices in the market and then can convert from one currency to another.");
        double ExRate;
        System.out.print("Enter the exchange rate: ");
        ExRate = sc.nextDouble();
        System.out.print("Enter the amount to exchange : ");
        double amount;
        amount = sc.nextDouble();
        double result = ExRate*amount;
        System.out.print("The value of converted currency is : "+result);
    }
}
