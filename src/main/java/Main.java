public class Main {
    public static void main(String[] args) {
        int rozmiar = 5; 

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
