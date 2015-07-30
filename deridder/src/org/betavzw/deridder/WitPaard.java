package org.betavzw.deridder;

public class WitPaard implements Paard {

	@Override
	public String getSoort() {
		return "supergreif keinijg paard";
	}

	@Override
	public void rijden() {
		System.out.println("klopperdeklop");
	}

}