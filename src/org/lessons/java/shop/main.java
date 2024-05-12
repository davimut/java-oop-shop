package org.lessons.java.shop;

import java.lang.reflect.Constructor;
import java.util.Scanner;

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


public class main {

	    public static void main(String[] args) {
	        Prodotto prodotto1 = new Prodotto("Iphone 15", "Nuovo modello di smartphone apple", 950.00, 22.00);

	        // Test dei metodi getter che richiama direttamente gli attributi inseriti di sopra in parentesi
	        //(String - nome,String - descrizione,double - prezzo, double - iva )
	        System.out.println("Codice: " + prodotto1.getCodice());
	        System.out.println("Nome: " + prodotto1.getNome());
	        System.out.println("Descrizione: " + prodotto1.getDescrizione());
	        System.out.println("Prezzo: " + prodotto1.getPrezzo());
	        System.out.println("IVA: " + prodotto1.getIva());
	        System.out.println("Prezzo base: " + prodotto1.getPrezzo());
	        //metodo per calcolare l iva richiamato e stampato
	        System.out.println("Prezzo comprensivo di IVA: " + prodotto1.getPrezzoIVA());
	        
	       
	        System.out.println(" "); // spazio tra i 2 prodotti
	        
	        
	        
	        Prodotto prodotto2 = new Prodotto("","",0,0);
	        //ATTRIBUTI VUOTI NELLA ISTANZA PRODOTTO 2 DOMANDARE A ALESSIO SINTASSI CORRETTA ?????

	        // Test dei metodi setter (utilizzio dei metodi setter richiamati nella classe Prodotto pur essendo attributi "privati") 
	        prodotto2.setNome("PlayStation 5");
	        prodotto2.setDescrizione("Modello slim versione digitale");
	        prodotto2.setPrezzo(550.00);
	        prodotto2.setIva(20.00);

	        // Test dei metodi getter dopo aver usato i setter (ristampa degli attributi dopo la riassegnazione attraverso i metodi setter
	        //sopra utilizzati)
	        System.out.println("Nuovo codice: " + prodotto2.getCodice());
	        System.out.println("Nuovo nome: " + prodotto2.getNome());
	        System.out.println("Nuova descrizione: " + prodotto2.getDescrizione());
	        System.out.println("Nuovo prezzo: " + prodotto2.getPrezzo());
	        System.out.println("Nuova IVA: " + prodotto2.getIva());
	        // Stampa del prezzo base utilizzando il metodo setprezzo dalla classe Prodotto
	        System.out.println("Prezzo base: " + prodotto2.getPrezzo());

	        // Test del metodo getPrezzoIVA
	        System.out.println("Prezzo comprensivo di IVA: " + prodotto2.getPrezzoIVA());

	        // Test del metodo getNomeEsteso
	        System.out.println("Nome esteso: " + prodotto2.getNomeEsteso());
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println();
	        
	       //>>>>>>>>>>>>>>>>>>  ESERCIZIO 3   EREDITARIETA' <<<<<<<<<<<<<<<<<<<<<<<<<<<
	       // Lo shop gestisce diversi tipi di prodotto:
	       //- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
	       //- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
	       //- Cuffie, caratterizzate dal colore e se sono wireless o cablate
	       //Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
	        
	        Smartphone smartphone = new Smartphone("iPhone 13", "Alte prestazioni ", 890.99, 22.00, "123456789", 128);
	        Televisori televisore = new Televisori("Samsung OLED TV", "Televisore OLED", 700.99, 22.00, 55.0, true);
	        Cuffie cuffie = new Cuffie("Sony headphones", "Cuffie in-ear wireless", 159.99, 22.00, "Nero", true);

	        
	        System.out.println("Smartphone:");
	        
	        System.out.println("Nome: " + smartphone.getNome());
	        System.out.println("Descrizione: " + smartphone.getDescrizione());
	        System.out.println("Prezzo: " + smartphone.getPrezzo());
	        System.out.println("IVA: " + smartphone.getIva());
	        System.out.println("IMEI: " + "IMEI"+ smartphone.getImei());
	        System.out.println("Memoria: " + smartphone.getMemoria());
	        System.out.println();
	        
	        
	        System.out.println("Televisore:");
	        System.out.println("Nome: " + televisore.getNome());
	        System.out.println("Descrizione: " + televisore.getDescrizione());
	        System.out.println("Prezzo: " + televisore.getPrezzo());
	        System.out.println("IVA: " + televisore.getIva());
	        System.out.println("Dimensioni: " + televisore.getDimensioni() + " pollici");
	        if (televisore.isSmart()) {
	            System.out.println("Smart: Sì");
	        } else {
	            System.out.println("Smart: No");
	        };
	        System.out.println();
	        
	        System.out.println("Cuffie:");
	        System.out.println("Nome: " + cuffie.getNome());
	        System.out.println("Descrizione: " + cuffie.getDescrizione());
	        System.out.println("Prezzo: " + cuffie.getPrezzo());
	        System.out.println("IVA: " + cuffie.getIva());
	        System.out.println("Colore: " + cuffie.getColore());
	        if (cuffie.isWireless()) {
	            System.out.println("Wireless: Sì");
	        } else {
	            System.out.println("Wireless: No");
	        };
	    }
	}

