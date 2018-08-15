package Movies;

public abstract class AbstractMovie implements IMovie
{
	protected IMovie movie;
	
	public AbstractMovie(IMovie movie)
	{
		this.movie = movie;
	}
	
	@Override
	public void print()
	{
		System.out.println("Tytul: "+getTitle());
		System.out.println("Rodzaj: "+getType());
		System.out.println("Cena: "+getPrice());
	}
	
	@Override
	public String getTitle() 
	{
		return movie.getTitle();
	}
	
	@Override
	public int getID() 
	{
		return movie.getID();
	}
}
