package de.heftrich.movingpictures.datamodel.pub;

import java.util.Date;
import java.util.List;

import de.heftrich.movingpictures.datamodel.IDataModelElement;

/**
 * A person can be an actor, author, director, producer, etc. who has a part in a film, book or other item. A person can
 * also be a friend who wants to lend some carriers.
 * 
 * @author torsten
 */
public interface IPerson extends IDataModelElement
{

	/**
	 * @return Unique id of the person.
	 */
	public String getID();

	public void setID(String id);

	/**
	 * @return Family name.
	 */
	public String getName();

	public void setName(String name);

	/**
	 * @return Middle name or initial
	 */
	public String getMiddleName();

	public void setMiddleName(String middleName);

	/**
	 * @return First name.
	 */
	public String getFirstName();

	public void setFirstName(String firstName);

	/**
	 * @return Date of birth.
	 */
	public Date getDateOfBirth();

	public void setDateOfBirth(Date dateOfBirth);

	/**
	 * @return Date of death if appropriate. If not this method should return <code>null</code>
	 */
	public Date getDateOfDeath();

	public void setDateOfDeath(Date dateOfDeath);

	public List<String> getAlias();

	public void addAlias(String alias);

	public void removeAlias(String alias);

	public List<ILentCarrier> getLentCarriers();

	public void addLentCarrier(ILentCarrier lentCarrier);

	public void removeLentCarrier(ILentCarrier lentCarrier);
}
