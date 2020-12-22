public class Primes
{
    public static void main(String[] args)
    {

        for(int n = 2; n<101; n++)//перебираю возможные числа
        {

            if (isPrime(n) == true)
            {
                System.out.print(n + " ");
            }
        }

    }

    public static boolean isPrime(int n) //выясняю через while, является ли число простым
    {
        int i = 1;
        while(i<n & n%(i+1)!=0)
        {
            i++;
        }
        if((i+1) == n)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
