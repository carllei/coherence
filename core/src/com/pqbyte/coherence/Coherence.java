package com.pqbyte.coherence;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Screen;

public class Coherence extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	public BitmapFont font;
//MainMenuScreen mscreen = new MainMenuScreen();
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		font = new BitmapFont();
		//this.setScreen(new MainMenuScreen(this);
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		super.render();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}
