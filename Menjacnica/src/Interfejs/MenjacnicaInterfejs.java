package Interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(String skraceniNaziv,GregorianCalendar datum,  char znakKursa, double vrednost); //Skraceni naziv se odnosi na valutu
	public void obrusiKurs(String skraceniNaziv, GregorianCalendar datum, char znakKursa); // Znak kursa - K (kupovni), P(prodajni), S(srednji)
	public double vratiKurs(String skraceniNaziv, GregorianCalendar datum, char znakKursa);
	
}
