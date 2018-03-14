package Menjacnica;

import java.util.LinkedList;

public class Menjacnica {
	
	private String ime;
	private String adresa;
	private LinkedList<Valuta> valute;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if (ime == null || ime.equals(""))
			throw new RuntimeException("Nije moguce uneti null ili prazan string za ime menjacnice!");
		this.ime = ime;
	}
	public String getAdresa() {
		
		return adresa;
	}
	public void setAdresa(String adresa) {
		if (adresa == null || adresa.equals(""))
		throw new RuntimeException("Nije moguce uneti null ili prazan string za adresu menjacnice!");
		this.adresa = adresa;
	}
	public LinkedList<Valuta> getValute() {
		return valute;
	}
	public void setValute(LinkedList<Valuta> valute) {
		if (valute == null)
			throw new RuntimeException("Nije moguce uneti nuull vrednost za listu valute!");
		this.valute = valute;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresa == null) ? 0 : adresa.hashCode());
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menjacnica other = (Menjacnica) obj;
		if (adresa == null) {
			if (other.adresa != null)
				return false;
		} else if (!adresa.equals(other.adresa))
			return false;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Menjacnica [ime=" + ime + ", adresa=" + adresa + ", valute=" + valute + "]";
	}
	
	
	
	
}
