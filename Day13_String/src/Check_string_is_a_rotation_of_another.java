public class Check_string_is_a_rotation_of_another {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abced";
        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {

        s += s;
        if(s.contains(goal)) return true;
        else return false;
    }
}
