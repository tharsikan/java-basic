class Dictation{
    public static void main(String[] args) {
        String[] words = {"hello", "tharsikan", "how", "are", "you", "what", "are", "you", "doing", "now"};
        int len = words.length;
        for(int i = 0; i < len-1; ++i) {
            for (int j = i + 1; j < len; ++j) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for(int i = 0; i < len; i++) {
            System.out.print(words[i] + " ");
        }
    }
}