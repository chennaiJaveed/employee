package org.edu;

public class Education extends Arts {
	public void ug() {
		System.out.println("UG degree Bca");
	}
	public void pg() {
		System.out.println("PG degree is Mca");
	}
	public static void main(String[] args) {
		Education e = new Education();
		e.ug();
		e.pg();
		e.ba();
		e.bba();
		e.bed();
		e.bsc();
		e.bTech();
		e.be();
		e.physiyo();
		e.dental();
	}
}
