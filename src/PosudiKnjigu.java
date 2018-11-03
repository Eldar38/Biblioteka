import java.util.Date;

public class PosudiKnjigu extends Biblioteka {
	
		int brojRacuna;
		int brojKnjige;
		Date vrijeme;
		boolean postoji;
		
		public PosudiKnjigu() {
			
		}
		
		public PosudiKnjigu(int brojRacuna, int brojKnjige) {
			this.brojRacuna = brojRacuna;
			this.brojKnjige = brojKnjige;
			
		}
		
		public void posudiKnjigu() {
			boolean knjigaPostoji = false;
			boolean racunPostoji = false;
			int brojKnjige1 = 0;
			int brojRacuna1 = 0;
			int brojPodignutihKnjiga = 3;
			
			for(int i = 0; i < ListaRacuna.size(); i++) {
				if(ListaRacuna.get(i).getBrojRacuna() == brojRacuna) {
					racunPostoji = true;
					brojRacuna1 = i;
					brojPodignutihKnjiga = ListaRacuna.get(i).getBrojPosudenihKnjiga();
				}
			}
			for(int j = 0; j < ListaKnjiga.size(); j++) {
				if(ListaKnjiga.get(j).getBrojKnjiga() == brojKnjige) {
					knjigaPostoji = true;
					brojKnjige1 = j;
				}
			}
			if(racunPostoji && knjigaPostoji && brojPodignutihKnjiga < 3) {
				if(ListaKnjiga.get(brojKnjige1).statusKnjige) {
					System.out.println("Nazalost, knjiga je vec izdata..");
				}else {
					System.out.println("Uspjesno ste podigli knjigu. Uzivajte citajuci ju!");
					ListaKnjiga.get(brojKnjige1).statusKnjige = true;
					ListaRacuna.get(brojRacuna1).zauzeto();
					postoji = true;
				}
			}else if(racunPostoji && knjigaPostoji && brojPodignutihKnjiga >= 3) {
					System.out.println("Nije moguce posuditi knjigu, zato sto ste vec podigli 3 knjige.");
			}else if(racunPostoji && knjigaPostoji == false && brojPodignutihKnjiga < 3) {
				System.out.println("Zao nam je, ali ta knjiga ne postoji!");
			}else if(racunPostoji && knjigaPostoji == false && brojPodignutihKnjiga > 3) {
					System.out.println("Zao nam je, ali ta knjiga ne postoji!");	
			}else if(racunPostoji == false && knjigaPostoji && brojPodignutihKnjiga < 3) {
				System.out.println("Da bi podgli knjigu, prvo morate napraviti racun.");
			}else if(racunPostoji == false && knjigaPostoji && brojPodignutihKnjiga > 3) {
				System.out.println("Da bi podgli knjigu, prvo morate napraviti racun.");
			}else {
				System.out.println("Vas racun ne postoji... ");
			}
				
		}
		
		public void vratiKnjigu() {
			boolean knjigaPostoji = false;
			boolean racunPostoji = false;
			int brojKnjige = 0;
			int brojRacuna = 0;
			boolean knjigaIznajmljena = false;
			
			for(int i = 0; i < ListaRacuna.size(); i++) {
				if(ListaRacuna.get(i).getBrojRacuna() == brojRacuna) {
					racunPostoji = true;
					brojRacuna = i;
				}
			}
			
			for(int j = 0; j < ListaKnjiga.size(); j++) {
				if(ListaKnjiga.get(j).getBrojKnjige() == brojKnjige) {
					knjigaPostoji = true;
					brojKnjige = j;
					if(ListaKnjiga.get(j).statusKnjige)
					knjigaIznajmljena = true;
				}
		}
		
			if(racunPostoji && knjigaPostoji && knjigaIznajmljena) {
				ListaRacuna.get(brojRacuna).slobodno();
				ListaKnjiga.get(brojKnjige).statusKnjige = false;
				vrijeme = new Date();
				System.out.println("Knjiga uspjesno vracena!");
				postoji = true;
			}else if(racunPostoji && knjigaPostoji && knjigaIznajmljena == false) {
				System.out.println("Ne mzoeete vratiti knjigu, jer je niste iznajmili!");
			}else if(racunPostoji && knjigaPostoji == false && knjigaIznajmljena) {
				System.out.println("Knjiga ne postoji.");
			}else if(racunPostoji == false && knjigaPostoji  && knjigaIznajmljena) {
				System.out.println("Zao mi je, ali vas racun ne postoji u nasoj bazi podataka.");
			}
			

		}

		@Override
		public String toString() {
			return "Detalji: [brojRacuna=" + brojRacuna + ", brojKnjige=" + brojKnjige + ", vrijeme=" + vrijeme
					+ "]";
		}
}
