import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    class Subst{
        String keywords, value;
    }
    ArrayList<Subst> Listkeywords =new ArrayList<>();
    void lireSubstitutions(String filename) throws IOException{
        try {
            Scanner in= new Scanner(new File(filename));
            in.useLocale(Locale.US);
            in.useDelimiter("\t");
            while(in.hasNext()){
                Subst keyword =new Subst();
                keyword.keywords = in.next().toLowerCase(Locale.ROOT);
                keyword.value = in.next().toLowerCase(Locale.ROOT);
                Listkeywords.add(keyword);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
    void afficherListe(){
        if(this.Listkeywords.size()==0){
            System.out.println("Liste vide");
        }else{
            System.out.println("\t Liste des substitutions :");
            for(Subst subst: Listkeywords)
                System.out.println("keyword=("+subst.keywords+"),value=("+subst.value+")");
        }
    }
    void remplacer(String src, String dest) throws IOException{
        try{
            Scanner in = new Scanner(new File(src));
            in.useLocale(Locale.US);
            while(in.hasNext()){

            }
        }
        catch (Exception e ){
            e.printStackTrace();
            System.exit(1);
        }
    }
    static public void main(String[] args){
        try{
            String keywords = "keywords.txt";
            String src= "source.txt";
            String dest = "destination.txt";
            Ex4 r=new Ex4();
            r.lireSubstitutions(keywords);
            r.remplacer(src,dest);
        }
        catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}

