
public class Knjiga {

		int brojKnjige;
		private String imeKnjige;
		boolean statusKnjige;
		private static int brojKnjiga;
		
		public Knjiga() {
			brojKnjiga++;
		}
		
		public Knjiga(int knjiga, String imeKnjige, boolean statusKnjige) {
			this.brojKnjige = knjiga;
			this.imeKnjige = imeKnjige;
			this.statusKnjige = statusKnjige;
			brojKnjiga++;
		}
		
		public void statusKnjige() {
			statusKnjige = true;
		}

		@Override
		public String toString() {
			return "Knjiga [knjiga=" + brojKnjige + ", imeKnjige=" + imeKnjige + ", statusKnjige=" + statusKnjige + "]";
		}

		public int getBrojKnjige() {
			return brojKnjige;
		}

		public void setBrojKnjige(int brojKnjige) {
			this.brojKnjige = brojKnjige;
		}

		public String getImeKnjige() {
			return imeKnjige;
		}

		public void setImeKnjige(String imeKnjige) {
			this.imeKnjige = imeKnjige;
		}

		public boolean isStatusKnjige() {
			return statusKnjige;
		}

		public void setStatusKnjige(boolean statusKnjige) {
			this.statusKnjige = statusKnjige;
		}

		public static void setBrojKnjiga(int brojKnjiga) {
			Knjiga.brojKnjiga = brojKnjiga;
		}
		
		public static int getBrojKnjiga() {
			return brojKnjiga;
		}
		
		
		
}
   