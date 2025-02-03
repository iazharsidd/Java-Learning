public class HollowEquilateralTriangle
 {
    public static void main(String[] args) 
    {
        int rows = 5; // Specify the number of rows in the triangle

        for (int i = 1; i <= rows; i++) 
        {
            // Print spaces for the left side of the triangle
            for (int j = 1; j <= rows - i; j++) 
            {
                System.out.print(" ");
            }

            // Print stars for the top and bottom of the triangle
            if (i == 1 || i == rows) 
            {
                for (int j = 1; j <= i * 2 - 1; j++) 
                {
                    System.out.print("*");
                }
            } 
            else
            {
                // Print star and spaces for the sides of the triangle
                System.out.print("*");
                for (int j = 1; j <= i * 2 - 3; j++) 
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
