import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Game1 extends Applet implements MouseListener,MouseMotionListener{
AudioClip au=null;
 int x,flagx,flagy,y,a,b,c,d,p,q,start=1;
 String s;
 public void init(){
 au=getAudioClip(getCodeBase(),"baseball_hit.wav");
  x=0;
  y=0;
  a=0+a;
  b=90+b;
  c=180+c;
  d=270+d;
  q=470;
   addMouseListener(this);  
   addMouseMotionListener(this);
 }
 
  public void mouseClicked(MouseEvent e){ }
  public void mousePressed(MouseEvent e){ }
  public void mouseReleased(MouseEvent e){ }
  public void mouseEntered(MouseEvent e){ }
  public void mouseExited(MouseEvent e){
  }
  public void mouseMoved(MouseEvent e){
    p=e.getX();
   repaint();
 }
 public void mouseDragged(MouseEvent e){ }
 public void paint(Graphics g){
    if(start==1){
  g.setColor(Color.red);
  g.fillArc(x,y,100,100,a,90);
  g.setColor(Color.green);
  g.fillArc(x,y,100,100,b,90);
  g.setColor(Color.yellow);
  g.fillArc(x,y,100,100,c,90);
  g.setColor(Color.blue);
  g.fillArc(x,y,100,100,d,90);
  setBackground(Color.pink);
  g.fillRect(p-75,q,150,30);
  if(x==0){
     au.play();
     flagx=0;
	 }
   if(x==900){
     au.play();
     flagx=1;
	 }
   if(y==0){
     au.play();
     flagy=0;
     }
  if(x>=(p-125)&&x<=(p+175)&&y==370){
     au.play();
     flagy=1;
	 }
  else if( (x<(p-125) || x>(p+175)) && y==370){
      start=0;
  }
	 
 if(flagx==0)
  {
    x++;
	a--;
	b--;
	c--;
	d--;
  } 
  else {
	  x--;
	  a++;
	  b++;
	  c++;
	  d++;
	}
  if(flagy==0)
    {
	  y++;
	}
  else
     {
	   y--;
	 }
         try{
            Thread.sleep(6);
           }
        catch(InterruptedException e){}
		repaint();
		}
		else{
		     g.drawString("Game Over",100,200);
		}
 }
  /*<applet code="Game1.java" width=1000 height=500> </applet>*/
} 