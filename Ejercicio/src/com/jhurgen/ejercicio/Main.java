package com.jhurgen.ejercicio;

import java.util.ArrayList;

import com.jhurgen.ejercicio.modal.Drink;
import com.jhurgen.ejercicio.modal.Fruit;
import com.jhurgen.ejercicio.modal.Hygiene;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		showProductList();
		
	}
	static ArrayList<Drink> drinks = new ArrayList<Drink>();
	static ArrayList<Hygiene> hygiene = new ArrayList<Hygiene>();
	static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	
	public static void showProductList() {
		
		showDrinks();
		
		showHygiene();
		
		showFruts();
	}
	
	public static void showDrinks(){
		drinks.add(new Drink ("Coca-Cola Zero", 20, 1500));
		drinks.add(new Drink("Coca-Cola", 18, 1500));
		
		for (int i = 0; i < drinks.size(); i++) {
			System.out.println(drinks.get(i));
		}
	}
	
	public static void showHygiene() {
		hygiene.add(new Hygiene("Shampoo Sedal", 19, 500));
		for (int i = 0; i < hygiene.size(); i++) {
			System.out.println(hygiene.get(i));
		}
	}
	
	public static void showFruts() {
		fruits.add(new Fruit("Frutilla", 64, "kilo"));
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
	}
}
