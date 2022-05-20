package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//Gather user input (infile, outfile, and transform)
//Read the input bitmap file
//Parse the bitmap’s data into a Bitmap object (instance of a Bitmap class that you write)
//Using data from the parsed Bitmap, run a transform on the data directly (mutate the color or similar)
//Write the mutated image data to the output file path
public class Bitmap {
    String inputFilePath;
    String outputFilePath;

    public Bitmap(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;

    }

    public void transform(String arg) throws IOException {
        BufferedImage img0 = null;
        File bb = new File(this.inputFilePath);
        img0 = ImageIO.read(bb);
        for (int i = 0; i < img0.getWidth(); i++) {
            for (int j = 0; j < img0.getHeight(); j++) {
                Color color = new Color(img0.getRGB(i, j));
                int red = (int) (color.getRed() * 0.3);
                int green = (int) (color.getGreen() * 0.6);
                int blue = (int) (color.getBlue() * 0.1);
                Color newColors = new Color(red + green + blue, red + green + blue, red + green + blue);
                img0.setRGB(i, j, newColors.getRGB());
            }
            File cc = new File(this.outputFilePath);
            ImageIO.write(img0, "bmp", cc);
        }
    }
}