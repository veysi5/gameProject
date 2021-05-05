package concrete;
import java.util.List;

import abstracts.*;
import entities.*;

public class GameManager implements GameService {

	@Override
	public void save(Game game) {
		System.out.println("Oyun eklendi : " + game.getName() + " Fiyatý : " + game.getName());		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi : " + game.getName() + " Fiyatý : " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi : " + game.getName());
		
	}

	@Override
	public List<Game> getAll() {
		System.out.println("Oyunlar Listelendi : ");
		return null;
	}
	
	
}
