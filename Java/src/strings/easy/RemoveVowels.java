package String.easy;

public class RemoveVowels {
    public static void main(String s[])
    {
        System.out.println(loopAndIfCondition("shashikiran"));
        System.out.println(regularExpression("shashikiran"));

    }

    static String loopAndIfCondition(String str){
        StringBuffer sb = new StringBuffer();
        for(char c:str.toCharArray()){
            if(c!='a' && c!= 'e' && c!='i' && c!= 'o' && c!='u' && c!='A' && c!= 'E' && c!='I' && c!= 'O' && c!='U'){
                sb.append(c);
            }

        }
         return sb.toString();
    }


    static String regularExpression(String str){
        return str.replaceAll("[aeiouAEIOU]","");
    }
}
