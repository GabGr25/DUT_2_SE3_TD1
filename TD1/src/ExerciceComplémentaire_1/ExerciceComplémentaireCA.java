package ExerciceComplémentaire_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class ExerciceComplémentaireCA {
    public static void main(String[] args) {
        String fileIn = "/Users/gab/Desktop/Cours/2nd année/SE3/TD1/src/ExerciceComplémentaire_1/CA.txt";
        String fileOut = "recap.txt";
        try {
            Scanner in = new Scanner(new File(fileIn));
            PrintWriter out = new PrintWriter(new File(fileOut));
            String ligne = in.nextLine();
            String dernMag = "Start";
            int derniAnn = 0;
            double chiffreAffAnn = 0;
            out.println("Magasin" + "\t" + "Année" + "\t" + "CA");
            while (in.hasNext()) {
                String mag = in.next();
                if (Objects.equals(mag, "La")) mag += in.next();
                int annee = in.nextInt();
                int mn = Integer.parseInt(in.next());
                double chiffreAff = Double.parseDouble(in.next());

                if (Objects.equals(dernMag, "Start")) dernMag = mag;
                if (derniAnn == 0) derniAnn = annee;

                if (Objects.equals(dernMag, mag)) {
                    if (derniAnn == annee) {
                        chiffreAffAnn += chiffreAff;
                    } else {
                        out.println(mag + "\t" + derniAnn + "\t" + chiffreAffAnn);
                        derniAnn = annee;
                        chiffreAffAnn += chiffreAff;
                    }
                } else {
                    out.println(dernMag + "\t" + derniAnn + "\t" + chiffreAff);
                    dernMag = mag;
                    derniAnn = annee;
                    chiffreAffAnn = chiffreAff;
                }
            }
            out.println(dernMag + "\t" + derniAnn + "\t" + chiffreAffAnn);

            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}


