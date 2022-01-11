import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
public class CSV {
    final static char SEPARATEUR_CSV = ',';
    final static char OUT_CSV = ';';
    final static char GUILLEMET = '"';

    static ArrayList<String> traiterLigne(String ligne) {
        ArrayList<String> newLine = new ArrayList<>();
        int i = 0;
        String terme = "";
        while (i < ligne.length()) {
            char c = ligne.charAt(i++);
            if (c == GUILLEMET) {
                System.out.println(terme + "/");
                terme = "";
            } else {
                terme += c;
            }
        }
        if (terme.length() > 0) newLine.add(terme);
        return newLine;
    }

    public static void afficherLigne(ArrayList<String> ligne) {
        String str = "";
        for (int i = 0; i < ligne.size(); i++) {
            str += ligne.get(i);
        }
        System.out.println(str);
    }

    public String getLigne(ArrayList<String> ligne) {
        String res = "";
        int i = 0;
        for (String token : ligne) {
            if (i > 0) res += OUT_CSV;
            res += token;
            i++;
        }
        return res;

    }

    public void lire(String file) {
        file = "Fichier.csv";
        ArrayList<String> tab;
        try {
            Scanner in = new Scanner(new File(file));
            String ligne;
            while (in.hasNext()) {
                ligne = in.nextLine();
                tab = traiterLigne(ligne);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public String toString() {
        return super.toString();
    }

    //GOOD
    public String traiterToken(String token, boolean guillemet) {
        if (!guillemet) return token;
        boolean aSeparateur = false;
        int i = 0;
        while (i < token.length() && !aSeparateur) {
            char c = token.charAt(i++);
            if(c == SEPARATEUR_CSV){
                aSeparateur= true;
            }
        }
        if (aSeparateur)token=GUILLEMET+token+GUILLEMET;
        return token;
    }


    public static void ecrire(String dest) {
        try {
            PrintWriter out = new PrintWriter(dest);
            out.println(this);
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

    }

    public void supprimerTerme(int numligne, int numterme) {
        try {
            ArrayList<String> ligne = CSV.get(numligne);
            ligne.remove(numterme);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Supprimer mot : indice hors limite");
        }
    }

    public void supprimerLigne(int numligne) {
        try {
            CSV.remove(numligne);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bound");
        }
    }


    public static void main(String[] args) {
        String file = "Fichier.csv";
        CSV csv = new CSV();
        csv.lire(file);
        System.out.println("\nContenu du fichier csv ...");
        System.out.println(csv);
        csv.ecrire("/tmp/testRes.csv");
        System.exit(1);

        csv.supprimerTerme();
        csv.supprimerLigne();
    }
}


 */