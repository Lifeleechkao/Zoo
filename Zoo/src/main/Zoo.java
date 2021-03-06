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
import data.Datacollecter;
import interfaces.Plains;
import interfaces.SpecificAction;
import interfaces.Swimmable;
import swing.ZooInterface;

public class Zoo {
	private static ZooInterface containment = new ZooInterface("Contain These ANIMALS!");
	private static Datacollecter data = new Datacollecter();
	private static HashMap<String,AllAnimals> Allanimals = new HashMap<String, AllAnimals>(); 
	private static ArrayList<AllAnimals> Animals = new ArrayList<AllAnimals>();
	public static HashMap<String, AllAnimals> containedAnimals = new HashMap<String, AllAnimals>();
	private static String action;
	private static String name;
	public static void main(String[] args){
		run();
	}
//	public static <HaspMap> HaspMap AddTHeAnimals(ArrayList containment){
//		if(containedAnimals == null){
//			return null;
//		}
//		return containedAnimals.put(name, containment.get(0));
//	}
	public void containThem(){
		System.out.println(Allanimals.keySet() + " These have been contained");
		data.writeData(String.valueOf(containedAnimals.keySet()));
		System.out.println(data.readData() + " These also have been Contained");
	}
	public void addAnimals (AllAnimals a){
		Animals.add(a);
	}
	public void enterZoo(){
		Lake l = new Lake();
		Plain p = new Plain();
	for(AllAnimals a: Animals){
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
		System.out.println(Animals);
		if(Allanimals.containsKey("HyenaS")){
			System.out.println("Hey HEY why you putting me in that cage");
		}
		if(Allanimals.containsKey("HyenaB")){
			System.out.println("NOOOOOO me no like the cage");
			System.out.println(Allanimals.get("HyenaS"));
		}
		System.out.println(containedAnimals);
	}
	
	public ArrayList<AllAnimals> getAnimals() {
		return Animals;
	}
	public static void setAnimals(ArrayList<AllAnimals> animals) {
		Animals = animals;
	}
	
}
