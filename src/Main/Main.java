package Main;

import java.awt.Rectangle;

import Telas.Cenario01;
import javaPlay.GameEngine;

public class Main {

	public static void main(String[] args) {
		
		GameEngine.getInstance().getGameCanvas().setBounds(new Rectangle(608, 608));
		GameEngine.getInstance().addGameStateController(1, new Cenario01());
		
		
		GameEngine.getInstance().setStartingGameStateController(1);
		GameEngine.getInstance().run();
		
	}

}
