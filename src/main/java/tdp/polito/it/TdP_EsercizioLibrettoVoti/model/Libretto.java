package tdp.polito.it.TdP_EsercizioLibrettoVoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	private List<Voto>voti;

	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}
	
	/**
	 * Aggiungi un nuovo voto al libretto
	 * (per ora non fa nessun controllo)
	 * @param v  il voto da aggiungere
	 * @return
	 */
	public boolean add(Voto v) {// punto 1
		return this.voti.add(v);//perche add ritorna boolean
	}
	public void stampa() {
		for(Voto x : this.voti) {
			System.out.println(x);
		}
	}
	public void stampaPuntiUguali(int valore) {//punto 2
		for(Voto x : this.voti) {
			if(x.getPunti()==valore)
				System.out.println(x);
		}
	}
	public Voto cercaVotoPerNome(String corso) {//punto 3
		for(Voto v : this.voti) {
			if(v.getCorso().compareTo(corso)==0) {// usare equals perche esistono oggetti in cui compareTo non funziona(non ordinabili linearmente)
			// if(v.getCorso().equals(corso)
				return v;
			}
		}
		return null;//oppure uso exceptions(null e meglio per casi di oggetti non trovati e cose da poco; meglio tirare eccezione nei casi non prevedibili(errori))
		//throw new RuntimeException("Voto non trovato!");
	}
	public boolean esisteVoto(Voto nuovo) {//punto 4 
		for(Voto v : voti) {
			if(v.getCorso().equals(nuovo.getCorso()) && v.getPunti()==nuovo.getPunti())//ricorda : se serve in piu posti lo butto dentro a un altro metodo!
				return true;
		}
		return false;
	}
	
}
