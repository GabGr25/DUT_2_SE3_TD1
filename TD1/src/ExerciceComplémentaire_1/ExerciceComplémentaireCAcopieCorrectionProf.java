package ExerciceComplémentaire_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;
import java.util.Locale;

public class ExerciceComplémentaireCAcopieCorrectionProf{
    public static void main(String[] args) {
        String fileIn = "CA.txt";
        String fileOut = "recap.txt";
        try {
            Scanner in = new Scanner(new File(fileIn));
            PrintWriter out = new PrintWriter(new File(fileOut));
            
            in.useLocale(Locale.US);  // pour lire les réels 
            in.useDelimiter("\\t|\\n");
            
            String ligne = in.nextLine();
            
            if (in.hasNext() ) {
              String dernMag = in.next();
              int derniAnn = in.nextInt();
              int mois = in.nextInt();
              double chiffreAffAnn = in.nextDouble();                        
              out.println("Magasin" + "\t" + "Année" + "\t" + "CA");
              while (in.hasNext()) {
                String mag = in.next();
                int annee = in.nextInt();
                int mn = in.nextInt();
                double chiffreAff = in.nextDouble();

                if (dernMag.equals(mag)) {
                    if (derniAnn == annee) {
                        chiffreAffAnn += chiffreAff;
                    } else {
                        out.format("%s\t%d\t%5.2f\n", dernMag, derniAnn, chiffreAffAnn);
                        derniAnn = annee;
                        chiffreAffAnn += chiffreAff;
                    }
                } else {
                    out.format("%s\t%d\t%5.2f\n", dernMag, derniAnn, chiffreAffAnn);
                    dernMag = mag;
                    derniAnn = annee;
                    chiffreAffAnn = chiffreAff;
                }
              }
              out.format("%s\t%d\t%5.2f\n", dernMag, derniAnn, chiffreAffAnn);
            }
            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}


