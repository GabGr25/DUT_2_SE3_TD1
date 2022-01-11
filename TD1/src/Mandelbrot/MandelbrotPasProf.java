package Mandelbrot;

public class MandelbrotPasProf {
    /** Creates a new instance of Mandelbrot */

    public int iteration;
    public int[][] divergence;
    public int nh;
    public int nv;
    private double haut,bas,gauche,droite;
    public MandelbrotPasProf(){
        iteration=128;
        nh=400;
        nv=400;
        divergence=new int[nh][nv];
        haut=2;
        bas=-2;
        gauche=-2;
        droite=2;
        calcul();

    }
    public void calcul(){
        int n=0;
        for(int i=0;i<nh;i++){
            for(int j=0;j<nv;j++){
                Complexe c=new Complexe((droite+(i/((double)(nh)))*(gauche-droite)),(bas+(j/((double)(nv)))*(haut-bas)));
                Complexe z=new Complexe(0,0);
                n=0;
                while((n<iteration) && (z.norme2()<4)){
                    n++;
                    z=(z.carre()).somme(c);
                }
                if(n<iteration)
                    divergence[i][j]=n;
                else
                    divergence[i][j]=0;
            }
        }

    }
}

