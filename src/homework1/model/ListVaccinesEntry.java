package homework1.model;

public class ListVaccinesEntry {
	static int idSeed=1;
	private int id;
	
	private String vaccine;
	private int dosesRequired;
	private int betDoses;
	private int dosesRec;
	private int dosesLeft;
	
	public ListVaccinesEntry(String vac, int req, int days, int rec, int left) {
		this.id=idSeed++;
		this.vaccine=vac;
		this.dosesRequired=req;
		this.betDoses=days;
		this.dosesRec=rec;
		this.dosesLeft=left;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vac) {
		this.vaccine = vac;
	}
	public int getDosesRequired() {
		return dosesRequired;
	}
	public void setDosesRequired(int req) {
		this.dosesRequired = req;
	}
	public int getBetDoses() {
		return betDoses;
	}
	public void setBetDoses(int days) {
		this.betDoses = days;
	}
	public int getDosesRec() {
		return dosesRec;
	}
	public void setDosesRec(int rec) {
		this.dosesRec = rec;
	}
	public int getDosesLeft() {
		return dosesLeft;
	}
	public void setDosesLeft(int left) {
		this.dosesLeft = left;
	}
	
	

}
