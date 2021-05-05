package abstracts;
import entities.*;

public interface SaleService {
	void sale(Game game, Gamer gamer);
	
	void saleCompaign(Game game, Gamer gamer,Campaign campaign);
}
