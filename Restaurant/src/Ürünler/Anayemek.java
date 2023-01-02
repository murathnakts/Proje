package Ürünler;

import java.util.ArrayList;

public class Anayemek {
	public ArrayList<String> anayemekler;
	public ArrayList<Integer> fiyatlar;
	
	public Anayemek() {
		anayemekler = new ArrayList<String>();
		anayemekler.add("İskender ");
		anayemekler.add("Et Döner");
		anayemekler.add("Kuru Fasulye");
		anayemekler.add("Adana Kebap");
		anayemekler.add("Karışık Izgara");
		
		fiyatlar = new ArrayList<Integer>();
		fiyatlar.add(85);
		fiyatlar.add(70);
		fiyatlar.add(45);
		fiyatlar.add(80);
		fiyatlar.add(150);
	}	
}