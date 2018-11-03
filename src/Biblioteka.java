import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteka {
	static Scanner input = new Scanner(System.in);
	static  ArrayList<Zapisnik> zapisnikStvari = new ArrayList<>();	
	static 	ArrayList<Knjiga> ListaKnjiga = new ArrayList<>();
	static	ArrayList<Racun> ListaRacuna = new ArrayList<>();
	public static void main(String[] args) {
		
		izbornik();
		
		
	}
	
	public static void izbornik() {
		
		System.out.println("******* DOBRODOSLI *******");
		System.out.println("1. >> Kreiranje racuna << ");
		System.out.println("2. >> Kreiranje knjiga << ");
		System.out.println("3. >> Podizanje knjiga << ");
		System.out.println("4. >> Vracanje knjiga << ");
		System.out.println("5. >> Ispisivanje detalja racuna << ");
		System.out.println("Izaberite jednu opciju: ");
		int unos = input.nextInt();
		while(unos != 1 && unos != 2 && unos != 3 && unos != 4 && unos != 5 ) {
			System.out.println("Molimo vas unesite pravilan broj.");
			unos = input.nextInt();
		}
		
		switch(unos) {
		
		case 1:
			Racun racun = new Racun();
			ListaRacuna.add(racun);
			System.out.println("Unesite vase ime: ");
			input.nextLine();
			String imeMusterije = input.nextLine();
			racun.setImeMusterije(imeMusterije);
			racun.setBrojRacuna(Racun.getBrojNapravljenihRacuna());
			System.out.println("Racun uspjesno kreiran!" + " vas broj racuna je: " + racun.getBrojRacuna()+ "\n");
			izbornik();
			break;
			
		case 2:
			Knjiga knjiga = new Knjiga();
			
			ListaKnjiga.add(knjiga);
			System.out.println("Molimo vas, unesite ime knjige: ");
			String imeKnjige = input.next();
			knjiga.setImeKnjige(imeKnjige);
			knjiga.brojKnjige = knjiga.getBrojKnjiga();
			System.out.println("Knjiga uspjesno napravljena. Broj knjige:  " + knjiga.brojKnjige );
			izbornik();
			break;
		case 3:
			PosudiKnjigu posudiKnjigu = new PosudiKnjigu();
			
			System.out.println("Unesite broj racuna:  ");
			int brojRacuna = input.nextInt();
			posudiKnjigu.brojRacuna = brojRacuna;
			System.out.println("Unesite broj knjige: ");
			int brojKnjige = input.nextInt();
			posudiKnjigu.brojKnjige = brojKnjige;
			posudiKnjigu.posudiKnjigu();
			if(posudiKnjigu.postoji) {
				Zapisnik zapisnik = new Zapisnik();
				zapisnik.brojRacuna = brojRacuna;
				zapisnik.brojKnjige = brojKnjige;
				zapisnik.status = "Izdato";
				zapisnikStvari.add(zapisnik);
			}
			izbornik();
			break;
		case 4:
			System.out.println("Koji je vas broj racuna?");
			int idRacuna = input.nextInt();
			System.out.println("Broj knjige koju vracate?");
			int idKnjige = input.nextInt();
			boolean ispravanClan = true;
			for(int i = 0; i < zapisnikStvari.size(); i++) {
				if(zapisnikStvari.get(i).brojRacuna != idRacuna && zapisnikStvari.get(i).brojKnjige == idKnjige) {
					System.out.println("Ne mozete vratit knjigu za nekoga drugog.");
					ispravanClan = false;
				}else {
					System.out.println("Uspjesno ste vratili knjigu!");
				}
			}
			if(ispravanClan) {
				PosudiKnjigu vratiKnjigu = new PosudiKnjigu(idRacuna, idKnjige);
				vratiKnjigu.vratiKnjigu();
				Zapisnik zapisnik2 = new Zapisnik();
				zapisnik2.brojRacuna = idRacuna;
				zapisnik2.brojKnjige = idKnjige;
				zapisnik2.status = "Vraceno";
				zapisnikStvari.add(zapisnik2);
			}
			izbornik();
			break;
		case 5:
			for(int k = 0; k < ListaRacuna.size(); k++) {
		System.out.println(ListaRacuna.get(k).toString());		
			}
			izbornik();
			break;
	}
	}
}
