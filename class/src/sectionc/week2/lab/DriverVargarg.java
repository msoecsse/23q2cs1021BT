package sectionc.week2.lab;

public class DriverVargarg {

    public static void main(String[] args) {

        String a = "Hello";
        String b = "Goodbye";

        System.out.println(combiner(1,a));
        System.out.println(combiner(1,a,b));
        System.out.println(combiner(1));

    }

    public static String combiner(int a, String... words){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            s.append(words[i]);
        }
        return s.toString();
    }

}
