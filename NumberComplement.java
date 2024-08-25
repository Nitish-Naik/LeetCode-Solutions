public class NumberComplement {
    public static int findComplement(int num) {
        String a = Integer.toBinaryString(num);
        // System.out.println(a);
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == '0') {
                sb.append('1');
            }
            else {
                sb.append('0');
            }
        }
        String s = sb.toString();
        int c = Integer.parseInt(s, 2);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(1));
    }
}
