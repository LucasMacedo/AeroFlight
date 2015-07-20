package Util;

import javaPlay.GameObject;

public abstract class Movimento extends GameObject {
	
	public void MoveDireita(int valor){
		this.x += valor;
	}
	
	public void MoveEsquerda(int valor){
		this.x -= valor;
	}

}
