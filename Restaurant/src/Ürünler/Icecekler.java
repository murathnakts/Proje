package Ürünler;

import java.util.ArrayList;

public class Icecekler {
	public ArrayList<String> icecekler;
	public ArrayList<Integer> fiyatlar;
	
	public Icecekler() {
		icecekler = new ArrayList<String>();
		icecekler.add("Kola");
		icecekler.add("Fanta");
		icecekler.add("Şalgam");
		icecekler.add("Ayran");
		icecekler.add("Su");
		
		fiyatlar = new ArrayList<Integer>();
		fiyatlar.add(17);
		fiyatlar.add(17);
		fiyatlar.add(12);
		fiyatlar.add(10);
		fiyatlar.add(7);
	}
}