public class Main
{

    public static void main(String[] args)
    {
        System.out.println("number is: " + getMysteriousValue(3));


    }
    public static int getMysteriousValue(int number)
    {
        if(number <= 1)
            return 1;
        else
            return getMysteriousValue(number-1) + number;
    }
}
