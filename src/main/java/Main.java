public class Main {
    public static void main(String[] args) {
        int rozmiar = 5;

       
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(); 

        
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == rozmiar - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(); 

        
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar - i - 1; j++) {
                System.out.print(" "); 
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(); 

        
        for (int i = 0; i < rozmiar; i++) {
            
            for (int j = 0; j < rozmiar - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == rozmiar - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
