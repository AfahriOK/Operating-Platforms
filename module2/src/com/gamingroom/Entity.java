package com.gamingroom;

public class Entity {
	private long id;
	private String name;
	
	
	@SuppressWarnings("unused")
	public Entity() {
	}
	
	// creates a usable object with an ID and name
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	// getters
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	// base format for text output
	public String toString() {
		return "Entity [id=" + id + ",name= "+ name + "]";
	}
}
