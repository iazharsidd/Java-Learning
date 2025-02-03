import java.util.Scanner;

public class votingSystem 
{
    static void checkEligibility(int age)
    {
        if (age < 18 ) 
        {
            throw new TooYoungToVoteException("age should be 18 or greater");
        } else {
            System.out.println("ELigible to vote. Age:"+age);
        }
    }
    public static void main(String[] args) 
    {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        try {
            checkEligibility(age);
        } catch (Exception e) {
            //handle exception
            System.out.println("Exception caught: "+e.getMessage());
        }

    }
}
