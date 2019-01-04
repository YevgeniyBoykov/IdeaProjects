import java.util.Scanner;

class poisk
{
  public static void main(String[] args)
  {
    int mass[] = new int[100]; //оъявление массива
    System.out.print("Введите число для поиска (1-10):");
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt(); //число, задущее условие поиска

    //заполнение массива (для примера - числами подряд)
    for(int i=0; i<mass.length; i++)
    {
      mass[i] = i+1;
    }
    int left = 0; //левая граница участва поиска
    int right = 99; //правая граница участва поиска
    int target = -1;

    do
    {
      int midl = (left + right)/2;
      if(num == mass[midl])
      {
        target = midl;
        break;
      }

      if (num < mass[midl])
        right = midl - 1;
      else
        left = midl + 1;

    } while (left <= right);

    if(target == -1)
      System.out.println("Номер не найден!");
    else
      System.out.println("Позиция - " + mass[target]);
  }
}

