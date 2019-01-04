import java.util.Scanner;

public class blit {
    static public void main(String[] args) {
        System.out.println("Please, enter you binary string(0 or 1 char): ");
        Scanner scan = new Scanner(System.in);
        //Scanner scan1 = new Scanner(System.in);
        String word = scan.nextLine();

        char[] bin_code = word.toCharArray();
        transformer trans = new transformer();

        char[] temp = new char[4];
        char[] temp1 = new char[4];
        String output1 = new String();
        String output2 = new String();

        if (word != "null") {
            for (int i = bin_code.length - 1; i >= 0; i = i - 4) {
                for (int j = 0; j < 4; j++) {
                    if ((i - j) > 0) {
                        temp[j] = bin_code[i - j];
                    } else
                        temp[j] = '0';
                }
                //System.out.println(temp);
                String temps = new String(temp);
                output1 = trans.transform(temps) + output1;
            }
            System.out.println(output1);
        }
        output2 = output1;

        do {
            char[] bin_code1 = output2.toCharArray();
            output2 = "";
            System.out.println(bin_code1.length);
            for (int i = 0; i < bin_code1.length; i = i + 4)
            {
                for (int j = 0; j < 4; j++)
                {
                    temp1[j] = bin_code1[i + j];
                }
                String temps = new String(temp1);
                output2 = trans.transform(temps)+ output2;
            }

            //output2 = trans.transform(output2) + output1;
            System.out.println(output2);
            System.out.println("Do you want to cont?");
        } while (scan.nextInt() == 1);
    }
}