package Scheduled;

public class Test {

    public static void main(String[] args) {
        System.out.println(cnToUnicode("1212碎碎碎"));
    }

    private static String cnToUnicode(String cn) {
        char[] chars = cn.toCharArray();
        String returnStr = "";
        for (int i = 0; i < chars.length; i++) {
            returnStr += "\\u" + Integer.toString(chars[i], 16);
        }
        return returnStr;
    }
}
