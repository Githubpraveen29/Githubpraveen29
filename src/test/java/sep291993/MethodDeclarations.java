package sep291993;

public class MethodDeclarations {
    public static void main(String[] args){
        //static-->It is a keyword that is used to define the method as a static method
int output;
        output=multiplyNumber(2,3,4);
        //System.out.println(output);
        int pra;
        pra=performcal(2,3,'+');
        System.out.println(pra);
    }
    public static int multiplyNumber(int...a){
    int result =1;
    for(int num:a){
        result *=num;
        System.out.println(result);
    }
        return result;

    }
    public static int  performcal(int a, int b, char op){
        return  switch (op){
            case '+'->a+b;
            case '-'->a-b;
            case '*'->a*b;
            case '/'->a/b;
            case '%'->a%b;
                default -> -1;
        };
    }
}
