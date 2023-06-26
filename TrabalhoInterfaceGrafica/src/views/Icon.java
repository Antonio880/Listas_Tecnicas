package views;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Icon extends ImageIcon{
	    private int width;
	    private int height;

	    public Icon(String image,int width, int height) {
	        super(image);
	        this.width = width;
	        this.height = height;
	        resizeImage();
	    }

	    private void resizeImage() {
	        Image originalImage = getImage();
	        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	        setImage(resizedImage);
	    }
}
