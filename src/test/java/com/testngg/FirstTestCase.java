package com.testngg;

import org.testng.annotations.Test;

public class FirstTestCase {
	@Test(priority=0)
	public void hello() {
		System.out.println("hwlllloooo");
	}
	@Test(priority=1)
	public void hii() {
		System.out.println("hellloo");
	}

}
