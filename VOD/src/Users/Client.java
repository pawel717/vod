package Users;
import java.util.concurrent.atomic.AtomicInteger;

public class Client 
{
	private static AtomicInteger nextId = new AtomicInteger();
	private final int id;
	private String name;
	private String surname;
	private int loyaltyPoints;
	
	public Client(String name, String surname)
	{
		this.id = nextId.incrementAndGet();
		this.name = name;
		this.surname = surname;
		this.loyaltyPoints = 0;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getSurname()
	{
		return this.surname;
	}
	
	public int getID()
	{
		return this.id;
	}

	public void addLoyaltyPoints(int addedPoints)
	{
		this.loyaltyPoints += addedPoints;
	}
}
