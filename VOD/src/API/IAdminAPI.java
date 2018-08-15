package API;

import java.util.ArrayList;
import java.util.Date;

import Hire.Hire;
import Movies.IMovie;
import Users.Client;

public interface IAdminAPI 
{
	void createClient(String name, String surname);
	void createMovie(String title, Date releaseDate);
	void createHire(int clientId, ArrayList<Integer> hiringPeriod, ArrayList<Integer> moviesId);
	void printReceipt(int hireId);
}
