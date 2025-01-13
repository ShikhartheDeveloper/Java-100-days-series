public class CapitalizedTheFirstAndLastCharacter {
    public static String capitalization(String str){
        String result = "";
        String [] words = str.split("\\s");

        for(String word : words){
            if(word.length() ==1){
                result += word.toUpperCase()+" ";
            } else {
            String first = word.substring(0,1);
            String rest = word.substring(1, word.length()-1);
            String last = word.substring(word.length()-1);
            result += first.toUpperCase() + rest + last.toUpperCase()+" ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "hey buddy my name is shikhar and i am a software engineer";
        String solution = capitalization(str);
        System.out.println(solution);
    }
}
