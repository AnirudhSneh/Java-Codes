public class RemoveDuplicates {
    public static void removeduplicates(String str, int idx , StringBuilder newstr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char CurrChar = str.charAt(idx);
        if(map[CurrChar - 'a'] == true){
            //duplicate
            removeduplicates(str, idx+1, newstr, map);
        }
        else{
            map[CurrChar - 'a'] = true;
            removeduplicates(str, idx+1, newstr.append(CurrChar), map);
        }
    }
    public static void main(String args[]){
        String str = "appnnacollege";
        removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
