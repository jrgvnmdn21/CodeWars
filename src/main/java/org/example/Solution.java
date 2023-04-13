package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author ef-jorge
 */
public class Solution {
    private String name;

    public static void main(String[] args) {

    }


    public static int strCount(String str, char letter) {
        int count = 0;
        String[] split = str.split("");
        for (int i = 0; i < split.length; i++) {
            split[i].charAt(i);
        }
        return 0;
    }

    static int stray(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            arrayList.add(numbers[i]);
        }
        arrayList.remove(Arrays.stream(numbers).distinct());
        System.out.println(arrayList);
        return 0;
    }


    public static int GetSum(int a, int b) {
        if (a == b) {
            return a;
        } else {
            int c = a + b;
            System.out.println(c);
            return a + b;
        }
    }

    public static String longest(String s1, String s2) {
        String result = "";
        result = s1 += s2;
        String[] split = result.split("");
        String collect = Arrays.stream(split).sorted().distinct().collect(Collectors.joining());
        return collect;
    }

    // Function that count set bits
    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }

    // Function that return count of
    // flipped number
    public static int FlippedCount(int a, int b) {
        // Return count of set bits in
        // a XOR b
        return countSetBits(a ^ b);
    }


    public static String[] stringToArray(String s) {
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        return words;
    }

    public static String findNeedle(Object[] haystack) {
        // Your code here
        int needle = Arrays.asList(haystack).indexOf("needle");
        return "found the needle at position " + needle;
    }

    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }

    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }

    public static int squareSum(int[] n) {
        //Your Code
        int sum = 0;
        for (int i : n) {
            sum += i * i;
        }

        return sum;
    }

    public static int doubleInteger(int i) {
        // Double the integer and return it!
        int i1 = i * 2;
        return i1;
    }

    public static boolean isLove(final int flower1, final int flower2) {


        if ((flower1 % 2) == 0 && (flower2 % 2) == 0) {
            return false;
        } else if ((flower1 % 2) == 0 && (flower2 % 1) == 0) {
            return true;
        } else if ((flower1 % 1) == 0 && (flower2 % 2) == 0) {
            return true;
        } else if ((flower1 % 1) == 0 && (flower2 % 1) == 0) {
            return false;
        }
        return false;
    }


    public static int makeNegative(final int x) {
        if (x > 0) {
            return x * -1;
        } else {
            return x;
        }

    }

    public static String areYouPlayingBanjo(String name) {
        char first = name.charAt(0);
        String fname = Character.toString(first);
        if (fname.equals("r") || fname.equals("R")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }

    public static long findNextSquare(long sq) {
        if (Math.sqrt(sq) % 1 != 0) {
            return -1;
        }
        long nextN = (long) Math.floor(Math.sqrt(sq)) + 1;
        return nextN * nextN;
    }

    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[01234]", "0").replaceAll("[56789]", "1");
    }

    public static boolean isSquare(int n) {
        return (Math.sqrt(n) % 1 == 0) ? true : false;
    }

    public static String highAndLow(String numbers) {
        // Code here or

        int number = Integer.valueOf(numbers);
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        if (number > highest) {
            number = highest;
        }
        if (number < lowest) {
            number = lowest;
        }
        String str1 = Integer.toString(highest);
        String str2 = Integer.toString(lowest);

        return str1 + str2;
    }

    public static int opposite(int number) {
        // your code here
        return number * -1;
    }

    public static String oddOrEven(int[] array) {
        // your code
        int sum = 0;
        String result = "";
        for (int i : array) {
            sum += i;
        }
        if (sum % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }
        return result;
    }

    public static int sum(int[] arr) {
        int evenNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                evenNum += arr[i];
            }
        }
        if (evenNum > 0) {
            return evenNum;
        } else {
            return 0;
        }
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[2];
        int counter = 0;
        if (input == null) {
            return new int[0];
        }

        for (int i : input) {
            if (i > 0) {
                counter++;
                result[0] = counter;
            } else if (i < 0) {
                result[1] += i;
            } else {
            }
        }
        return result;
    }

    public static int min(int[] list) {
        int min = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }


        return min;
    }

    public static int max(int[] list) {
        int max = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;

    }


    public static int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int countTrue = 0;
        try {
            for (int i = 0; i < arrayOfSheeps.length; i++) {
                if (arrayOfSheeps[i]) {
                    countTrue++;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countTrue;
    }

    public static char getGrade(int s1, int s2, int s3) {
        int average = (s1 + s2 + s3) / 3;

        if (90 <= average && average <= 100) {
            return 'A';
        } else if (80 <= average && average < 90) {
            return 'B';
        } else if (70 <= average && average < 80) {
            return 'C';
        } else if (60 <= average && average < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static String reverseWords(final String original) {
        if (original.isBlank()) {
            return original;
        }
        String words[] = original.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }
        // Have at it
        System.out.println(reverseWord);
        return reverseWord.trim();
    }

    static String encode(String word) {
        String s = word.toLowerCase();
        String container = "";

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            container += s.lastIndexOf(c) == s.indexOf(c) ? "(" : ")";
        }

        System.out.println(container);
        return container;
    }

    public static int duplicateCount(String text) {
        String s = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char indicator = s.charAt(i);
            int num = s.length() - s.replaceAll(String.valueOf(text.charAt(0)), "").length();
            if (i > 1) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

}