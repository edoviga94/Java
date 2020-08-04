import java.io.Serializable;

public class MeteoCitta implements Serializable {
	
	private String meteo;
	private int gradi;
	
	
	
	public MeteoCitta() {
		super();
		
	}

	public MeteoCitta(String meteo, int gradi) {
		super();
		this.meteo = meteo;
		this.gradi = gradi;
	}

	public String getMeteo() {
		return meteo;
	}

	public int getGradi() {
		return gradi;
	}
	
	
	
	
	

}
