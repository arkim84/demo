package com.example.SoundSystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{

	@Override
	public void play() {
		System.out.println("Sgt.Peppers Lonely Hearts Club Band");
	}

}
