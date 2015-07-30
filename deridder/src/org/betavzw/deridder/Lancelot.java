package org.betavzw.deridder;

public class Lancelot implements Ridder {
	private Queeste queeste;
	private Paard paard;
	public Lancelot(Queeste q, Paard paard){
		this.queeste = q;
		this.paard = paard;
	}

	@Override
	public void vertrekOpQueeste() {
		System.out.printf("Ik vertrek op queeste %s.\n", queeste.getNaamVanQueeste());
		System.out.println("ff mijn paard pakke");
		paard.rijden();
		System.out.println("wajow ik rij hier op een " + paard.getSoort());
		queeste.voerQueesteUit();
	}
}
