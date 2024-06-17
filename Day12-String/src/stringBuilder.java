public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Suyash");

        StringBuilder series = new StringBuilder();
        for(int i = 0; i<26; i++)
        {
            char ch = (char) ('a' + i);
            series.append(ch);
        }
        series.reverse();
        System.out.println(series.toString());
    }
}
