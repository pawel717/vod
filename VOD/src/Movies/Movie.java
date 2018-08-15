package Movies;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Movie implements IMovie
{
	private static AtomicInteger nextId = new AtomicInteger();
	private final int id;
	private String title;
	private Date releaseDate;
	private int price;
	private int points;
	
	public Movie(String title, Date releaseDate)
	{
		this.id = nextId.getAndIncrement();
		this.title = title;
		this.releaseDate = releaseDate;
		this.points = 1;
		this.price = 10;
	}

	public String getTitle()
	{
		return this.title;
	}
	
	@Override
	public String getType() 
	{
		return "";
	}
	
	@Override
	public int getPrice() 
	{
		return this.price;
	}

	@Override
	public int getPoints() 
	{
		return this.points;	
	}

	@Override
	public void print() 
	{
		System.out.println("Tytul: "+title);
		System.out.println("Rodzaj: normalny");
		System.out.println("Cena: "+price);
	}

	@Override
	public int getID() 
	{
		return this.id;
	}
	
}
