// Programming assignment 5 problem 5
// Print triangles with asterisk

public class Triangles
{
    public static void main(String[]args)
    {
        int n = 10;
        int spaces = n;
        int ast;

        

         for(int i = 0; i < n; i++)

         {
            ast = i+1;
            for(int j = 1; j <= spaces+ast; j++)
            {
                if(j <= spaces)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }

            
            System.out.println();
            spaces--;
        }
    }
}