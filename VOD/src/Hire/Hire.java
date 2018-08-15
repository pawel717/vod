package Hire;

import Users.Client;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

import Movies.IMovie;

public class Hire extends AbstractHire
{
	private ArrayList<IMovie> listOfMovies;
	private ArrayList<Integer> hiringPeriods;
	
	public Hire(Client client, ArrayList<Integer> hiringPeriods, ArrayList<IMovie> listOfMovies)
	{
		this.hiringPeriods = hiringPeriods;
		this.listOfMovies = listOfMovies;
		this.client = client;
		this.client.addLoyaltyPoints(calculateLoyaltyPoints());
		}
	
	protected int calculateLoyaltyPoints()
	{
		int loyaltyPoints = 0;
		Iterator<Integer> periodsIter = hiringPeriods.iterator();
		Iterator<IMovie> moviesIter = listOfMovies.iterator();
		
		while(periodsIter.hasNext() && moviesIter.hasNext())
			loyaltyPoints += moviesIter.next().getPoints()*periodsIter.next();
		
		return loyaltyPoints;
	}
	
	protected int calculateAmount()
	{
		int amount = 0;
		Iterator<Integer> periodsIter = hiringPeriods.iterator();
		Iterator<IMovie> moviesIter = listOfMovies.iterator();
		
		while(periodsIter.hasNext() && moviesIter.hasNext())
			amount += moviesIter.next().getPrice()*periodsIter.next();

		return amount;
	}
	
	public void print()
	{
		Iterator<Integer> periodsIter = hiringPeriods.iterator();
		Iterator<IMovie> moviesIter = listOfMovies.iterator();
		
		System.out.println("Potwierdzenie zamówienia nr "+id);
		while(periodsIter.hasNext() && moviesIter.hasNext())
		{
			moviesIter.next().print();
			System.out.println("D³ugoœæ wypo¿yczenia: "+periodsIter.next());
		}
		System.out.println("Kwota: "+amount);
		System.out.println("Otrzymane punkty sta³ego klienta: "+calculateLoyaltyPoints());
	}

}
