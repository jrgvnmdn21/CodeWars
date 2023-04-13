package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {


    public static void rightTriangle(int num) {
        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(i);
            }
            System.out.println(i);
        }
    }

    public static int[] countBy(int x, int n) {
        int count = 0;
        int[] ints = new int[n];

        for (int i = 0; i < n; i++) {
            count = x++;
            ints[i] = count;
        }
        return ints;
    }

    public static int findSmallestInt(int[] args) {
        int asInt = Arrays.stream(args).sorted().findAny().getAsInt();
        System.out.println(asInt);
        return asInt;
    }

    public static int findSmallestIntt(int[] args) {
        int min = args[0];

        for (int i = 1; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return min;
    }

    public static int[] reverse(int n) {
        int[] ints = new int[n];
        int j = 0;
        int decrement = n;
        for (int i = n; i > 0; i--) {

            ints[j] += decrement--;
            j++;
        }
        return ints;
    }

    public static String incrementString(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb.isEmpty()) {
            return "1";
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (!Character.isDigit(sb.charAt(i))) {
                sb.append('1');
                break;
            } else if (i == 0) {
                if (sb.charAt(i) != '9') {
                    sb.setCharAt(i, (char) (str.charAt(i) + 1));
                    break;
                }
                sb.setCharAt(i, '1');
                sb.append('0');
                break;
            } else if (sb.charAt(i) != '9') {
                sb.setCharAt(i, (char) (str.charAt(i) + 1));
                break;
            } else if (Character.isLetter(sb.charAt(i - 1))) {
                sb.setCharAt(i, '1');
                sb.append('0');
                break;
            } else {
                sb.setCharAt(i, '0');
            }
        }
        return sb.toString();
    }

    public static List<String> number(List<String> lines) {
        int count = 1;
        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, count + ": " + lines.get(i));
            count++;
        }

        return lines;
    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int first = 1;
        int second = 1;

        for (int i = 0; i < firstCuboid.length; i++) {
            first = first * firstCuboid[i];

        }
        for (int i = 0; i < firstCuboid.length; i++) {
            second = second * secondCuboid[i];
        }

        if (first > second) {
            return first - second;
        } else {
            return second - first;
        }
    }

    public static boolean checkForFactor(int base, int factor) {
        // your code here
        return base % factor == 0 ? true : false;
    }

    public static String toAlternativeString(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                result += Character.toString(c).toLowerCase();
            } else if (!Character.isUpperCase(c)) {
                result += Character.toString(c).toUpperCase();
            }
        }
        return result;
    }

    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }

    public static int[] map(int[] arr) {

        return Arrays.stream(arr).map(n -> n + n).toArray();
    }

    public static String smash(String... words) {
        String result = "";

        if (words.length == 0) {
            return result;
        }
        for (int i = 0; i < words.length; i++) {
            result += words[i] + " ";
        }
        return result.trim();
    }

    public static int summation(int n) {
        int result = 0;
        for (int i = 0; i < n + 1; i++) {
            result += i;
        }
        return result;
    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        // Your code here
        return length * width * height;
    }

    public static double sum(double[] numbers) {
        double total = 0f;
        if (numbers.length == 0) {
            return 0;
        }
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    public static boolean isIsogram(String str) {
        String[] split = str.split("");
        long count = str.chars().distinct().count();
        return count == 1 ? true : false;
    }

    public static int findIt(int[] a) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            for (int j = 0; j < a.length; j++) {
                if (temp == a[j]) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                break;
            }
        }
        return temp;
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int sum = 0;
        if (binary.get(0) == 1) {
            sum += 8;
        }
        if (binary.get(1) == 1) {
            sum += 4;
        }
        if (binary.get(2) == 1) {
            sum += 2;
        }
        if (binary.get(3) == 1) {
            sum += 1;
        }

        return sum;
    }


    public static String accum(String s) {
        String temp = "";
        String[] split = s.toLowerCase().split("");
        int count = 0;
        for (int i = 0; i < split.length; i++) {
            count++;
            for (int j = 0; j < count; j++) {
                if (j == 0) {
                    temp += split[i].toUpperCase();
                } else {
                    temp += split[i];
                }
            }
            temp += "-";
        }
        return temp.substring(0, temp.length() - 1);
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        if (employed == true && vacation == false) {
            return true;
        } else {
            return false;
        }
    }

    public static int points(String[] games) {
        int points = 0;
        for (int i = 0; i < games.length; i++) {

            if (games[i].charAt(0) > games[i].charAt(2)) {
                points += 3;
            } else if (games[i].charAt(0) == games[i].charAt(2)) {
                points += 1;
            }
        }

        return points;
    }

    public static int howOld(final String herOld) {
        char c = herOld.charAt(0);
        String s = Character.toString(c);
        int i = Integer.parseInt(s);
        return i;
    }

    public static boolean validatePin(String pin) {
        char[] chars = pin.toCharArray();
        if (pin.length() == 4 || pin.length() == 6) {
            for (int i = 0; i < pin.length(); i++) {
                if (chars[i] < 48 || chars[i] > 58) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }

    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

    public static String doubleChar(String s) {
        String[] split = s.split("");
        String res = "";
        for (int i = 0; i < split.length; i++) {
            res += split[i];
            res += split[i];
        }

        return res;
    }

    public static int strCount(String str, char letter) {
        int count = 0;
        if (str.equals("")) {
            return 0;
        }
        String[] split = str.split("");
        for (int i = 0; i < split.length; i++) {
            if (split[i].charAt(0) == letter) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static int duplicateCount(String text) {
        int count = 0;
        int value = 0;
        String[] split = text.toLowerCase().split("");
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < i; j++) {
                if (split[i].charAt(0) == split[j].charAt(0) && i != j) {
                    if (value != split[i].charAt(0)) {
                        value = split[i].charAt(0);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int[] sortArray(int[] array) {

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                arrayList.add(array[i]);
            }
        }
        List<Integer> collect = Arrays.stream(array).boxed().collect(Collectors.toList());
        arrayList = arrayList.stream().sorted().collect(Collectors.toList());
        int tempIndex = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = tempIndex; j < collect.size(); j++) {
                if (collect.get(j) % 2 == 1) {
                    collect.set(j, arrayList.get(i));
                    tempIndex = j + 1;
                    break;
                }
            }
        }
        int[] ret = new int[collect.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = collect.get(i).intValue();
        }
        for (int x : ret) {
            System.out.println(x);
        }

        return ret;
    }


    public static String createPhoneNumber(int[] numbers) {
        String res = "(";

        for (int i = 0; i < numbers.length; i++) {
            if (i < 3) {
                res += numbers[i];
            } else if (i < 5) {
                res += numbers[i];
            } else if (i < 10) {
                res += numbers[i];
            }
            if (i == 2) {
                res += ") ";
            }

            if (i == 5) {
                res += "-";
            }
        }

        return res;
    }

    public static String highAndLow(String numbers) {
        String[] split = numbers.split(" ");
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            integerList.add(Integer.parseInt(split[i]));
        }

        List<Integer> collect = integerList.stream().sorted().collect(Collectors.toList());
        Integer integer = collect.get(0);
        Integer integer1 = collect.get(collect.size() - 1);


        return integer1 + " " + integer;
    }

    public static String twoSort(String[] s) {
        List<String> collect = Arrays.stream(s).sorted().collect(Collectors.toList());
        String[] split = collect.get(0).split("");

        String res = "";
        for (int i = 0; i < split.length; i++) {
            res += split[i] + (i == split.length - 1 ? "" : "***");
        }
        return res;
    }

    public static String expandedForm(int num) {
        String s = Integer.toString(num);
        String[] split = s.split("");
        String res = "";
        int count = 0;

        for (int i = 1; i < split.length; i++) {
            count++;
            if (Integer.parseInt(split[i]) != 0) {
                count--;
            }
        }

        if (count == split.length - 1) {
            return s;
        }

        for (int i = 0; i < split.length; i++) {
            if (Integer.parseInt(split[i]) != 0) {
                res += split[i];
                for (int j = i; j < split.length - 1; j++) {
                    res += "0";
                }
                if (i == split.length - 1) {
                    res += "";
                } else {
                    res += " + ";
                }
            }
        }
        return res;
    }

    public static int quarterOf(int month) {
        int res = 0;
        if (month <= 3) {
            res = 1;
        } else if (month <= 6) {
            res = 2;
        } else if (month <= 9) {
            res = 3;
        } else if (month <= 12) {
            res = 4;
        }

        return res;
    }

    public static int[] digitize(long n) {
        String s = Long.toString(n);
        String[] split = s.split("");
        String res = "";
        int[] arr = new int[split.length];
        for (int i = split.length - 1; i >= 0; i--) {
            res += split[i];

        }
        String[] split1 = res.split("");
        for (int i = 0; i < split1.length; i++) {
            arr[i] = Integer.parseInt(split1[i]);
        }

        return arr;
    }

    public static int roundToNext5(int number) {
        int temp = 0;
        int temp2 = 0;
        temp = number % 5;
        temp2 = number % -5;
        if (number > -2) {
            if (temp == 0) {
                return number;
            } else {
                number = number + 5 - temp;
            }
        } else {
            if (temp2 == 0) {
                return number;
            } else {

            }
        }
        return number;
    }

    public static String spinWords(String sentence) {
        String[] split = sentence.split(" ");
        String res = "";
        for (int i = 0; i < split.length; i++) {
            int length = split[i].length();
            if (length >= 5) {
                String[] split1 = split[i].split("");
                for (int j = split1.length - 1; j >= 0; j--) {
                    res += split1[j];
                }
            } else {
                res += split[i];
            }
            res += " ";
        }

        return res.trim();
    }

    public static int sortDesc(final int num) {
        String convertedNum = Integer.toString(num);
        String[] split = convertedNum.split("");
        String temp = "";
        List<String> collect = Arrays.stream(split).sorted().collect(Collectors.toList());
        for (int i = collect.size() - 1; i >= 0; i--) {
            temp += collect.get(i);
        }
        return Integer.parseInt(temp);
    }

    static void myMethod() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());


        int[] ints = new int[x];
        while (true) {
            System.out.println("Enter Value: ");
            String value = br.readLine();
            String[] split = value.split(" ");
            if (split.length == x) {
                try {
                    for (int i = 0; i < split.length; i++) {
                        ints[i] = Integer.parseInt(split[i]);
                    }
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Invalid input");
                }
                for (int asd : ints
                ) {
                    System.out.println(asd);
                }
                break;

            } else {
                System.out.println("Wrong Input try Ageyn");
            }

        }
    }


    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        // your code here
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }

    public static String printerError(String s) {
        int total = 0;
        String tanggal = s.replaceAll("[^n-z]", "");
        total = tanggal.length();
        return Integer.toString(total) + "/" + Integer.toString(s.length());
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static int[] invert(int[] array) {
        int[] ints = Arrays.stream(array).map(n -> n * n).toArray();
        return ints;
    }

    public static String camelCase(String input) {
        String collect = Arrays.stream(input.split("")).map(n -> {
            if (n.equals(n.toUpperCase())) {
                n = " " + n;
            }
            return n;
        }).collect(Collectors.joining());

        return collect;
    }

    public static String toJadenCase(String phrase) {
        String temp = "";

        if (phrase == null || phrase.equals("")) {
            return null;
        }

        String[] s = phrase.split(" ");
        for (int i = 0; i < s.length; i++) {
            String[] s1 = s[i].split("");
            temp += s[i].replaceFirst(s1[0], s1[0].toUpperCase()) + " ";

        }

        return temp.trim();
    }

    public static void run() {
        Debugging d1 = new Debugging();
        List<?> li = List.of(1, -13, 41, 5413, 121);
        List<String> ls = List.of("Aa", "cad", "dada");
        System.out.println(Arrays.toString(d1.getComputedHashCodes(li)));
        System.out.println(Arrays.toString(d1.getComputedHashCodes(ls)));

    }

    public static int rentalCarCost(int d) {
        int res = 0;
        if (d >= 7) {
            res = d * 40 - 50;
        } else if (d >= 3) {
            res = d * 40 - 20;
        } else {
            res = d * 40;
        }
        // Your solution here
        return d;
    }

    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        String res = "";
        if (bmi > 30) {
            res = "Obese";
        } else if (bmi <= 18.5) {
            res = "Underweight";
        } else if (bmi <= 25.0) {
            res = "Normal";
        } else if (bmi <= 30.0) {
            res = "Overweight";
        }

        return res;
    }

    public static String high(String s) {

        if (s.equals("")) {
            return s;
        }
        int max = 0;
        int count = 0;
        String res = "";
        String[] splitBySpace = s.split(" ");
        for (int i = 0; i < splitBySpace.length; i++) {
            String[] splitByLetters = splitBySpace[i].split("");
            for (int j = 0; j < splitByLetters.length; j++) {
                char chars = splitByLetters[j].charAt(0);
                max += chars - 'a' + 1;
            }
            if (max > count) {
                count = max;
                res = splitBySpace[i];
            }
            max = 0;
        }

        return res;
    }

    public static int areaOrPerimeter(int l, int w) {
        int res = 0;
        if (l == w) {
            res = l * w;
        } else {
            res = (l + w) * 2;
        }
        return res;
    }

    public static boolean check(Object[] a, Object x) {
        Stream<Boolean> booleanStream = Arrays.stream(a).map(n -> n == x);

        return booleanStream.isParallel();
    }

    public static int[] arrayDiff(int[] a, int[] b) {


        List<Integer> a1 = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> a2 = Arrays.stream(b).boxed().collect(Collectors.toList());
        a1.removeAll(a2);
        int[] ints = a1.stream().mapToInt(Integer::intValue).toArray();

        return ints;
    }

    public static String abbrevName(String name) {
        String temp = "";
        String[] splitBySpace = name.split(" ");
        for (int i = 0; i < splitBySpace.length; i++) {
            String[] splitByLetters = splitBySpace[i].split("");
            String firstIndex = splitByLetters[0];
            if (i != splitBySpace.length - 1) {
                temp += firstIndex + ".";
            } else {
                temp += firstIndex;
            }

        }

        return temp.toUpperCase();
    }

    public static String even_or_odd(int number) {
        String bool = "";
        if (number % 2 == 0) {
            bool = "Even";
        } else {
            bool = "Odd";
        }
        return bool;
    }

    public static String remove(String str) {
        String[] split = str.split("");
        String temp = "";
        for (int i = 1; i < str.length() - 1; i++) {
            temp += split[i];

        }

        return temp;
    }

    public static String pigIt(String str) {
        String temp = "";
        String[] splitBySpace = str.split(" ");
        if (splitBySpace[splitBySpace.length - 1].equals("!")) {
            for (int i = 0; i < splitBySpace.length - 1; i++) {
                String[] splitByLetters = splitBySpace[i].split("");
                for (int j = 1; j < splitByLetters.length; j++) {
                    temp += splitByLetters[j];

                }
                temp += splitByLetters[0] + "ay ";
            }
        } else if (splitBySpace[splitBySpace.length - 1].equals("?")) {
            for (int i = 0; i < splitBySpace.length - 1; i++) {
                String[] splitByLetters = splitBySpace[i].split("");
                for (int j = 1; j < splitByLetters.length; j++) {
                    temp += splitByLetters[j];

                }
                temp += splitByLetters[0] + "ay ";
            }
        } else {
            for (int i = 0; i < splitBySpace.length; i++) {
                String[] splitByLetters = splitBySpace[i].split("");
                for (int j = 1; j < splitByLetters.length; j++) {
                    temp += splitByLetters[j];

                }
                temp += splitByLetters[0] + "ay ";
            }
        }

        if (splitBySpace[splitBySpace.length - 1].equals("!")) {
            temp += splitBySpace[splitBySpace.length - 1];
        } else if (splitBySpace[splitBySpace.length - 1].equals("?")) {
            temp += splitBySpace[splitBySpace.length - 1];
        }


        return temp.trim();
    }

    public static boolean smallEnough(int[] a, int limit) {
        boolean b = Arrays.stream(a).noneMatch(x -> x > limit);
        return b;
    }

    public static String linkedList() {
        LinkedList<LinkedList<Integer>> linkedLists = new LinkedList<>();

        LinkedList<Integer> subList1 = new LinkedList<>();
        subList1.add(3);
        subList1.add(4);

        LinkedList<Integer> subList2 = new LinkedList<>();
        subList2.add(1);
        subList2.add(2);

        linkedLists.add(subList1);
        linkedLists.add(subList2);

        LinkedList<Integer> newLinkedList = new LinkedList<>();

        for (int i = 0; i < linkedLists.size(); i++) {
            LinkedList<Integer> integers = linkedLists.get(i);
            for (int j = 0; j < integers.size(); j++) {
                newLinkedList.add(integers.get(j));
            }
        }
        for (int x : newLinkedList) {
            System.out.println(x);
        }

        return "";
    }

    public static boolean solution(String str, String ending) {

        return str.endsWith(ending);
    }

    public static boolean isEven(double n) {
        // Your awesome code here!
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int[] between(int a, int b) {
        List<Integer> integerList = new ArrayList<>();
        do {
            integerList.add(a);
            a++;
        } while (a != b + 1);
        int[] ints = integerList.stream().mapToInt(Integer::intValue).toArray();
        return ints;
    }

    public static boolean isValid(char[] walk) {
        boolean res = false;
        int temp1 = 0;
        int temp2 = 0;
        if (walk.length != 10) {
            return false;
        }

        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 'w') {
                temp1++;
            } else if (walk[i] == 'e') {
                temp1--;
            }
            if (walk[i] == 'n') {
                temp2++;
            } else if (walk[i] == 's') {
                temp2--;
            }
        }

        if (temp1 == 0 && temp2 == 0) {
            res = true;
        }

        return res;
    }

    public static String correct(String string) {

        return string.replaceAll("1", "I").replaceAll("0", "O").replaceAll("5", "S");
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[2];
        int counter = 0;
        if (input.length == 0) {
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

    public static String reverseLetter(final String str) {
        String temp = "";
        String s = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        for (int i = s.length() - 1; i > 0; i--) {
            temp += s.charAt(i);
        }

        return temp;
    }

    public static int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }

        int temp = n;
        int res = 1;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res *= temp;
            temp--;

        }
        return res;
    }

    public String dnaToRna(String dna) {
        return dna.replaceAll("T", "U");
    }

    public static boolean getXO(String str) {
        String s = str.toLowerCase();
        if (!s.contains("o") && !s.contains("x")) {
            return true;
        }
        int x = 0;
        int o = 0;
        String[] split = str.toLowerCase().split("");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("x")) {
                x++;
            } else if (split[i].equals("o")) {
                o++;
            }
        }

        if (x == o) {
            return true;
        }

        return false;
    }

    public static boolean isPlural(float f) {

        return f != 1f ? true : false;
    }


    public static long factoriall(int n) {
        int count = n;
        long result = 1L;
        for (int i = 0; i < n; i++) {
            result *= count;
            count--;
        }

        return result;
    }

    public int Liters(double time) {

        //Your code goes here! Hint: You should change that -1
        return (int) (time * 0.5);

    }

    public static int minValue(int[] values) {
        String temp = "";
        int[] ints = Arrays.stream(values).distinct().sorted().toArray();
        for (int i = 0; i < ints.length; i++) {
            temp += Integer.toString(ints[i]);
        }

        return Integer.parseInt(temp);
    }

    public static int findAverage(int[] nums) {
        return (int) Arrays.stream(nums).average().getAsDouble();
    }

    public static String multiTable(int num) {
        String temp = "";
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total = i * num;
            temp += i + " * " + num + " = " + total + "\n";
        }
        return temp.trim();
    }

    public static String MakeUpperCase(String str) {

        return str.toUpperCase();
    }

    public static int binToDecimal(String inp) {
        // your code here
        return Integer.parseInt(inp, 2);
    }

    public static String[] capitalize(String s) {
        String temp1 = "";
        String temp2 = "";
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            if (i % 2 == 0) {
                temp1 += split[i].toUpperCase();
                temp2 += split[i];
            } else {
                temp1 += split[i];
                temp2 += split[i].toUpperCase();
            }
        }

        return new String[]{temp1, temp2};
    }

    public static String Factorial(int n) {
        int count = n;
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= count;
            count--;
        }

        return String.valueOf(result);
    }

    public static int[] minMax(int[] arr) {
        int[] ints = Arrays.stream(arr).sorted().toArray();
        return new int[]{ints[0], ints[ints.length - 1]};
    }

    public static int[] take(int[] arr, int n) {
        if (arr.length == 0 || arr.length < n) {
            return arr;
        }

        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = arr[i];
        }

        return ints;
    }

    public static String updateLight(String current) {
        if (current.equals("green")) {
            return "yellow";
        } else if (current.equals("yellow")) {
            return "red";
        } else if (current.equals("red")) {
            return "green";
        }

        return "";
    }

    public static String sayHello(String[] name, String city, String state) {
        String temp = "Hello, ";
        for (int i = 0; i < name.length; i++) {
            temp += name[i] + " ";
        }
        String trim = temp.trim();
        trim += "! Welcome to " + city + ", " + state + "!";
        return trim;
    }

    public static char getChar(int c) {
        return (char) c;
    }

    public static String binaryAddition(int a, int b) {
        int x = a + b;
        return Integer.toBinaryString(x);
    }

    public static int bouncingBall(double h, double bounce, double window) {
        if (h == 0) {
            return 0;
        }
        if (h < 0) {
            return -1;
        }

        if (bounce < 0 || bounce > 1) {
            return -1;
        }

        if (window > h) {
            return -1;
        }
        double v = h * bounce;
        if (v < window) {
            return 1;
        }
        double v1 = v / window + 2;
        if (v1 < 0) {
            return -1;
        }
        return (int) v1;
    }

    public static double TwoDecimalPlaces(double number) {

        double scale = Math.pow(10, 2);
        return Math.round(number * scale) / scale;
    }

    public static Integer calculateTip(double amount, String rating) {
        String x = rating.toLowerCase();
        int temp = 0;

        if (x.equals("terrible")) {
            temp = (int) (amount * 0);
        } else if (x.equals("poor")) {
            temp = (int) (amount * .05);
        } else if (x.equals("good")) {
            temp = (int) (amount * .10);
        } else if (x.equals("great")) {
            temp = (int) (amount * .15);
        } else if (x.equals("excellent")) {
            temp = (int) (amount * .20);
        } else {
            return null;
        }

        return temp;
    }

    public static String getMiddle(String word) {
        int length = word.length();
        String result = "";
        if (length == 1) {
            return word;
        } else if (length % 2 == 1) {
            int i = length / 2;
            result += word.charAt(i);
        } else if (length % 2 == 0) {
            int i = length / 2;
            result += word.charAt(i - 1);
            result += word.charAt(i);
        }
        return result;
    }

    public static int sumTriangularNumbers(int n) {
        int count = 0;
        int result = 0;

        if (n < 0) {
            return 0;
        }
        for (int i = 0; i <= n; i++) {
            count = count + i;
            result += count;
        }
        return result;
    }

    public static int squareDigits(int n) {
        String s = Integer.toString(n);
        String[] split = s.split("");
        String temp = "";

        for (int i = 0; i < split.length; i++) {
            temp += Integer.parseInt(split[i]) * Integer.parseInt(split[i]);

        }
        return Integer.parseInt(temp);
    }

    public static int getCount(String str) {
        String s = str.replaceAll("[^aeiou]", "");
        return s.length();
    }

    public static int Past(int h, int m, int s) {
        int temp = 0;
        temp += h * 60 * 60 * 1000;
        temp += m * 60 * 1000;
        temp += s * 1000;

        return temp;
    }

    public static int noBoringZeros(int n) {
        String s = Integer.toString(n);
        String substring = "";
        int x = 0;

        for (int i = s.length() - 1; i > 0; i--) {
            String temp = String.valueOf(s.charAt(i));
            if (temp.equals("0")) {
                substring = s.substring(0, i);
            } else {
                break;
            }
        }

        if (substring.equals("")) {
            throw new NumberFormatException();
        }
        x = Integer.parseInt(substring);
        return x;
    }


    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;
        if (op.equals("+")) {
            result = v1 + v2;
        } else if (op.equals("-")) {
            result = v1 - v2;
        } else if (op.equals("*")) {
            result = v1 * v2;
        } else if (op.equals("/")) {
            result = v1 / v2;
        }

        return result;
    }

    public static boolean isAnagram(String test, String original) {
        char[] chars = test.toLowerCase().toCharArray();
        char[] chars1 = original.toLowerCase().toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.equals(chars, chars1);
    }

    public static String chromosomeCheck(String sperm) {
        if (sperm.equals("XY")) {
            return "Congratulations! You're going to have a son.";
        } else if (sperm.equals("XX")) {
            return "Congratulations! You're going to have a daughter.";
        }
        return sperm;
    }

    public static long[] powersOfTwo(int n) {
        long[] longArray = new long[n + 1];
        long temp = 1;
        for (int i = 0; i <= n; i++) {
            longArray[i] += temp;
            temp = temp + temp;
        }
        for (long x : longArray) {
            System.out.println(x);
        }
        return longArray;
    }

    public static int[] multipleOfIndex(int[] array) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                integerList.add(array[i]);
            }
        }
        int[] ints = integerList.stream().mapToInt(Integer::intValue).toArray();
        return ints;
    }

    public static List<Object> filterList(final List<Object> list) {

        return list.stream().filter(x -> x instanceof Integer).toList();
    }

    public static String order(String words) {
        int count = 1;
        String temp = "";
        String[] splitBySpace = words.split(" ");
        for (int i = 0; i < splitBySpace.length; i++) {
            String[] splitByValues = splitBySpace[i].split("");
            //ASCII 48-57
            for (int j = 0; j < splitByValues.length; j++) {
                if (splitByValues[j].charAt(0) > 48 && splitByValues[j].charAt(0) < 59) {
                    temp += splitByValues[j].replaceAll(splitByValues[j], Integer.toString(count));
                    count++;
                }
            }

        }
        return temp;
    }

    public static String rps(String p1, String p2) {
        // your code

        if (p1 == p2) {
            return "Draw!";
        } else if (p1 == "rock" && p2 == "scissors") {
            return "Player 1 won!";
        } else if (p1 == "scissors" && p2 == "paper") {
            return "Player 1 won!";
        } else if (p1 == "paper" && p2 == "rock") {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }

    public int cockroachSpeed(double x) {
        double result = x * 27.78;
        long round = Math.round(result);
        return (int) round;
    }

    public static int toBinary(int n) {
        String s = Integer.toBinaryString(n);
        return Integer.parseInt(s);
    }

    public static String warnTheSheep(String[] array) {
        int count = 0;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i].equals("sheep")) {
                count++;
            } else {
                break;
            }
        }
        if (count > 0) {
            return "Oi! Sheep number " + count + "! You are about to be eaten by a wolf!";
        }

        return "Pls go away and stop eating my sheep";
    }

    public static int solve(final String s) {
        int result = 0;
        String[] splitByVowels = s.split("[aeiou]");

        for (int i = 0; i < splitByVowels.length; i++) {
            int temp = splitByVowels[i].chars().sum() - 96 * splitByVowels[i].length();
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }


    public static String position(char alphabet) {
        int x = alphabet - 96;
        return "Position of alphabet: " + x;
    }

    public static long numberOfDivisors(int n) {
        int count = 0;
        while (true) {
            if (n == 1) {
                break;
            } else {
                n = n / 2;
                count++;
            }

        }
        System.out.println(count);
        return count;
    }

    public static int enough(int cap, int on, int wait) {
        int temp = on + wait;
        if (cap < temp) {
            return temp - cap;
        } else {
            return 0;
        }
    }

    public static long sumCubes(long n) {
        long cube = 0;
        for (long i = 0; i <= n; i++) {
            cube += i * i * i;
        }
        return cube;
    }

    public static String greet(String name) {
        return "Hello" + " " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!";
    }

    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];
        for (int i = 0, astrsk = 1, spaces = nFloors - 1; i < nFloors; i++, astrsk = astrsk + 2, spaces--) {
            tower[i] = "";
            for (int j = 0; j < spaces; j++) {
                tower[i] += " ";
            }
            for (int j = 0; j < astrsk; j++) {
                tower[i] += "*";
            }
            for (int j = 0; j < spaces; j++) {
                tower[i] += " ";
            }

        }
        return tower;
    }

    public static int findShort(String s) {
        String[] splitBySpaces = s.split(" ");
        int length = splitBySpaces[0].length();
        for (int i = 0; i < splitBySpaces.length; i++) {
            if (splitBySpaces[i].length() < length) {
                length = splitBySpaces[i].length();
            }
        }
        return length;
    }

    public static int nthPower(int[] array, int n) {
        if (array.length <= n) {
            return -1;
        }
        int result = array[n];
        for (int i = 1; i < n; i++) {
            result *= array[n];
        }
        return result;
    }

    public static int minSum(int[] numbers) {
        java.util.Arrays.sort(numbers);
        int min = 0;

        for (int i = 0; i < numbers.length / 2; i++) {
            min += numbers[i] * numbers[numbers.length - 1 - i];
        }
        System.out.println(min);
        return min; // Do your magic!
    }

    public static void main(String[] args) {
        minSum(new int[]{5,4,2,3});
    }
}
