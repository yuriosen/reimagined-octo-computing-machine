package org.example;

public class Main {
    public static void main(String[] args) {
        SortedStringArray sortedArray = new SortedStringArray();

        sortedArray.add("инф");
        sortedArray.add("инфор");
        sortedArray.add("информатика");

        System.out.print("отсортированные строки: ");
        for (String str : sortedArray.getAllStrings()) {
            System.out.print(str + " ");
        }
        System.out.println();

        System.out.println("макс строка: " + sortedArray.getMaxElement());
        System.out.println("средний размер строки: " + sortedArray.getAverageLength());
    }
}
