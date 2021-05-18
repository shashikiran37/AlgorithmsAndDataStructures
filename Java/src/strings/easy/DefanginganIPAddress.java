package String.easy;

/**
 * Example 1:
 *
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 *
 * Example 2:
 *
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 */
public class DefanginganIPAddress {

    public static void main(String s[]){
        System.out.println(usingRegularExpression("255.100.50.0"));
        System.out.println(usingLoop("255.100.50.0"));

    }
    static String usingRegularExpression(String str){
        return str.replaceAll("[.]","[.]");
    }
    static String usingLoop(String str){
        StringBuffer sb = new StringBuffer();
        for(char c:str.toCharArray()){
            if(c=='.')
                sb.append("[.]");
            else
                sb.append(c);
        }
        return sb.toString();
    }
}
