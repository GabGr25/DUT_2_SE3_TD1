package ExerciceComplémentaire_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class Tristan {

    public static void main (String[]args){
        String fileIn = "/home/Tristan/Documents/SE3/ExerciceComplementaire1/src/CA.txt";
        String fileOut = "recap.txt";
        try {
            Scanner in = new Scanner(new File(fileIn));
            PrintWriter out = new PrintWriter(fileOut);
            String line = in.nextLine();
            String lastShop = "";
            int lastYear = 0;
            double CAY = 0;
            out.println("Magasin" + "\t" + "Année" + "\t" + "CA");
            while (in.hasNext()) {
                String shop = in.next();
                if (Objects.equals(shop, "La")) shop += " " + in.next(); // Pour fix le problème avec La Bassée
                int year = in.nextInt();
                int mn = Integer.parseInt(in.next());
                double ca = Double.parseDouble(in.next());

                if (Objects.equals(lastShop, "")) lastShop = shop;
                if (lastYear == 0) lastYear = year;

                if (Objects.equals(lastShop, shop)) {
                    if (lastYear == year) {
                        CAY += ca;
                    } else {
                        out.println(shop + "\t" + lastYear + "\t" + CAY); // On affiche le truc d'avant (Même magasin mais pas même année)
                        lastYear = year;
                        CAY = ca;
                    }
                } else {
                    out.println(lastShop + "\t" + lastYear + "\t" + CAY); // On affiche le magasin d'avant
                    lastShop = shop;
                    lastYear = year;
                    CAY = ca;
                }
                line = in.nextLine();
            }
            out.println(lastShop + "\t" + lastYear + "\t" + CAY); // Affichage de la dernière année du dernier shop

            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}