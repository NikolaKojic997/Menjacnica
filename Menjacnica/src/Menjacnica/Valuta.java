package Menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs = (prodajniKurs + kupovniKurs)/2;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if (naziv == null || naziv.equals(""))
			throw new RuntimeException("Nije moguce uneti null ili prazan string za ime valute");
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv.length() != 3)
			throw new RuntimeException("Skraceni naziv za valutu mora da ima 3 karaktera!");
		this.skraceniNaziv = skraceniNaziv;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		int godina = datum.YEAR;
		int mesec = datum.MONTH;
		int dan = datum.DAY_OF_MONTH;
		
		if (godina != new GregorianCalendar().YEAR || mesec != new GregorianCalendar().MONTH || dan != new GregorianCalendar().DAY_OF_MONTH) {
			throw new RuntimeException("Datum valute je moguce dodati samo na danasnji dan!");
		}
		
		this.datum = datum;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if (prodajniKurs < 0 || prodajniKurs<this.kupovniKurs) {
			throw new RuntimeException("Nije moguce uneti prodajni kurs manji od nule ili manji od kupovnog kursa!");
		}
		this.prodajniKurs = prodajniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	// set metoda za srednji kurs nije potrebna jer je on aritmeticka sredina prodajnog i kupovnog!
	
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if (kupovniKurs <0 || kupovniKurs >prodajniKurs) {
			throw new RuntimeException("Nije moguce uneti kupovni kurs koji je manji od nule ili koji je veci od prodajnog kursa!");
		}
		this.kupovniKurs = kupovniKurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
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
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", datum=" + datum + ", prodajniKurs="
				+ prodajniKurs + ", srednjiKurs=" + srednjiKurs + ", kupovniKurs=" + kupovniKurs + "]";
	}
	
	
		
}
