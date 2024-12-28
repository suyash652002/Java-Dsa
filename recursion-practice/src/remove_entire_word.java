public class remove_entire_word {
    public static void main(String[] args) {
        String str = "Suyaapplesh";
        String error = "apple";
        System.out.println(solve(str, error));
    }
    public static String solve(String str, String error)
    {
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith(error))
        {
            return solve(str.substring(error.length()), error);
        }
        return str.charAt(0) + solve(str.substring(1), error);
    }
}
