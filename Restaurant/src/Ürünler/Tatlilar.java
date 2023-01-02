package Ürünler;

import java.util.ArrayList;

public class Tatlilar {
	
	public ArrayList<String> tatlilar;
	public ArrayList<Integer> fiyatlar;
	
	public Tatlilar () {
		tatlilar = new ArrayList<String>();
		tatlilar.add("Sütlaç");
		tatlilar.add("Künefe");
		tatlilar.add("Kazandibi");
		tatlilar.add("Keşkül");
		tatlilar.add("Kadayıf");
		
		fiyatlar = new ArrayList<Integer>();
		fiyatlar.add(23);
		fiyatlar.add(32);
		fiyatlar.add(25);
		fiyatlar.add(21);
		fiyatlar.add(24);
	}
}