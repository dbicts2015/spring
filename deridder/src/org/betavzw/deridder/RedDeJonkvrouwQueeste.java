package org.betavzw.deridder;

public class RedDeJonkvrouwQueeste implements Queeste {

	@Override
	public void voerQueesteUit() {
		System.out.println("Ik heb een jonkvrouw gered!");
	}

	@Override
	public String getNaamVanQueeste() {
		return "Red de jonkvrouw";
	}
}
