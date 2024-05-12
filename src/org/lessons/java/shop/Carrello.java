package org.lessons.java.shop;

//Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
//Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
//Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)
import java.util.Scanner;

public class Carrello {
    private Prodotto prodotto;

    public Carrello() {
        prodotto = null;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    @Override
    public String toString() {
        if (prodotto == null) {
            return "Il carrello è vuoto.";
        } else {
            return prodotto.toString();
        }
    }

    public static void main(String[] args) {
        Carrello carrello = new Carrello();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti prodotti vuoi aggiungere al carrello?");
        int numeroProdotti = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numeroProdotti; i++) {
            System.out.println("Cosa desideri aggiungere al carrello?");
            System.out.println("1. Smartphone");
            System.out.println("2. Televisore");
            System.out.println("3. Cuffie");
            System.out.println("4. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine(); 

            if (scelta == 4) {
                break;
            }

            System.out.println("Inserisci il nome:");
            String nome = scanner.nextLine();

            System.out.println("Inserisci la descrizione:");
            String descrizione = scanner.nextLine();

            System.out.println("Inserisci il prezzo:");
            double prezzo = scanner.nextDouble();

            System.out.println("Inserisci l'IVA:");
            double iva = scanner.nextDouble();
            scanner.nextLine(); 
            
           
            if (scelta == 1) {
                System.out.println("Inserisci l'IMEI:");
                String imei = scanner.nextLine();

                System.out.println("Inserisci la memoria:");
                int memoria = scanner.nextInt();
                scanner.nextLine(); 
               
                carrello.aggiungiProdotto(new Smartphone(nome, descrizione, prezzo, iva, imei, memoria));
            } else if (scelta == 2) {
                System.out.println("Inserisci le dimensioni:");
                double dimensioni = scanner.nextDouble();

                System.out.println("Il televisore è smart? (true/false)");
                boolean smart = scanner.nextBoolean();
                scanner.nextLine(); 

                carrello.aggiungiProdotto(new Televisori(nome, descrizione, prezzo, iva, dimensioni, smart));
            } else if (scelta == 3) {
                System.out.println("Inserisci il colore:");
                String colore = scanner.nextLine();

                System.out.println("Le cuffie sono wireless? (true/false)");
                boolean wireless = scanner.nextBoolean();
                scanner.nextLine();

                carrello.aggiungiProdotto(new Cuffie(nome, descrizione, prezzo, iva, colore, wireless));
            } else {
                System.out.println("Scelta non valida. Riprova.");
            }
        }

        System.out.println(carrello.toString());

  
    }
}