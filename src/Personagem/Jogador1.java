package Personagem;

import java.awt.Color;
import java.awt.Graphics;
import javaPlay.GameEngine;
import javaPlay.Keyboard;
import Util.Movimento;

public class Jogador1 extends Movimento{

	private int diamentro;
		
	public Jogador1(){
		this.x = 0;
		this.y = 550;
		this.diamentro = 50;
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(this.x,this.y, diamentro, diamentro);
	}

	@Override
	public void step(long timeElapsed) {
		MovimentoTela();
		AcaoTeclado();
	}
	
	public void AcaoTeclado(){
		Keyboard teclado = GameEngine.getInstance().getKeyboard();
		if( teclado.keyDown(Keyboard.LEFT_KEY)){
			MoveEsquerda(1);
		}else if(teclado.keyDown(Keyboard.RIGHT_KEY)){
			MoveDireita(1);
		}
	}
	
	public void MovimentoTela(){
		if(this.x < 7){
			this.x = 7;
		}
		else if(this.x > 550){
			this.x = 550;
		}
	}
	
	
	
	

}
