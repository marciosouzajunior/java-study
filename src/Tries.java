public class Tries {

    // A trie consisting of the words: my, many and a.

    //       *
    //     M   A
    //    A  Y
    //   N
    //  Y

    public static void main(String[] args) {

        TrieNode1 root = new TrieNode1(null);

        addWord("a", root);
        addWord("many", root);
        addWord("my", root);

        //checkPrefix("ma", root);

        System.out.println("Finished.");


    }

    public static void addWord(String word, TrieNode1 trieNode) {

        char c = word.charAt(0);

        for (int i = 0; i < 26; i++) {

            // if we find a null position,
            // it means the char does not exist.
            // Then we create, add do a recursive
            // call when there is more chars.
            // If not, we set isWord = true and bye.
            if (trieNode.childs[i] == null) {

                trieNode.childs[i] = new TrieNode1(c, false);
                if (word.length() > 1) {
                    addWord(word.substring(1), trieNode.childs[i]);
                } else {
                    trieNode.childs[i].isWord = true;
                }
                break;

            }

            // At some point we may find the char.
            // If so, we don't have to recreate it.
            // We just do a recursive call if there is more
            // chars to check.
            if (trieNode.childs[i].character == c) {
                if (word.length() > 1) {
                    addWord(word.substring(1), trieNode.childs[i]);
                }
                // Here we found the exact correspondence,
                // So no need to set isWord = true.
                break;
            }

        }

    }

    public static void checkPrefix(String checkPrefix, TrieNode1 trie) {

    }

}

class TrieNode1 {
    Character character = null;
    TrieNode1[] childs = new TrieNode1[26];
    boolean isWord = false;

    public TrieNode1(Character character) {
        this.character = character;
    }

    public TrieNode1(Character character, boolean isWord) {
        this.character = character;
        this.isWord = isWord;
    }
}