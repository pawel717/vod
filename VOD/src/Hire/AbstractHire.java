package Hire;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

import Interfaces.IPrintable;
import Users.Client;

public abstract class AbstractHire implements IPrintable
{
	protected Calendar hireDate;
	protected int hiringPeriod;
	protected int amount;
	protected final int id;
	protected Client client;
	protected static AtomicInteger nextId = new AtomicInteger();
	
	public AbstractHire()
	{
		this.id = nextId.incrementAndGet();
		this.hireDate = Calendar.getInstance();
		this.amount = calculateAmount();
		this.client.addLoyaltyPoints(calculateLoyaltyPoints());
	}
	
	public int getAmount()
	{
		return this.amount;
	}

	public int getID() 
	{
		return this.id;
	}
	
	protected abstract int calculateLoyaltyPoints();
	protected abstract int calculateAmount();
	public abstract void print();
}
