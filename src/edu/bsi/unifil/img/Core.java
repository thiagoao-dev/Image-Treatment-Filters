package edu.bsi.unifil.img;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;

public class Core {
    
    private String        imagemName;
    private BufferedImage inputImage;
    private BufferedImage outputImage;
    
    /**
     * Carrega a imagem
     * @param name
     * @return self
     */
    public Core loadImage(String name)
    {
        this.imagemName = name;
        
        try {
            this.inputImage = ImageIO.read(new File(this.imagemName));
            this.outputImage = new BufferedImage( 
                this.inputImage.getWidth(), 
                this.inputImage.getHeight(), 
                BufferedImage.TYPE_INT_RGB);
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        return this;
    }
    
    public Core histograma()
    {
        return this;
    }
    
    public Core sobel()
    {
        return this;
    }
        
    /**
     * Gera a mediana da imagem
     * @return self
     * @see mediana.jpg
     */
    public Core mediana()
    {
        int rgb[];
        for (int y = 1; y < this.inputImage.getHeight() - 1; y++) {
            for (int x = 1; x < this.inputImage.getWidth() - 1; x++) {
                rgb = this.getMatrix(y, x);
                int blue = 0, green = 0, red = 0;
                for (int i = 0; i < rgb.length; i++){
                    blue  += 0x0000ff & rgb[i];
                    green += 0x0000ff & (rgb[i] >> 8);
                    red   += 0x0000ff & (rgb[i] >> 16);
                }
                this.outputImage.setRGB(x, y, (blue/9) | ( (green/9) << 8) | ( (red/9) << 16));
            }
        }
        this.writeImage("mediana.jpg");
        return this;
    }
    
    /**
     * Gera a media da imagem
     * @return self
     * @see media.jpg
     */
    public Core media()
    {
        int rgb[];
        for (int y = 1; y < this.inputImage.getHeight() - 1; y++) {
            for (int x = 1; x < this.inputImage.getWidth() - 1; x++) {
                rgb = this.getMatrix(y, x);
                Arrays.sort(rgb);
                this.outputImage.setRGB(x, y, rgb[4]);
            }
        }
        this.writeImage("media.jpg");
        return this;
    }
    
    /**
     * Retorna submatrix de 3x3
     * @param y int
     * @param x int
     * @return int[]
     */
    private int[] getMatrix(int y, int x)
    {
        int r[] = new int[9]; int count = 0;
        for (int y2 = y-1; y2 < y+2; y2++) {
            for (int x2 = x-1; x2 < x+2; x2++) {
                r[count] = this.inputImage.getRGB(x2, y2); count++;
            }
        }
        return r;
    }
    
    /**
     * Salva a imagem
     * @param name String
     * @return self
     */
    private Core writeImage(String name)
    {        
        try {            
            ImageIO.write(this.outputImage, "jpg", new File("src/saida/"+name));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return this;
    }
}
