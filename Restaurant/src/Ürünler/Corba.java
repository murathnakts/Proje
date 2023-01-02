package Ürünler;

import java.util.ArrayList;

public class Corba {
	public ArrayList<String> corbalar;
	public ArrayList<Integer> fiyatlar;
	
	public Corba() {
		corbalar = new ArrayList<String>();
		corbalar.add("Mercimek Çorbası");
		corbalar.add("Domates Çorbası");
		corbalar.add("Ezogelin Çorbası");
		corbalar.add("Düğün Çorbası");
		corbalar.add("Yayla Çorbası");
		
		fiyatlar = new ArrayList<Integer>();
		fiyatlar.add(25);
		fiyatlar.add(20);
		fiyatlar.add(25);
		fiyatlar.add(30);
		fiyatlar.add(15);
	}
}