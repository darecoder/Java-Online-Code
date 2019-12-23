package com.CB.Tries;

import java.util.Map;

class Trie{
    class Node{
        char data;
        boolean terminal;
        Map<Character, Node> children;

        public Node(char data) {
            this.data = data;
            this.terminal = false;
        }
    }

    Node root;
    int count;

    Trie(){
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
}

public class Main {
    public static void main(String[] args) {

    }
}


