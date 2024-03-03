public class WordChecks {
    public static boolean isPairIsogram(String word) {
        int[] count = new int[26];
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                count[ch - 'a']++;
            }
        }
        for (int value : count) {
            if (value != 0 && value != 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String wordCheck = "pop";
        boolean result = isPairIsogram(wordCheck);
        System.out.println("Is \"" + wordCheck + "\" a pair isogram? " + result);
    }
}
