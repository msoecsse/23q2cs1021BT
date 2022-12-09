package sectiona.week2.lab;

public class ElipsisExample {

    public static void main(String[] args) {

        String a = "Hello";
        String b= "Goodbye";

        System.out.println(combiner(a));

        System.out.println(combiner(a,b));

    }

    public static String combiner(String... list){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i<list.length; i++){
            s.append(list[i]);
        }
        return s.toString();
    }

}
