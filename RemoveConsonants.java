public class RemoveConsonants {

    public static String removeConsonants(String str){
        String regex = "[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z]";
        return str.replaceAll(regex,"");
    }
    public static void main(String[] args) {
        String input  = "Hey buddy how are you doing";
        String result = removeConsonants(input);
        System.out.println(result);
    }
}
