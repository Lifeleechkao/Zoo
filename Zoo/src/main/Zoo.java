package main;


import java.util.ArrayList;
import java.util.HashMap;

import animals.Aardwolf;
import animals.AllAnimals;
import animals.BengalTiger;
import animals.BrownHyena;
import animals.Lion;
import animals.PolarBears;
import animals.SiberianTiger;
import animals.SpottedHyena;
import animals.StripedHyena;
import animals.Tiger;
import biome.Lake;
import biome.Plain;
import interfaces.Plains;
import interfaces.SpecificAction;
import interfaces.Swimmable;

public class Zoo {
	private static HashMap<String,AllAnimals> Allanimals = new HashMap<String, AllAnimals>(); 
	private ArrayList<AllAnimals> animals = new ArrayList<AllAnimals>();
	private static String action;
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
		if(a instanceof SpecificAction){
			System.out.println(((SpecificAction) a).doSpecificAction(action));
		}
	
	}
		
	}
	public static void run(){
		Zoo z = new Zoo();
		SpottedHyena h = new SpottedHyena("Sid");
		BrownHyena b = new BrownHyena("Rand");
		StripedHyena s = new StripedHyena("Kid");
		Aardwolf a = new Aardwolf("Ardy");
		PolarBears p = new PolarBears("Brave Bear");
		Lion l = new Lion("Simba");
		Tiger t = new BengalTiger("Raja");
		Tiger ts = new SiberianTiger("Raza");
		Allanimals.put("HyenaS", h);
		Allanimals.put("HyenaB", b);
		z.addAnimals(t);
		z.addAnimals(l);
		z.addAnimals(p);
		z.addAnimals(h);
		z.addAnimals(b);
		z.addAnimals(s);
		z.addAnimals(a);
		z.addAnimals(t);
		z.addAnimals(ts);
		z.enterZoo();
		if(Allanimals.containsKey("HyenaS")){
			System.out.println("Hey HEY why you putting me in that cage");
		}
		if(Allanimals.containsKey("HyenaB")){
			System.out.println("NOOOOOO me no like the cage");
			System.out.println(Allanimals.get("HyenaS"));
		}
		System.out.println(Allanimals.keySet() + " These have been contained");
	}
	
}
