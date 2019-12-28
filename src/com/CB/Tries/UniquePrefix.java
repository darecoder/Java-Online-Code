package com.CB.Tries;

import javafx.util.Pair;

import java.util.Scanner;

class Tries{
    class Node{
        char data;
        boolean terminal;
        Node left;
        Node right;

        public Node(char data) {
            this.data = data;
            this.terminal = false;
            this.left = null;
            this.right = null;
        }
    }

    Node root;
    int count;

    Tries(){
        this.root = new Node('\0');
        this.count = 0;
    }

    public void addWord(String str){

    }

    public boolean search(String str){

    }

    public Pair<Character, Character> maxXorPair() {

    }

}

public class UniquePrefix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Tries trie = new Tries();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
            trie.addWord(Integer.toBinaryString(nums[i]));
        }

        System.out.println(trie.maxXorPair());
    }
}
