package sectiona.week1;

public class Rot {

    public static void main(String[] args) {
        Rot a = new Rot();

        String phrase = "The quick brown fox jumped over the lazy dog.";

        System.out.println(a.encode(phrase,5));
    }

    public String encode(String phrase, int rotation){

        StringBuilder collect = new StringBuilder();

        //'a' 97
        //'z' 122

        for(int i = 0; i<phrase.length(); i++){

            char current;

            current = phrase.charAt(i);

            current += rotation;

            if(current > 122){
                current = (char)(97 + (current % 122));
            }

            if(current == ' ' + rotation){
                current = ' ';
            }


            collect.append(current);
        }

        return collect.toString();

    }

}
