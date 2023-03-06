package tdp.polito.it.TdP_EsercizioLibrettoVoti.model;

import java.time.LocalDate;

public class TestLibretto {
	public static void main(String[] args) {
		
		Libretto lib = new Libretto();
		
		lib.add(new Voto ("Analisi 1", 29, LocalDate.of(2021, 2, 15))); //1
		lib.add(new Voto ("Fisica 1", 21, LocalDate.of(2021, 6, 10)));
		lib.add(new Voto ("Informatica", 25, LocalDate.of(2021, 7, 10)));
		
		lib.stampaPuntiUguali(25);//2
		
		Voto v = lib.cercaVotoPerNome("Analisi 1");//3
		System.out.println(v);
		v = lib.cercaVotoPerNome("Analisi 2");
		System.out.println(v);
		
		Voto a1bis = new Voto("Analisi 1", 29, LocalDate.of(2021, 2, 15));//4
		Voto a1ter = new Voto("Analisi 1", 30, LocalDate.of(2021, 2, 15));
		System.out.println(a1bis +" è duplicato : "+lib.esisteVoto(a1bis));
		System.out.println(a1ter +" è duplicato : "+lib.esisteVoto(a1ter));



	}
}
