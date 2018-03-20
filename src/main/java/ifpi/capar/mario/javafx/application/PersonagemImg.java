package ifpi.capar.mario.javafx.application;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

/**
 * 
 * @author jjpaulo2
 *
 */

public enum PersonagemImg {
	
	MARIO_DIREITA(new ImagePattern(new Image("ifpi/capar/mario/javafx/img/marioDireita.png"))),
	MARIO_ESQUERDA(new ImagePattern(new Image("ifpi/capar/mario/javafx/img/marioEsquerda.png"))),
	LUIGI_DIREITA(new ImagePattern(new Image("ifpi/capar/mario/javafx/img/luigiDireita.png"))),
	LUIGI_ESQUERDA(new ImagePattern(new Image("ifpi/capar/mario/javafx/img/luigiEsquerda.png")));
	
	ImagePattern img;
	
	PersonagemImg(ImagePattern img){
		this.img = img;
	}
	
	public ImagePattern getImg() {
		return this.img;
	}

}
