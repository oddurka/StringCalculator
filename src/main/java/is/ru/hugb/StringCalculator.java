package is.ru.hugb;

public class StringCalculator
{
    public int add(String numbers)
    {
        int result = 0;
        if(numbers.equals(""))
        {
            return 0;
        }
        else
        {
            String[] nums = numbers.split(",|\\n");
            for(int i = 0; i < nums.length; i++)
            {
                result += Integer.parseInt(nums[i]);
            }
        }
        return result;

    }

    public static void main(String[] args)
    {
        UnitTester ut = new UnitTester();

        ut.addTest();
    }
}
