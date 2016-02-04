package main;

import java.util.ArrayList;

import animals.AllAnimals;
import animals.Hyena;
import animals.Lion;
import animals.PolarBears;
import animals.Tiger;
import biome.Lake;
import biome.Plain;
import interfaces.Plains;
import interfaces.Swimmable;

public class Zoo {
	private ArrayList<AllAnimals> animals = new ArrayList<AllAnimals>();
	public static void main(String[] args){
		run();
	}
	public void addAnimals (AllAnimals a){
		animals.add(a);
	}
	public void enterZoo(){
		Lake l = new Lake();
		Plain p = new Plain();
	for(AllAnimals a: animals){
		System.out.println(a.getGreeting());
		if(a instanceof Swimmable){
			Swimmable s =  (Swimmable)a;
			s.swim(l);
		}
		if(a instanceof Plains){
			Plains plain =  (Plains)a;
			plain.stalkPLain(p);
		}
		
		}
	}
	public static void run(){
		Zoo z = new Zoo();
		Hyena h = new Hyena("Sid");
		PolarBears p = new PolarBears("Brave Bear");
		Lion l = new Lion("Simba");
		Tiger t = new Tiger("Raja");
		z.addAnimals(t);
		z.addAnimals(l);
		z.addAnimals(p);
		z.addAnimals(h);
		z.enterZoo();
	}
}
