package sep291993;

public class ConditionalStatements {
    public static void main(String[] args){
        //1.IF
        //2.If-Else
        //3.If Else If
        int a=20;
        if (a==10){
            System.out.println("The value of a is 10");
        }else{
            System.out.println( "Value is not 10");
        }
        a=40-20*100;
        System.out.println(a);
        if(a%5==0)
            System.out.println("by 5");
        else
            System.out.println("by 7");
        String s1="  ";
        if(s1.isEmpty()){
            System.out.println("isEmpty");
        }else if(s1.isBlank()){
            System.out.println("isBlank");
        }else {
            System.out.println("None of these");
        }
    }
}
