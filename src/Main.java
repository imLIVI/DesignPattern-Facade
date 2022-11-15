public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        printString(bins.sum("01010101", "00111111"));  //85+63
        printString(bins.mult("01010101", "00111111")); //85*63
    }

    public static void printString(String str) {
        char[] array = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        if (len % 4 == 0) {
            System.out.println(pr(len, array, sb));
        } else {
            int newLen = (len / 4 + 1) * 4;
            for (int i = 0; i < newLen; i++) {
                if (newLen - i != len)
                    sb.append('0');
                else
                    System.out.println(pr(len, array, sb));
            }
        }
    }

    public static StringBuilder pr(int len, char[] array, StringBuilder sb) {
        int space = 0;
        for (int i = 0; i < len; i++) {
            if ((sb.length() - space) % 4 == 0 && sb.length() != 0) {
                sb.append(' ');
                space++;
            }
            sb.append(array[i]);
        }
        return sb;
    }
}