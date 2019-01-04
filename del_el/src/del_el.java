import java.util.Scanner;

public class del_el
{
  public static void main(String[] args)
  {
    int[] mass = new int[]{6, 10, 20, 14, 8, 50, 44, 56, 22, 4, 2, 16, 12, 26, 34, 28, 14, 36};
    int[] mass_sum = new int[mass.length - 1];

    System.out.println("Исходный массив: ");
    for (int i : mass)
    {
      System.out.print(i + ", ");
    }
    System.out.println("\nи массива сумм элементов");
    for(int j=0; j<mass_sum.length; j++)
    {
      mass_sum[j] = mass[j]+mass[j+1];
    }
    for(int i : mass_sum)
    {
      System.out.print(i + ", ");
    }

    System.out.print("\nКакой элемент удалим?: ");
    Scanner scan = new Scanner(System.in);
    int del = scan.nextInt();

    for (int i = 0; i<mass.length; i++)
    {
      if (i == del-1)
      {
        for(int j=i; j<mass.length-1; j++)
        {
          mass[j] = mass[j+1];
          if (j == mass.length-2)
            mass[j+1] = 0;
        }
      }
    }
    System.out.println("массив после удаления: ");
    for(int i : mass)
    {
      System.out.print(i + ", ");
    }

    for(int j=0; j<mass_sum.length; j++)
    {
      if(mass_sum[j] != (mass[j]+mass[j+1]))
      {
        System.out.println("\nУдаленный элемент - " + (((mass_sum[j]+mass_sum[j+1])-(mass[j]+mass[j+1]))/2));
        break;
      }
    }
  }
}

