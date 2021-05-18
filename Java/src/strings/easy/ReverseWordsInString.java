package String.easy;

/**
 * Reverse Words in a String
 *
 * input = "this is a String"
 * output = "String a is this"
 *
 * input = " this is a String "
 * output = "String a is this"
 *
 * input = " this   is  a String "
 *  * output = "String a is this"
 *
 */
public class ReverseWordsInString {

    public static void main(String st[]){
        String s= "the    sky is blue";
        s.trim();
        String[] str = s.split(" ");
        int n = str.length;

        StringBuilder sb = new StringBuilder();
        for(int i = n-1; i>=0; i--) {
            if(!str[i].equals("")) {
                sb.append(str[i]);
                sb.append(" ");
            }
        }
       System.out.println(sb.toString().trim());
    }
}
