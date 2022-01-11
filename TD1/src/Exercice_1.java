import java.io.*;
import java.util.Random;
import java.util.Scanner;


public class Exercice_1 {
    static String[] jours;


    static void ecrire(String filename) {
        try {
            PrintWriter out = new PrintWriter(filename);
            Random random = new Random();
            int annee = 2021;
            for (int mois = 1; mois < 13; mois++) {
                for (int jour = 1; jour < 32; jour++) {
                    double temp = random.nextInt(400) / 10.0 - 10;
                    //out.println(jour + "/" + mois + "/2021 " + );
                    out.format("%d/%d/%d %.2f\n", jour, mois, annee, temp);
                }
            }


            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    static void lire(String filename) {
        //limitation de ce programme: je ne peux l'utiliser que pour une année.
        try {
            Scanner in = new Scanner(new File(filename));
            int jour, mois, annee, nbJours = 0;
            int nb;
            int moisEnCours = 0;
            double somme = 0.0;
            in.useDelimiter("/|\\s+");//soit '/' ou soit un ensemble d'espace

            while (in.hasNext()) {
                jour = in.nextInt();
                mois = in.nextInt();
                annee = in.nextInt();
                double temp = in.nextDouble();
                somme += temp;
                nbJours++;
                if (moisEnCours != mois) {
                    if (moisEnCours > 0 && nbJours > 0) {
                        System.out.format(" Moyenne du  mois %d = %,2f\n", moisEnCours, somme / nbJours);
                    }
                    moisEnCours = mois;
                    somme = 0.0;
                    nbJours = 0;
                }
                somme += temp;
                nbJours++;

                //System.out.println(jour + "/" + mois + "/" + annee + "    " + temp + "  " + "    " + somme / (jour * mois));
            }
            if (nbJours > 0) System.out.format("Moyenne du mois %d : %,3f", moisEnCours, somme / nbJours);

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        ecrire("TEMP.txt");
        lire("TEMP.txt");
    }

}