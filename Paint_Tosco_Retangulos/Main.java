import  poo.edgraf.reprodutor.gen.*;
import java.awt.Color;
import  java.awt.*;
import  java.awt.event.*;
import static java.lang.System.*;

class Main {
  static GQuadro<Reproduzivel> quadro;
  public static void main(String[] pars) {

    quadro = GQuadro.mkDefaultGUI(600,400);
    Reproduzivel palCor1 = new FigRetangulo(new Ponto(10,10),new Ponto(20,20),Color.red);
    Reproduzivel palCor2 = new FigRetangulo(new Ponto(30,10),new Ponto(40,20),Color.green);
    Reproduzivel palCor3 = new FigRetangulo(new Ponto(50,10),new Ponto(60,20),Color.blue);
    
    quadro.addFig(palCor1);
    quadro.addFig(palCor2);
    quadro.addFig(palCor3);
    quadro.repaint();
    

    quadro.addMouseListener(new EdRetangulo());
    
    
  }
  
}//

class EdRetangulo implements MouseListener {
  private int q = 0; /*
  q == 0: esperando 1ro ponto 
  q == 1: esperando 2ro ponto */
  int x0,y0;
  Color cor = Color.white;
  
  public void  mouseClicked(MouseEvent e) {
    int x = e.getX(),
        y = e.getY();
    out.println("("+ x + "," + y + ")");
    
    if(q==0)
    {
    	if((x>=10 && x<=20) && (y >= 10 && y<=20))
        {
        	cor = Color.red;
        }
        
    	else if((x>=30 && x<=40) && (y >= 10 && y<=20))
        {
        	cor = Color.green;
        }
        
    	else if((x>=50 && x<=60) && (y >= 10 && y<=20))
        {
        	cor = Color.blue;
        }
    	
    	else
    		q=1;
    }
    
    if (q == 1) 
    {
      x0 = x;
      y0 = y;
    }
    
    if(q == 2) {
    	
    	if(cor == Color.white)
    	{}
    	else
    	{
    		Main.quadro.addFig(new FigRetangulo(
                new Ponto(x0,y0),
                new Ponto(x,y), cor));
    	}
    }

    q = (q + 1)%3;
    Main.quadro.repaint();
  }
  public void  mouseEntered(MouseEvent e){}
  public void  mouseExited(MouseEvent e){}
  public void  mousePressed(MouseEvent e){}
  public void  mouseReleased(MouseEvent e){}

}

class FigRetangulo extends Retangulo implements Reproduzivel {
   
	private Color cor;
	
   FigRetangulo(Ponto p1, Ponto p2, Color c) {
     super(p1,p2);
     cor = c;
   }

   public void reproduzir(Graphics g) {
	g.setColor(cor);
    g.fillRect(this.x0(),this.y0(),this.largura(),this.altura()); 
    
  }

}