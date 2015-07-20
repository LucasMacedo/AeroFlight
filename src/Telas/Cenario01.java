package Telas;

import java.awt.Color;
import java.awt.Graphics;

import Personagem.Jogador1;
import javaPlay.GameStateController;

public class Cenario01 implements GameStateController{

	private Jogador1 jogador1;
	
	

	@Override
	public void load() {
		this.jogador1 = new Jogador1();
	}

	@Override
	public void start() {}

	@Override
	public void step(long timeElapsed) {
		jogador1.step(timeElapsed);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 100, 600);
		g.setColor(Color.red);
		g.fillRect(100, 0, 100, 600);
		g.setColor(Color.yellow);
		g.fillRect(200, 0, 100, 600);
		g.setColor(Color.black);
		g.fillRect(300, 0, 100, 600);
		g.setColor(Color.pink);
		g.fillRect(400, 0, 100, 600);
		g.setColor(Color.white);
		g.fillRect(500, 0, 100, 600);
		
		jogador1.draw(g);
	}

	@Override
	public void stop() {}

	@Override
	public void unload() {}

}
