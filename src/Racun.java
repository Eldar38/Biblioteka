
public class Racun {
	
	private int brojRacuna;
	private String imeMusterije;
	private int brojPosudenihKnjiga;
	private static int brojNapravljenihRacuna;
	
	public Racun() {
		brojNapravljenihRacuna++;
		}

	public Racun(int brojRacuna, String imeMusterije, int brojPosudenihKnjiga) {
		this.brojRacuna = brojRacuna;
		this.imeMusterije = imeMusterije;
		this.brojPosudenihKnjiga = brojPosudenihKnjiga;
		brojNapravljenihRacuna++;
	}
	
	public void zauzeto() {
		setBrojPosudenihKnjiga(getBrojPosudenihKnjiga() + 1);
	}
	
	public void slobodno() {
		setBrojPosudenihKnjiga(getBrojPosudenihKnjiga() -1);

	}

	@Override
	public String toString() {
		return "Racun [brojRacuna=" + brojRacuna + ", imeMusterije=" + imeMusterije + ", brojPosudenihKnjiga="
				+ brojPosudenihKnjiga + "]";
	}

	public int getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getImeMusterije() {
		return imeMusterije;
	}

	public void setImeMusterije(String imeMusterije) {
		this.imeMusterije = imeMusterije;
	}

	public int getBrojPosudenihKnjiga() {
		return brojPosudenihKnjiga;
	}

	public void setBrojPosudenihKnjiga(int brojPosudenihKnjiga) {
		this.brojPosudenihKnjiga = brojPosudenihKnjiga;
	}

	public static int getBrojNapravljenihRacuna() {
		return brojNapravljenihRacuna;
	}

	public static void setBrojNapravljenihRacuna(int brojNapravljenihRacuna) {
		Racun.brojNapravljenihRacuna = brojNapravljenihRacuna;
	}
	
	
}
