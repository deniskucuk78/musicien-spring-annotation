package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Musicien {
	
	@Autowired private String partition;
	@Autowired private String nom;
	@Autowired @Qualifier("moninstrumentprefere") private Instrument instrument;  //Si je n'avais pas mis 'qualifier("violon")' , le main n'aurait pas su quel component scanner. En effet, le main a la responsablitié de scan @ComponentScan
	
	
	
	public void jouer() {
		System.out.println("partition : " +partition);
		System.out.println("nom : " +nom);
		instrument.jouer();
	}

	public String getPartition() {
		return partition;
	}

	public void setPartition(String partition) {
		this.partition = partition;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	

}
