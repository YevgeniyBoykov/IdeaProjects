import java.util.Scanner;

public class hourse {

    private static final int hor = 8;
    private static final int vert = 8;

  public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);

      //массив шахматной доски
      int[][] board1 = new int[hor][vert];
      int[][] board2 = new int[hor][vert];
      //варианты изменения координат при одном ходе
      int[][] step = {{2, 1,-1,-2,-2,-1, 1, 2},
                      {-1,-2,-2,-1, 1, 2, 2, 1}};

      //ввод координат нахождения коня
      System.out.println("Enter a horizontal coordinate(1 - 8): " );
      int currentX = scanner.nextInt()-1;
      System.out.println("Enter a vertical coordinate(1 - 8): ");
      int currentY = scanner.nextInt()-1;

      for(int i=0; i<=7; i++)
      {
        if((currentX + step[0][i])>=0 && (currentX + step[0][i])<8 && (currentY + step[1][i])>= 0 && (currentY + step[1][i]<8))
        {
          board1[currentX + step[0][i]][currentY + step[1][i]] = 1; //запись возможных положений коня на первом шаге

          int curX = currentX + step[0][i];
          int curY = currentY + step[1][i];
          System.out.println("currentX - "+ currentX + " curX - " + curX + "\n" + "currentY - "+currentY+" curY - "+curY);
          for(int j=0; j<=7; j++)
          {
            if((curX + step[0][j])>=0 && (curX + step[0][j])<8 && (curY + step[1][j])>= 0 && (curY + step[1][j]<8))
            {
              System.out.println("curX - "+ curX + " curX - " + (curX + step[0][j]) + "\n" + "curY - "+curY+" curY - "+(curY + step[1][j]));
              board2[curX + step[0][j]][curY + step[1][j]] = 2; //запись возможных положений коня на втором шаге
            }

          }
        }

      }

      //вывод полей возможных положений коня за два шага
      printBoard(board1);
      System.out.println("------------------------");
      printBoard(board2);
      System.out.println("End");
    }

    //фун-я выода поля с позициями коня
    private static void printBoard(int[][] board)
    {
      for(int j = 0; j < vert; j++)
      {
        for(int i = 0; i < hor; i++)
        {
          System.out.print(board[i][j] + "\t");
        }
        System.out.println();
      }
    }
}

