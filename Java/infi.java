public class infi {
    public static void main(String[] args) {
        int x = 5;

        for (int i = 1; i<=5; i++)
        {
            for(int j = 1; j<=i; j++)
            System.out.print("* ");
        

        int spaces = 2 * (x-i);
        for(int j = 1; j <= spaces; j++)
        {
            System.out.print("  ");
        }
        
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println();
        
    }
    for (int i = x; i>=1; i--)
        {
            for(int j = 1; j<=i; j++)
            System.out.print("* ");
        

        int spaces = 2 * (x-i);
        for(int j = 1; j <= spaces; j++)
        {
            System.out.print("  ");
        }
        
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println();
        
    }
    
}
}