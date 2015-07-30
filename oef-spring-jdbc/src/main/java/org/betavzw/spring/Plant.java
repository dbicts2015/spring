package org.betavzw.spring;

public class Plant {

	private String art_code;
	private String plantenNaam;
	private String soort;
	private String kleur;
	private double hoogte;
	private int bloeiBegin;
	private int bloeiEinde;
	private double prijs;

	public String toString() {
		return "Plant [art_code: " + art_code + " - naam: " + plantenNaam + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((art_code == null) ? 0 : art_code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Plant)) {
			return false;
		}
		Plant other = (Plant) obj;
		if (art_code == null) {
			if (other.art_code != null) {
				return false;
			}
		} else if (!art_code.equals(other.art_code)) {
			return false;
		}
		return true;
	}

	public String getArt_Code() {
		return art_code;
	}

	public void setArt_Code(String artCode) {
		this.art_code = artCode;
	}

	public String getPlantenNaam() {
		return plantenNaam;
	}

	public void setPlantenNaam(String plantenNaam) {
		this.plantenNaam = plantenNaam;
	}

	public String getSoort() {
		return soort;
	}

	public void setSoort(String soort) {
		this.soort = soort;
	}

	public String getKleur() {
		return kleur;
	}

	public void setKleur(String kleur) {
		this.kleur = kleur;
	}

	public double getHoogte() {
		return hoogte;
	}

	public void setHoogte(double hoogte) {
		this.hoogte = hoogte;
	}

	public int getBloeiBegin() {
		return bloeiBegin;
	}

	public void setBloeiBegin(int bloeiBegin) {
		this.bloeiBegin = bloeiBegin;
	}

	public int getBloeiEinde() {
		return bloeiEinde;
	}

	public void setBloeiEinde(int bloeiEinde) {
		this.bloeiEinde = bloeiEinde;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

}