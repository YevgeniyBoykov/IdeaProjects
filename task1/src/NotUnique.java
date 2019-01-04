import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.round;

class NotUnique
{
  public static void main(String[] args)
  {
    System.out.println("Введите шестизначный номер: ");
    Scanner scan = new Scanner(System.in);
    int ticket = scan.nextInt();

    if (happyNum(ticket))
    {
      System.out.println("Билет счастливый!");
      System.out.println("Предыдущей счастливый был: " + prevTicket(ticket));
      System.out.println("Следующий счастливый будет: " + nextTicket(ticket));
    }
    else
      System.out.println("Билет Не счастливый!");
  }

  private static  boolean happyNum(int n)
  {
    int temp;
    int temp1 = 100000;

    ArrayList<Integer> array = new ArrayList<Integer>();
    do
    {
      temp = round(n/temp1);
      array.add(temp);
      n -= (temp*temp1);
      temp1 /= 10;
    } while  (n > 0);

    int a = 0;
    int b = 0;

    for(int i = 0; i < array.size(); i++)
    {
      if (i<3)
        a += array.get(i);
      else
        b += array.get(i);
    }
    if (a == b)
      return true;

    return false;
  }

  private static int nextTicket(int t)
  {
    for(int i = t+1; ; i++)
    {
      if (happyNum(i))
      {
        return i;
      }
    }
  }

  private static int prevTicket(int t)
  {
    for(int i = t-1; ; i--)
    {
      if (happyNum(i))
      {
        return i;
      }
    }
  }
}