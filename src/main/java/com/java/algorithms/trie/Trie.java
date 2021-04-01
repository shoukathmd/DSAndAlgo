package com.java.algorithms.trie;

public class Trie {
    private TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    void insert(String word) {
        TrieNode current = root;
        for (char l: word.toCharArray()) {
            current = current.getChildren().computeIfAbsent(l, c -> new TrieNode());
        }
        current.setEndOfWord(true);
    }

    boolean contains(String word) {
        TrieNode current = root;

        for (char c : word.toCharArray()) {

            TrieNode node = current.getChildren().get(c);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.isEndOfWord();
    }

    void delete(String word) {
        TrieNode current = root;

        for (char c : word.toCharArray()) {

            TrieNode node = current.getChildren().get(c);
            if (node == null) {
                return;
            }
            current = node;
        }
        if (current.isEndOfWord()) {
            current.setEndOfWord(false);
        }
    }
}
