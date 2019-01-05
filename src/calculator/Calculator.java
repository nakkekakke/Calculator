package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        while(true) {
            System.out.println("Syötä ensimmäinen luku: ");
            Scanner scanner = new Scanner(System.in);
            int eka = Integer.parseInt(scanner.next());
            System.out.println("Syötä toinen luku: ");
            int toka = Integer.parseInt(scanner.next());
            System.out.println("Plussataanko, vähennetäänkö, kerrotaanko vai jaetaanko?");
            System.out.println("1, 2, 3 vai 4?");
            String oper = scanner.next();
            
            int tulos;
            
            if (oper.equals("1")) {
                tulos = eka + toka;
            } else if (oper.equals("2")) {
                tulos = eka - toka;
            } else if (oper.equals("3")) {
                tulos = eka * toka;
            } else {
                tulos = eka / toka;
            }
            System.out.println(tulos);
        }
    }
    
}
