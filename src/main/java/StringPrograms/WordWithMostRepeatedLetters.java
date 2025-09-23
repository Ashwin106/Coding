package StringPrograms;

public class WordWithMostRepeatedLetters {
	public static void main(String[] args) {
        String input = "Today is the greatest day ever!";
        String result = getWordWithMostRepeatedLetters(input);
        System.out.println("Word with most repeated letters: " + result);
    }

    public static String getWordWithMostRepeatedLetters(String str) {
        String[] words = str.replaceAll("[^a-zA-Z ]", "").split(" ");
        String result = "-1";
        int maxRepeatCount = 0;

        for (String word : words) {
            int[] freq = new int[26];
            for (char ch : word.toLowerCase().toCharArray()) {
                freq[ch - 'a']++;
            }

            int currentMax = 0;
            for (int count : freq) {
                if (count > 1) {
                    currentMax = Math.max(currentMax, count);
                }
            }

            if (currentMax > maxRepeatCount) {
                maxRepeatCount = currentMax;
                result = word;
            }
        }

        return result;
    }

}
