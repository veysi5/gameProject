package adapters;
import abstracts.*;
import entities.*;

public class MernisServiceAdapter implements  GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		System.out.println("kimlik doğrulanıyor : " + gamer.getFirstName() + " " + gamer.getLastName());

		return true;
	}
	
}
