package StringExercices;

public class URLify {

    public static void main(String[] args) {

        String test = "Mr John Smith     ";

        System.out.println(URLify(test));
    }

    public static String URLify(String str){

        String result = "";

        result = str.substring(0, 13);
        result = result.replace(" ", "%20");

        return result;

    }

}
