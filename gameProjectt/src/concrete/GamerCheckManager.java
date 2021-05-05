package concrete;

import abstracts.*;
import entities.*;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return false;
	}

}
