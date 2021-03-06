package com.bridgelabz;

public class HashTable {
	static final int size = 5;

    public static int hashFunction(String str) {
        return str.hashCode() % size;
    }

    public static void sentence() {

        String sentence = "To be or not to be";
        String[] sentenceArray = sentence.split(" ");
        int i = 0;
        int j = 0;
        int count = 0;

        for (String str : sentenceArray) {
            System.out.println(str + "----" + hashFunction(str));
            //    System.out.println(sentenceArray);

        }
    }
    public static void paragraph() {

        String paragraph = "Paranoids are paranoid because they are Paranoid but because they keep putting" +
                " themselves deliberately into Paranoid avoidable situations";
        String[] paragraphArray = paragraph.split(" ");
        for (String str : paragraphArray) {
            System.out.println(str + "----" + hashFunction(str));
        }
    }
    public static void main(String[] args) {
        HashTable.sentence();
        System.out.println("");
        HashTable.paragraph();
    }

}