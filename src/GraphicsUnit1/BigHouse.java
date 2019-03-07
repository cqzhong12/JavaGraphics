package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.LIGHT_GRAY);

      window.fillRect( 200, 200, 380, 300 );
      window.setColor(Color.PINK);
      window.fillRect (350, 375, 80, 125);
      window.setColor(Color.ORANGE);
      window.fillRect(180, 180, 420, 30);
      window.fillRect(200, 150, 380, 30);
      window.fillRect(220, 120, 340, 30);
      window.setColor(Color.GRAY);
      window.fillRect(270, 60, 70, 60);
      window.setColor(Color.WHITE);
      window.fillRect(260, 260, 80, 60);
      window.fillRect(436, 260, 80, 60);
      window.setColor(Color.BLUE);
      window.drawLine(300, 260 , 300, 318);
      window.drawLine(260, 290, 338, 290);
      window.drawLine(436, 290, 514, 290);
      window.drawLine(476, 260, 476, 318);
     
   }
}