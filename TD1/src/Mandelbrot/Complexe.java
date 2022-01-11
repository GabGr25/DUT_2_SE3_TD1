package Mandelbrot;

public class Complexe {
    /** Creates a new instance of Complexe */

    public double x;
    public double y;
    public Complexe(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Complexe() {
    }
    public Complexe somme(Complexe a){
        return new Complexe(a.x+x,a.y+y);
    }
    public Complexe carre(){
        return new Complexe(x*x-y*y,+2*x*y);
    }
    public double norme2(){
        return x*x+y*y;
    }
    public String toString(){
        if(y>0)
            return x+"+i "+y;
        if(y<0)
            return x+"-i "+(-y);
        return x+"";
    }
}

