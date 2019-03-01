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

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );
      window.setColor(Color.GRAY);
      
      head(window);
      upperBody(window);
      lowerBody(window);
      
      //call head method
      
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.GRAY);
		//add more code here
      window.fillRect(330, 220, 10, 100);
      window.fillRect(380, 220, 10, 100);
      window.fillRect(270, 250, 50, 10);
      window.fillRect(300, 240, 100, 75);
				
   }

   public void upperBody( Graphics window )
   {
		//add more code here
      window.fillRect(300, 240, 100, 120);
      window.fillRect(400, 250, 50, 10);
      window.fillRect(240, 240, 120, 120);
      window.fillRect(300, 240, 120, 120);
   }

   public void lowerBody( Graphics window )
   {

		//add more code here

   }
}