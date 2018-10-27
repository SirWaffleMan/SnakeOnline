package com.blu3flux.game;

import com.blu3flux.controls.Input;
import com.blu3flux.entities.Food;
import com.blu3flux.entities.Snake;

public class GameMode {
	
	Snake snake;
	Food food;
	boolean paused = false;
	Input input;
	
	public Snake getSnake() {
		return snake;
	}
	
	public Food getFood() {
		return food;
	}
}
