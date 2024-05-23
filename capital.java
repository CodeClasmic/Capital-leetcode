public class capital {
    public static void main(String[] args) {
        String s = "Ughjkgv";
        int f = 0;
        char ch = s.charAt(0);
        if (s.equals(s.toUpperCase()))
            System.out.println("valid 1");
        else if (s.equals(s.toLowerCase()))
            System.out.println("valid 2");
        else {

            if (Character.isUpperCase(ch)) {
                for (int x = 1; x < s.length(); x++) {
                    char c = s.charAt(x);
                    if (!Character.isLowerCase(c)) {
                        System.out.println("not valid 3");
                        f = 0;
                        break;
                    } else {
                        f = 1;
                    }
                }
            } else {
                System.out.println("not valid 2");
            }
        }
        if (f == 1) {
            System.out.println(" valid 2");
        }
    }
}
