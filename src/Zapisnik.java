import java.util.Date;

public class Zapisnik extends PosudiKnjigu {
	
		String status;

		public Zapisnik(String status) {
			super();
			this.status = status;
		}

		public Zapisnik() {
			super();
		}

		@Override
		public String toString() {
			return "Zapisnik [status=" + status + ", brojRacuna=" + brojRacuna + ", brojKnjige=" + brojKnjige
					+ ", vrijeme=" + vrijeme + "]";
		}

	
	
}
