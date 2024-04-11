package WordSuggestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordSuggestion {

    public static void main(String[] args) {

        Trie trie = new Trie();
        trie.insertSuggestion("bom", "dia");
        trie.insertSuggestion("dia", "como");
        trie.insertSuggestion("como", "vai");
        trie.insertSuggestion("bom", "trabalho");
        trie.insertSuggestion("bom", "descanso");
        trie.insertSuggestion("boa", "tarde");
        trie.insertSuggestion("boa", "noite");
        trie.insertSuggestion("boa", "semana");

        //trie.print();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Entrada: ");
            String entrada = scanner.nextLine();
            List<String> suggestions = trie.getSuggestions(entrada);
            System.out.println(String.join(" ", suggestions));
        }
    }

}

class Trie {

    TrieNode root = new TrieNode("*");

    void insertSuggestion(String word1, String word2) {

        TrieNode wordSearch = searchWord(root, word1);

        if (wordSearch == null) {
            // se não existe, adiciona na raiz
            TrieNode newNode = new TrieNode(word1);
            newNode.childs.add(new TrieNode(word2));
            root.childs.add(newNode);
        } else {
            // se existe, adiciona abaixo do nó
            wordSearch.childs.add(new TrieNode(word2));
        }

    }

    TrieNode searchWord(TrieNode node, String word) {

        if (node.word.equals(word)) {
            return node;
        }

        TrieNode result = null;

        for (TrieNode n : node.childs) {
            result = searchWord(n, word);
            if (result != null){
                break;
            }
        }

        return result;

    }

    List<String> getSuggestions(String word) {

        List<String> suggestions = new ArrayList<>();

        TrieNode wordSearch = searchWord(root, word);

        if (wordSearch != null) {
            for (TrieNode n : wordSearch.childs) {
                suggestions.add(n.word);
            }
        }

        return suggestions;

    }

    void print() {
        print(root);
    }

    private void print(TrieNode node) {

        if (node == null) {
            return;
        }

        System.out.println(node.word);

        for (TrieNode n : node.childs) {
            print(n);
        }

    }

}

class TrieNode {
    List<TrieNode> childs = new ArrayList<>();
    String word = "";

    public TrieNode(String word) {
        this.word = word;
    }
}