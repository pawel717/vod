package Movies;

import Interfaces.IPrintable;
import Interfaces.IScorable;
import Interfaces.IValuable;

public interface IMovie extends IScorable, IValuable, IPrintable
{
	public String getTitle();
	public String getType();
	public int getID();
}
