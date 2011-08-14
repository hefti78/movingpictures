package net.sourceforge.movingpictures.datamodel.pub;

import java.util.Date;
import java.util.List;

/**
 * A person can be an actor, author, director, producer, etc. who has a part in a film, book or other item. A person can
 * also be a friend who wants to lend some carriers.
 * 
 * @author torsten
 */
public interface IPerson
{

	/**
	 * @return Unique id of the person.
	 */
	public String getID();

	/**
	 * @return Family name.
	 */
	public String getName();

	/**
	 * @return Middle name or initial
	 */
	public String getMiddleName();

	/**
	 * @return First name.
	 */
	public String getFirstName();

	/**
	 * @return Date of birth.
	 */
	public Date getDateOfBirth();

	/**
	 * @return Date of death if appropriate. If not this method should return <code>null</code>
	 */
	public Date getDateOfDeath();

	public String getAlias();
	
	public List<ILentCarrier> getLentCarriers();
}
