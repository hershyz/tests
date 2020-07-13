public class Test {

    public static Boolean test(String word) {

        word = word.toLowerCase();
        String s = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            s = s + word.charAt(i);
        }

        return s.equals(word);
    }
}
