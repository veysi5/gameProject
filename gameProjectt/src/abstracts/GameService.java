package abstracts;
import java.util.List;
import entities.*;
public interface GameService {
	void save(Game game);
	
	void update(Game game);
	
	void delete(Game game);
	
	List<Game> getAll();
}
