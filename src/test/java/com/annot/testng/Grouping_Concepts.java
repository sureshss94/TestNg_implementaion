package com.annot.testng;

import org.testng.annotations.Test;

public class Grouping_Concepts {
	
	
	@Test(groups = "Tamil actors",priority = -2)
	
	private void Vijay_Movies() {
		System.out.println("vijay movies");
	}

	@Test(groups = "Tamil actors")
	private void Ajith_Movies() {
		System.out.println("Ajith  movies");
	}
	
	@Test(groups = "Mallywood")
	
	private void Dulqar_Salman() {
		System.out.println("Dq movies");
		
	}
	
	@Test(groups = "Hollywood",priority=-1)
	
	private void Robert_Downeyjr() {
		System.out.println("robert downy jr movies");
	}
	
	@Test(groups = "Tamil actors")
	
	private void Kamal_Hassan() {
		System.out.println("Kamal movies");
	}
	
	
	@Test(groups = "Music Directors",priority=1)
	
	private void Harris_Music() {
		System.out.println("Harris music");
	}
	
	@Test(groups = "Music Directors")
	
	private void Arr_music() {
    System.out.println("ARR music");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
