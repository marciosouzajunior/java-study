package CurrencyExchange;

/*
Given a file of currency conversion rates, write a function that converts one currency to another.

Sample log file entries:
{"from":"USD", "to":"EUR", "rate":1.1}
{"from":"EUR", "to":"GBP", "rate":1.2}
{"from":"EUR", "to":"ABC", "rate":1.2}

Means USD is worth 1.32 GBP
*/

class Solution {
    public static void main(String[] args) {

        System.out.println("Hello World");

        Trie currencyTrie = new Trie();
        currencyTrie.addNode("USD", "EUR", 1.1);
        currencyTrie.addNode("EUR", "GBP", 1.2);
        currencyTrie.print();

    }
}

class Trie {

    TrieNode rootNode = new TrieNode(null, null);

    public void addNode(String from, String to, Double rate){

        // check if from exists, if so, add to under it
        // if not exists, then add it and add to under it

        TrieNode foundNode = searchNode(rootNode, from);
        if (foundNode == null){

            // add the node
            for(int i = 0; i < 100; i++){
                if (rootNode.nodes[i] == null){
                    TrieNode newFromNode = new TrieNode(from, null);
                    TrieNode newToNode = new TrieNode(to, rate);
                    newFromNode.nodes[0] = newToNode;
                    rootNode.nodes[i] = newFromNode;
                    break;
                }
            }

        } else {

            // add under the node
            //System.out.println("node is found = " + foundNode.currency);

            // find a place to add under the from Node
            for(int i = 0; i < 100; i++){
                if (foundNode.nodes[i] == null){
                    TrieNode newToNode = new TrieNode(to, rate);
                    foundNode.nodes[i] = newToNode;
                    break;
                }
            }

        }

    }

    public TrieNode searchNode(TrieNode rootNode, String currency){

        //TrieNode resultNode = null;

        if (rootNode.currency == currency){
            return rootNode;
        }

        for(int i = 0; i < 100; i++){

            if (rootNode.nodes[i] == null){
                return null;
            } else {
                return searchNode(rootNode.nodes[i], currency);
            }

        }

        return null;

    }

    public void print(){
        print(rootNode);
    }

    public void print(TrieNode rootNode){

        System.out.println("Node: " + rootNode.currency);

        for(int i = 0; i < 100; i++){

            if (rootNode.nodes[i] == null){
                return;
            } else {
                print(rootNode.nodes[i]);
            }

        }

    }

}

class TrieNode {

    TrieNode [] nodes = new TrieNode[100];
    public String currency;
    Double rate;

    public TrieNode(String currency, Double rate){
        this.currency = currency;
        this.rate = rate;
    }

}
