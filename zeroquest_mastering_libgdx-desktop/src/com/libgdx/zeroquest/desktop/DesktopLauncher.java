package com.libgdx.zeroquest.desktop;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.libgdx.zeroquest.Zeroquest_mastering_Libgdx;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Zeroquest_mastering_Libgdx(), config);
		
		config.title="Zeroquest";
		config.useGL30=false;
		config.width=800;
		config.height=600;
		
		Application app = new LwjglApplication(new Zeroquest_mastering_Libgdx(), config);
		
		Gdx.app=app;
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
	}
}
