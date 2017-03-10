package Ventanas;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class JPanelFondo extends JPanel{

    private BufferedImage image;

    public JPanelFondo() {
       try {                
          image = ImageIO.read(new File("src/imgs/Pregunta.png"));
       } catch (IOException ex) {
            // handle exception...
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 20, 0, this); // see javadoc for more info on the parameters            
    }

}

