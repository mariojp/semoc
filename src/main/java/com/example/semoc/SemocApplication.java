package com.example.semoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.semoc.itens.Item;

@RestController
@SpringBootApplication
public class SemocApplication {
	
	Collection<Item> programacao = new TreeSet<>();

	public static void main(String[] args) {
		SpringApplication.run(SemocApplication.class, args);
	}
	
	@GetMapping("/programacao")
	public String getProgramacao() {

		programacao.add(new Item("Mesa 1","IA"));
		programacao.add(new Item("Mesa 1","IA"));
		programacao.add(new Item("Mesa 2","Logica"));
		programacao.add(new Item("Mesa 2","Educação"));
		return  Arrays.deepToString(programacao.toArray());
	}
	

}
