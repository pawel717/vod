package Movies;

public class KidsMovie extends AbstractMovie
{
	private int priceBonus;
	
	public KidsMovie(IMovie movie) 
	{
		super(movie);
		this.priceBonus = 5;
	}
	
	@Override
	public int getPoints() 
	{
		return movie.getPoints();
	}

	@Override
	public int getPrice() 
	{
		return movie.getPrice()+priceBonus;
	}

	@Override
	public String getType() 
	{
		return movie.getType()+" Dla dzieci";
	}

}
