package com.adnan.service1;

import java.util.UUID;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.NameBasedGenerator;
import com.google.common.base.Objects;

public class NewMain {

	public static void main(String[] args) {

		Generators obj = new Generators();
		NameBasedGenerator nameBasedGenerator = obj.nameBasedGenerator();
		UUID uuid = nameBasedGenerator.generate("Adnan");

		System.out.println(uuid);
		
		Generators obj2 = new Generators();
		
		NameBasedGenerator nameBasedGenerator2 = obj2.nameBasedGenerator();
		UUID uuid2 = nameBasedGenerator2.generate("Abhay");

		System.out.println(uuid2);


		
	}

}
