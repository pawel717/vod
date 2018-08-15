package Movies;

public class FreshMovie extends AbstractMovie
{
	private int priceBonus;
	private int pointsBonus;
	
	public FreshMovie(IMovie movie) {
		super(movie);
		this.priceBonus = 10;
		this.pointsBonus = 1;
	}

	@Override
	public int getPoints() 
	{
		return movie.getPoints()+pointsBonus;
	}

	@Override
	public int getPrice() 
	{
		return movie.getPrice()+priceBonus;
	}


	@Override
	public String getType() 
	{
		return movie.getType()+" Nowoœæ";
	}
	
}
