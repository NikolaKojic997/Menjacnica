package Interfejs;

import java.util.GregorianCalendar;

import Menjacnica.Valuta;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(String naziv,String skraceniNaziv,GregorianCalendar datum,  double prodajniKurs, double kupovniKurs); 
	public void obrusiKurs(String skraceniNaziv, GregorianCalendar datum); 
	public Valuta vratiKurs(String skraceniNaziv, GregorianCalendar datum);
	
}
