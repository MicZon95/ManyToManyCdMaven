package it.prova.manytomanycdmaven.test;

import java.text.SimpleDateFormat;

import it.prova.manytomanycdmaven.dao.EntityManagerUtil;
import it.prova.manytomanycdmaven.model.Cd;
import it.prova.manytomanycdmaven.model.Genere;
import it.prova.manytomanycdmaven.service.CdService;
import it.prova.manytomanycdmaven.service.GenereService;
import it.prova.manytomanycdmaven.service.MyServiceFactory;

public class MyTest {

	public static void main(String[] args) {
		CdService cdServiceInstance = MyServiceFactory.getCdServiceInstance();
		GenereService genereServiceInstance = MyServiceFactory.getGenereServiceInstance();
		
		try {
			//*********************************************************************************
			//TEST INSERIMENTO NUOVO CD  ******************************************************
			//*********************************************************************************
//			System.out.println("Inserimento nuovo cd...");
//			Cd cdInstance = new Cd("titolo1","autore1",new SimpleDateFormat("dd/MM/yyyy").parse("24/09/2019"));
//			cdServiceInstance.inserisciNuovo(cdInstance);
//			if(cdServiceInstance.caricaSingoloElemento(cdInstance.getId()) != null)
//				System.out.println("Inserimento nuovo cd...OK: "+cdInstance);
//			
//			//*********************************************************************************
//			//TEST CARICA CD  *****************************************************************
//			//*********************************************************************************
//			Long idCdDaCaricare = 1L;
//			System.out.println("Carica cd con id.."+idCdDaCaricare);
//			Cd cdDaCaricare = cdServiceInstance.caricaSingoloElemento(idCdDaCaricare);
//			if(cdDaCaricare != null)
//				System.out.println("Cd caricato con successo: "+cdDaCaricare);
//			else
//				System.out.println("Cd non trovato.");
//			
//			//*********************************************************************************
//			//TEST INSERIMENTO NUOVO GENERE****************************************************
//			//*********************************************************************************
//			String descrizioneGenere = "rock";
//			if(genereServiceInstance.cercaPerDescrizione(descrizioneGenere) == null) {
//				genereServiceInstance.inserisciNuovo(new Genere(descrizioneGenere));
//				System.out.println("Nuovo genere inserito.");
//			}
//			
//			//*********************************************************************************
//			//COLLEGHIAMO GENERE A CD ****************************************************
//			//*********************************************************************************
//			Long idCdDaCaricarePerCollegamentoGenere = 1L;
//			System.out.println("Carica cd con id.."+idCdDaCaricarePerCollegamentoGenere);
//			Cd cdDaCaricarePerCollegamentoGenere = cdServiceInstance.caricaSingoloElemento(idCdDaCaricarePerCollegamentoGenere);
//			Genere genereDaCaricarePerCollegamente = genereServiceInstance.cercaPerDescrizione(descrizioneGenere);
//			if(cdDaCaricarePerCollegamentoGenere != null) {
//				cdServiceInstance.aggiungiGenere(cdDaCaricarePerCollegamentoGenere, genereDaCaricarePerCollegamente);
//			}
//			
//			//*********************************************************************************
//			//CREAZIONE CD E CREAZIONE GENERE  IN UN SOLO COLPO  ******************************
//			//*********************************************************************************
//			Cd cdInstanceX = new Cd("titoloX","autoreX",new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2020"));
//			Genere genereX = new Genere("X");
//			cdServiceInstance.creaECollegaCdEGenere(cdInstanceX, genereX);
			
			//*********************************************************************************
			//COLLEGHIAMO UN  CD A DUE GENERI ED UN GENERE A DUE CD ******************************
			//*********************************************************************************
//			System.out.println("COLLEGHIAMO UN  CD A DUE GENERI ED UN GENERE A DUE CD...");
//			Cd cdInstance3 = new Cd("titolo3","autore3",new SimpleDateFormat("dd/MM/yyyy").parse("07/04/2018"));
//			Cd cdInstance4 = new Cd("titolo4","autore4",new SimpleDateFormat("dd/MM/yyyy").parse("07/04/2018"));
//			Genere genereJ = new Genere("J");
//			Genere genereK = new Genere("K");
//			//cd3 con J e cd4 con J e K
//			cdServiceInstance.creaECollegaCdEGenere(cdInstance3, genereJ);
//			cdServiceInstance.creaECollegaCdEGenere(cdInstance4, genereK);
//			cdServiceInstance.aggiungiGenere(cdInstance4, genereJ);
//			System.out.println("...end...");
			
			//*********************************************************************************
			//RIMUOVIAMO UN CD E VEDIAMO COSA ACCADE AI GENERI ********************************
			//per eseguire questo test dobbiamo prendere un cd esistente collegato a due generi
			//il risultato atteso è la rimozione dalla tabella cd, la rimozione dalla tabella 
			//di legame lasciando inalterate le voci nella tabella genere. Tutto ciò
			//a prescindere della presenza dei Cascade. Se mettiamo CascadeType.ALL o REMOVE...
			//DISASTRO!!!
			//*********************************************************************************
			/*System.out.println("RIMUOVIAMO UN CD E VEDIAMO COSA ACCADE AI GENERI...");
			Long idCdDaCaricarePerRimozione = 34L;
			Cd cdDaCaricarePerRimozione = cdServiceInstance.caricaSingoloElemento(idCdDaCaricarePerRimozione);
			if(cdDaCaricarePerRimozione != null) {
				System.out.println("Cd caricato con successo: "+cdDaCaricarePerRimozione);
				//rimuovo
				cdServiceInstance.rimuovi(cdDaCaricarePerRimozione);
			}else
				System.out.println("Cd non trovato.");
			System.out.println("...end...");*/

			//TODO: TESTARE TUTTO IL CRUD

			// MODIFICA CD
			/*System.out.println("Modifica CD");
			Cd cdDaAggiornare = cdServiceInstance.caricaSingoloElemento(5L);
			if (cdDaAggiornare != null) {
				cdDaAggiornare.setAutore("autore5");
				cdDaAggiornare.setTitolo("titolo5");
				cdServiceInstance.aggiorna(cdDaAggiornare);
				System.out.println("CD modificato");
			} else {
				System.out.println("CD non presente");
			}*/
			// MODIFICA GENERE
			/*System.out.println("Modifica Genere");
			Genere genereDaAggiornare = genereServiceInstance.caricaSingoloElemento(5L);
			if (genereDaAggiornare != null) {
				genereDaAggiornare.setDescrizione("genere5");
				genereServiceInstance.aggiorna(genereDaAggiornare);
				System.out.println("Genere modificato");
			} else {
				System.out.println("Genere non presente");
			}*/
			// CANCELLA CD
		/*	System.out.println("Cancellazione CD");
			Cd cdDaCancellare = cdServiceInstance.caricaSingoloElemento(36L);
			if (cdDaCancellare != null) {
				cdServiceInstance.rimuovi(cdDaCancellare);
				//proviamo a vedere se è stato rimosso
				cdDaCancellare = cdServiceInstance.caricaSingoloElemento(36L);
				if (cdDaCancellare == null)
					System.out.println("Cancellazione riuscita");
				else
					System.out.println("Cancellazione fallita!!!");
			} else {
				System.out.println("Cd non trovato!!!");
			}*/

			// CANCELLA GENERE
			/*System.out.println("Cancellazione Genere");
			Genere genereDaCancellare = genereServiceInstance.caricaSingoloElemento(9L);
			if (genereDaCancellare != null) {
				genereServiceInstance.rimuovi(genereDaCancellare);
				//proviamo a vedere se è stato rimosso
				genereDaCancellare = genereServiceInstance.caricaSingoloElemento(9L);
				if (genereDaCancellare == null)
					System.out.println("Cancellazione riuscita");
				else
					System.out.println("Cancellazione fallita!!!");
			} else {
				System.out.println("Genere non trovato!!!");
			}*/

			// LISTA DI TUTTI I CD
			System.out.println("Lista dei cd");
			for (Cd cdItem : cdServiceInstance.listAll()) {
				System.out.println(cdItem);
			}
			// LISTA DI TUTTI I GENERI
			System.out.println("Lista dei generi");
			for (Genere genereItem : genereServiceInstance.listAll()) {
				System.out.println(genereItem.getDescrizione());
			}

			// TEST AGGIUNGI CD
			/*System.out.println("Prova addCD 1");
			Cd cdInstanceTest = new Cd("test4","test4",new SimpleDateFormat("dd/MM/yyyy").parse("07/04/2018"));
			Genere genereTest = genereServiceInstance.caricaSingoloElemento(5L);
			genereServiceInstance.aggiungiCd(genereTest, cdInstanceTest);*/
			/*System.out.println("Prova addCD 2");
			Cd cdDaCaricarePerCollegamentoGenere = cdServiceInstance.caricaSingoloElemento(29L);
			Genere genereDaCaricarePerCollegamente = genereServiceInstance.caricaSingoloElemento(5L);
			if(genereDaCaricarePerCollegamente != null) {
				genereServiceInstance.aggiungiCd(genereDaCaricarePerCollegamente,cdDaCaricarePerCollegamentoGenere);
			}*/

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// questa è necessaria per chiudere tutte le connessioni quindi rilasciare il
			// main
			EntityManagerUtil.shutdown();
		}

	}

}
