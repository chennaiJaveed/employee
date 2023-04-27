package org.edu;

public class Artss extends Educations {
	public void bsc() {
		System.out.println("Bsc maths");
	}
	public void bed() {
		System.out.println("b-ed english");
	}
	public void bba() {
		System.out.println("BBA");
	}
	public void ug() {
		System.out.println("Ug degree is bca");

	}
	public void pg() {
		System.out.println("pg is mca");
		
	}
	public static void main(String[] args) {
		Artss a = new Artss ();
		a.bsc();
		a.bed();
		a.bba();
		a.ug();
		a.pg();
	}

}
