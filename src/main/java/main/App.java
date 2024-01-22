package main;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hedgehog siili = new Hedgehog();

        int valinta;
        
        do {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            valinta = scanner.nextInt();

            if (valinta == 1) {
                    System.out.println("Mitä siili sanoo:");
                    scanner.nextLine();
                    String puhe = scanner.nextLine();
                    siili.puhu(puhe);
            } else if (valinta == 2) {
                    System.out.println("Anna siilin nimi:");
                    String nimi = scanner.next();
                    System.out.println("Anna siilin ikä:");
                    int ika = scanner.nextInt();
                    siili = new Hedgehog(nimi, ika);
            } else if (valinta == 3) {
                    System.out.println("Kuinka monta kierrosta?");
                    int kierrokset = scanner.nextInt();
                    siili.run(kierrokset);
            } else if (valinta == 0) {
                
                    System.out.println("Kiitos ohjelman käytöstä.");
            } else {

                    System.out.println("Syöte oli väärä");
            }

        } while (valinta != 0);

        scanner.close();
    }
}
