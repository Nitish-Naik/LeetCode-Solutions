import java.util.List;
import java.util.Arrays;

class Replace_words {
    public String replaceWords(List<String> dictionary, String sentence) {
        TrieNode root = new TrieNode();
        for (String word : dictionary) {
            TrieNode node = root;
            for (char ch : word.toCharArray()) {
                if (node.children[ch - 'a'] == null) {
                    node.children[ch - 'a'] = new TrieNode();
                }
                node = node.children[ch - 'a'];
            }
            node.isWord = true;
        }

        StringBuilder result = new StringBuilder();
        for (String word : sentence.split("\\s+")) {
            if (result.length() > 0) {
                result.append(" ");
            }
            TrieNode node = root;
            StringBuilder replacement = new StringBuilder();
            for (char ch : word.toCharArray()) {
                replacement.append(ch);
                if (node.children[ch - 'a'] == null) {
                    result.append(word);
                    break;
                }
                node = node.children[ch - 'a'];
                if (node.isWord) {
                    result.append(replacement);
                    break;
                }
            }
            if (!node.isWord) {
                result.append(word);
            }
        }

        return result.toString();
    }

    class TrieNode {
        TrieNode[] children;
        boolean isWord;

        public TrieNode() {
            children = new TrieNode[26];
            isWord = false;
        }
    }

    public static void main(String[] args) {
        Replace_words solution = new Replace_words();
        List<String> dictionary = Arrays.asList("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";
        System.out.println(solution.replaceWords(dictionary, sentence));
    }
}
