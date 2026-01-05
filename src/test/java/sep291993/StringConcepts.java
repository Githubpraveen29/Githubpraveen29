package sep291993;

public class StringConcepts {
    public static void main(String[] args){
        String b="This is my first string program that we are discussing";
        //String b="this ";
        System.out.println(b.length());
        //System.out.println(b.isBlank());
        System.out.println(b.isEmpty());
        System.out.println(b.startsWith("is"));
        System.out.println(b.startsWith("This"));
        System.out.println(b.startsWith("this"));
        System.out.println(b.endsWith("scussing"));
        System.out.println(b.contains("ring"));
        System.out.println(b.contains("first"));
        System.out.println(b.concat(" praveen"));
        b=b.concat(" praveen");
        System.out.println(b);
        System.out.println(b.charAt(20));
        System.out.println(b.substring(20,34));
    }
}
