package API;

import java.util.ArrayList;
import java.util.Date;

import Hire.AbstractHire;
import Hire.Hire;
import Hire.MultipleHire;
import Interfaces.IPrintable;
import Movies.IMovie;
import Movies.Movie;
import Printers.HirePrinter;
import Repositories.Repository;
import Users.Client;

public class AdminAPI implements IAdminAPI
{
	private Repository repository;
	public AdminAPI()
	{
		this.repository = Repository.getInstance();
	}
	
	@Override
	public void createClient(String name, String surname) 
	{
		repository.addClient(new Client(name, surname));
	}

	@Override
	public void createMovie(String title, Date releaseDate) 
	{
		repository.addMovie(new Movie(title, releaseDate));
	}

	@Override
	public void createHire(int clientId, ArrayList<Integer> hiringPeriods, ArrayList<Integer> listOfMovieId) 
	{
		Client client = repository.getClient(clientId);
		ArrayList<IMovie> listOfMovies = new ArrayList<IMovie>();
		for(int moviereId : listOfMovieId)
			listOfMovies.add(repository.getMovie(moviereId)); //asdad
			
		repository.addHire(new Hire(client, hiringPeriods, listOfMovies));
<<<<<<< HEAD
		repository; //change1
=======
		repository;
>>>>>>> refs/remotes/origin/master2
	}

	@Override
	public void printReceipt(int hireId) 
	{
		Hire hire = repository.getHire(hireId);
		IPrintable printer = new HirePrinter(hire);
		printer.print();
	}
	
}
