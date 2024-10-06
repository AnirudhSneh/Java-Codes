public class ToUpperCase {
    public static String ToUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1 ; i<str.length() ; i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
            }
        }
        return str;
    }
    public static void main(String args[]){
        String str = "My name is anirudh.";
        ToUppercase(str);
        System.out.println(str);
    }
    
}
