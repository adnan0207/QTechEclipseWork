package com.adnan.index;

import java.util.UUID;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.NameBasedGenerator;

public class FirstPageOfFirstModule {
	
	public static void main(String[] args) {
		
		Generators obj = new Generators();
		NameBasedGenerator nameBasedGenerator = obj.nameBasedGenerator();
		UUID uuid = nameBasedGenerator.generate("Adnan");
		
		System.out.println(uuid);
		
	}

}
