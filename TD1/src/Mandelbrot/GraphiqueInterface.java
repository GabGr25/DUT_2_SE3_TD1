package Mandelbrot;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphiqueInterface extends Frame{
    int[][] divergence;
    public GraphiqueInterface(int[][] G) {
        this.setSize(G.length,G[0].length);
        divergence=G;
        this.setBackground(Color.white);
        addWindowListener(new Fermeur());
    }

    public void paint(Graphics g){
        for(int i=0;i< divergence.length;i++){
            for(int j=0;j< divergence[0].length;j++){
                if(divergence[i][j]!=0){
                    g.setColor(Color.black);
                    g.drawLine(i,j,i,j);
                }
            }
        }

    }
    public static void main(String[] args){
        MandelbrotPasProf x = new MandelbrotPasProf();
        GraphiqueInterface i= new GraphiqueInterface(x.divergence);
        i.show();

    }
    class Fermeur extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
