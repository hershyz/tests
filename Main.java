import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Test x = new Test();
        HashMap<String, Boolean> testResults = new HashMap<>();

        testResults.put("aba", true);
        testResults.put("bba", false);
        testResults.put("ab a ba", true);
        testResults.put("bat", false);
        testResults.put("dad", true);

        String[] tests = new String[]{"aba", "bba", "ab a ba", "bat", "dad"};

        verify(x, testResults, tests);
    }

    private static void verify(Test x, HashMap<String, Boolean> testResults, String[] tests) {
        int num = 1;
        for (String t : tests) {
            Boolean test = x.test(t);
            Boolean real = testResults.get(t);
            System.out.println("test " + num + ": " + (test == real));
            num++;
        }
    }
}
