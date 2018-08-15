package Repositories;

import java.util.ArrayList;

import Hire.AbstractHire;
import Hire.Hire;
import Movies.IMovie;
import Users.Client;

public class Repository 
{
	private ArrayList <Hire> listOfHires;
	private ArrayList <Client> listOfClients;
	private ArrayList <IMovie> listOfMovies;
	private static Repository instance = null;
	
	private Repository()
	{
		listOfHires = new ArrayList <Hire>();
		listOfClients = new ArrayList <Client>();
		listOfMovies = new ArrayList <IMovie>();
		
	}
	
	public static Repository getInstance()
	{
		if(instance == null) 
			instance = new Repository();
		return instance;
	}
	
	public void addClient(Client client)
	{
		listOfClients.add(client);
	}
	
	public void addHire(Hire hire)
	{
		listOfHires.add(hire);
	}
	
	public void addMovie(IMovie movie)
	{
		listOfMovies.add(movie);
	}
	
	public Client getClient(int id)
	{
		for(Client client : listOfClients)
		{
			if(client.getID() == id)
				return client;
		}
		return null;
	}
	
	public Hire getHire(int id)
	{
		for(Hire hire : listOfHires)
		{
			if(hire.getID() == id)
				return hire;
		}
		return null;
	}
	
	public IMovie getMovie(int id)
	{
		for(IMovie movie : listOfMovies)
		{
			if(movie.getID() == id)
				return movie;
		}
		return null;
	}
}
