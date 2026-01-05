package sep291993;

public class SwitchCase {
    public static void main(String[] args){
        int a=20;
        switch (a){
            case 10:
                System.out.println("value of a is 10");
                break;
            case 20:
                System.out.println("value of a is 20");
                break;
            case 30:
                System.out.println("value of a is 30");
                break;

            default:
                System.out.println(""+a);
                break;
        }
        String s3="Hello world";
        switch (s3){
            case "Hello":
                System.out.println("string hello");
                break;
            case "Hello wor":
                System.out.println("string hello wor");
                break;
            case "Hello world":
                System.out.println("string hello world");
                break;
            default:
                System.out.println(s3);
                break;
        }

    }
}
