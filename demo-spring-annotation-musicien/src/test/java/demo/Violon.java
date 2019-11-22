package demo;

import org.springframework.stereotype.Component;

@Component("moninstrumentprefere")
public class Violon implements Instrument {

	@Override
	public void jouer() {
		System.out.println("Wiiing Wiiing Wiiing Viooolon");
		
	}

}
