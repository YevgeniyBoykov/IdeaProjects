public class transformer
{
   public String transform(String part)
    {
        String[][] rules = new String[16][2];
        rules[0] = new String[]{"0000", "0000"};
        rules[1] = new String[]{"0001", "1000"};
        rules[2] = new String[]{"0010", "0001"};
        rules[3] = new String[]{"0011", "0010"};
        rules[4] = new String[]{"0100", "0000"};
        rules[5] = new String[]{"0101", "0010"};
        rules[6] = new String[]{"0110", "1011"};
        rules[7] = new String[]{"0111", "1011"};
        rules[8] = new String[]{"1000", "0100"};
        rules[9] = new String[]{"1001", "0101"};
        rules[10] = new String[]{"1010", "0111"};
        rules[11] = new String[]{"1011", "1111"};
        rules[12] = new String[]{"1100", "1101"};
        rules[13] = new String[]{"1101", "1110"};
        rules[14] = new String[]{"1110", "0111"};
        rules[15] = new String[]{"1111", "1111"};

        for (int i = 0; i < rules.length; i++)
        {
            if (part.equals(rules[i][0]))
            {
                part = rules[i][1];
                break;
            }
        }
        return part;
    }
}
