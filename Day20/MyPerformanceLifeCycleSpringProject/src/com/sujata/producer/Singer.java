package com.sujata.producer;

public class Singer implements Performer {

	private String song;
	
	public Singer(String song) {
		super();
		System.out.println("1. Singer Constructor");
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("Singer is singing "+song);

	}

}
