package org.spout.engine;

import org.spout.api.Client;
import org.spout.api.entity.Entity;
import org.spout.api.geo.World;
import org.spout.api.plugin.PluginStore;
import org.spout.api.render.Camera;

import java.io.File;

public class SpoutClient extends SpoutEngine implements Client {

	private Camera activeCamera;

	public static void main(String[] args) {
		System.out.println("Client Main!");
	}

	public SpoutClient(String[] args) {
		super(args);
		// TODO Auto-generated constructor stub
	}

	@Override
	public File getTemporaryCache() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File getStatsFolder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity getActivePlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public World getWorld() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Camera getActiveCamera() {
		return activeCamera;
	}

	@Override
	public void setActiveCamera(Camera activeCamera) {
		this.activeCamera = activeCamera;
	}

	@Override
	public PluginStore getPluginStore() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File getResourcePackFolder() {
		// TODO Auto-generated method stub
		return null;
	}
}
