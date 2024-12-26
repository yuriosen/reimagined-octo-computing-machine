package org.example;

class SortedStringArray {
    private final String[] strings;
    private int size;

    public SortedStringArray() {
        this.strings = new String[100];
        this.size = 0;
    }

    public void add(String str) {
        if (size >= strings.length) {
            throw new RuntimeException("превышен размер массива");
        }
        strings[size++] = str;
        sort();
    }

    private void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (strings[i].length() > strings[j].length()) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
    }

    public String getMaxElement() {
        if (size == 0) {
            return null;
        }
        String max = strings[0];
        for (int i = 1; i < size; i++) {
            if (strings[i].length() > max.length()) {
                max = strings[i];
            }
        }
        return max;
    }

    public double getAverageLength() {
        if (size == 0) {
            return 0.0;
        }
        int totalLength = 0;
        for (int i = 0; i < size; i++) {
            totalLength += strings[i].length();
        }
        return (double) totalLength / size;
    }

    public String[] getAllStrings() {
        String[] result = new String[size];
        System.arraycopy(strings, 0, result, 0, size);
        return result;
    }
}
