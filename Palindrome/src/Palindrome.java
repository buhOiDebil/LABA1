import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)//рождение строки s, прошу ее любить и жаловать
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        isPalindrome(s);
    }

    public static String reverseString(String s)/* а здесь мы будем мееедленно с конца отрывать от s
    кусочки и утрамбовывать в строку reverse*/
    {
        String reverse = "";
        int n = s.length();
        while (n!=0)
        {
            reverse += s.charAt(n-1);//читаем индекс на 1 меньше чем длина строки чтобы не создать несоотвествие
            n--;
        }
        return reverse;
    }

    public static void isPalindrome(String s)//теперь сравниваем строки и выводим соответствующее сообщение в консоль
    {
        if(s.equals(reverseString(s)))
        {
            System.out.println("is Palindrome");
        }
        else {
            System.out.println("is not Palindrome");
        }
    }
}
