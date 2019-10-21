public class Sort {
    public static void main(String[] args) {
        String[] words = { "fred", "     ", "*****", "Ethel", "?-?-?-?", "{([])}", "Lucy", "ricky", "book", "12345", "bookkeeper","6789",";+<?" };
        for(int i = 0; i < 13; ++i) {
            for (int j = i + 1; j < 4; ++j) {
                if (words[i].compareTo(words[j]) > 0) {
                    // swap words[i] with words[j[
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("In lexicographical order:");
        for(int i = 0; i < 13; i++) {
            System.out.println(words[i]);
        }
    }
}
