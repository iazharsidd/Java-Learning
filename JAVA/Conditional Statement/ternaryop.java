public class ternaryop {
    public static void main(String[] args) {
        int n=6;
        // teranry operator
        // variable = conditon? statement1 : statement2;
        //                      true          false
        String str =((n%2)==0)?"even":"odd";
        System.out.println(str);
    }
}
