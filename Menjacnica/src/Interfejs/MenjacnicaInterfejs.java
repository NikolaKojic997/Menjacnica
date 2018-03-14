package Interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(String naziv,String skraceniNaziv,GregorianCalendar datum,  double prodajniKurs, double kupovniKurs); 
	public void obrusiKurs(String skraceniNaziv, GregorianCalendar datum); 
	public double vratiKurs(String skraceniNaziv, GregorianCalendar datum);
	
}
