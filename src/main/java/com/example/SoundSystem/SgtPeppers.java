package com.example.SoundSystem;

public class SgtPeppers implements CompactDisc {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  
  @Override
  public void play() {
	  System.out.println("여기다");
	  System.out.println("Playing " + title + " by " + artist);
  }

}
