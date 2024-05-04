package org.lessons.java.shop;

//utill metodo java per calcolare numeri random
import java.util.Random;

//Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop.
//Un prodotto è caratterizzato da: - codice (numero intero) - nome - descrizione - prezzo - iva
//Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter
//ed eventuali altri metodi di “utilità” per fare in modo che: - alla creazione di un nuovo prodotto
//il codice sia valorizzato con un numero random - il codice prodotto sia accessibile solo in lettura - gli altri attributi siano
//accessibili sia in lettura che in scrittura - il prodotto esponga un metodo per avere
//il prezzo base - il prodotto esponga un metodo per avere il prezzo comprensivo di iva - 
//il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome Nello stesso package aggiungete 
//una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.
//BONUS: create un metodo (statico) che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri 
//(ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)

public class Prodotto {

	private int codice;
	// ( creare metodo per generare codice random vedere internet!)
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;

	// Costruttore
	public Prodotto(String nome, String descrizione, double prezzo, double iva) {
		//mi richiamo il metodo per generare il codice random per assegnarlo nel costruttore!!
		this.codice = generateRandomCode();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	// metodo per generare numero random con padding numero di 8 cifre (BONUS)!!
	// __ private perche non serve interazioni in altri classi!!
	private int generateRandomCode() {
		Random random = new Random();
		return 10000000 + random.nextInt(90000000);
	}

	// Metodo getter per il codice prodotto (solo lettura)
	public int getCodice() {
		return codice;
	}

	// Metodi getter e setter per settare e ricevere nel main essendo attributi
	// privati della classe prodotto!
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	

	// get e set per recuperare e ritornare il prezzo base
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}


	// metodo per calcolare l'iva
	public double getPrezzoIVA() {
		return prezzo * (1 + iva / 100);

	}

	// Metodo per ottenere il nome esteso (codice-nome)
	public String getNomeEsteso() {
		return codice + "-" + nome;
	}
}
       
