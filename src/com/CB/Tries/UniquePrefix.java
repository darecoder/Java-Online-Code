package com.CB.Tries;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
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
        Node temp = this.root;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(temp.children.containsKey(ch)){
                temp = temp.children.get(ch);
            }else {
                Node n = new Node(ch);
                temp.children.put(ch, n);
                temp = n;
            }
        }

        temp.terminal = true;
    }

    public boolean search(String str){
        Node temp = this.root;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (temp.children.containsKey(ch)){
                temp = temp.children.get(ch);
            }else {
                return false;
            }
        }

        return temp.terminal;
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
