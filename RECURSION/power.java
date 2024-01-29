public class power 
{
    public static int power_to_n(int base, int power)
    {
        if(power == 0) return 1;
        int pow = base * power_to_n(base, power-1);
        return pow;
    }

    public static int power_to_n_optimised(int base, int power)
    {
        if(power == 0)
        {
            return 1;
        }
        
        int halfPower =  power_to_n_optimised(base, power/2);
        int ans = halfPower*halfPower;
        if(power % 2 == 0)
        {
            return ans;
        }
        return base * ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(power_to_n(2,5));
        System.out.println(power_to_n_optimised(2, 5));
    }    
}
