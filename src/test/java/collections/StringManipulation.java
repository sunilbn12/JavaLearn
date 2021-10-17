package collections;

public class StringManipulation {

    public static void main(String[] args) {
        String str = "I am good in java";

        String[] words = str.split(" ");

        String finalStr = "";
        for (int i = words.length - 1; i >= 0; i--) {
            finalStr = finalStr + words[i];
        }

        System.out.println(finalStr);
    }
}
