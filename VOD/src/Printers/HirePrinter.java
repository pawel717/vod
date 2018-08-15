package Printers;

import Hire.Hire;
import Interfaces.IPrintable;

public class HirePrinter implements IPrintable
{
	private Hire hire;
	
	public HirePrinter(Hire hire)
	{
		this.hire = hire;
	}

	@Override
	public void print() 
	{
		hire.print();
	}
}
