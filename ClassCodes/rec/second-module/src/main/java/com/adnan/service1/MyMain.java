package com.adnan.service1;

import java.util.UUID;

import org.apache.commons.lang.StringUtils;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.NameBasedGenerator;

public class MyMain {

	public static void main(String[] args) {

		Generators obj = new Generators();
		NameBasedGenerator nameBasedGenerator = obj.nameBasedGenerator();
		UUID uuid = nameBasedGenerator.generate("Adnan");

		System.out.println(uuid);
		
		
		StringUtils obj2 = new StringUtils();
		String str = obj2.capitaliseAllWords("Adnan");
		System.out.println(str);
		

	}

}
