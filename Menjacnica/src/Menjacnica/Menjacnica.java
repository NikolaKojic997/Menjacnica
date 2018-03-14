package Menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import Interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs  {
	
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
	
	@Override
	public void obrusiKurs(String skraceniNaziv, GregorianCalendar datum) {
		for (int i = 0; i<valute.size(); i++) {
			Valuta v = valute.get(i);
			int Godina = v.getDatum().YEAR;
			int Mesec = v.getDatum().MONTH;
			int Dan = v.getDatum().DAY_OF_MONTH;
			
			if (datum.YEAR == Godina && datum.MONTH == Mesec && datum.DAY_OF_MONTH == Dan && v.getSkraceniNaziv().equals(skraceniNaziv)) {
				valute.remove(i);
			}
		}

		}
		
	
	@Override
	public Valuta vratiKurs(String skraceniNaziv, GregorianCalendar datum) {

		for (int i = 0; i<valute.size(); i++) {
			Valuta v = valute.get(i);
			int Godina = v.getDatum().YEAR;
			int Mesec = v.getDatum().MONTH;
			int Dan = v.getDatum().DAY_OF_MONTH;
			if (v.getSkraceniNaziv().equals(skraceniNaziv) && datum.YEAR == Godina && datum.MONTH == Mesec && datum.DAY_OF_MONTH == Dan) {
				return v;
			}
		}


		return null;
	}
	@Override
	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajniKurs,
			double kupovniKurs) {

		Valuta v = new Valuta();
		v.setNaziv(naziv);
		v.setSkraceniNaziv(skraceniNaziv);
		v.setDatum(datum);
		v.setProdajniKurs(prodajniKurs);
		v.setKupovniKurs(kupovniKurs);
		
		valute.add(v);

		
	}
	
	
	
	
}
