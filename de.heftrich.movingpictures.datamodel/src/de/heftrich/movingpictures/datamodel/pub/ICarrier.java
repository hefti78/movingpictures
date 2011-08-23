package de.heftrich.movingpictures.datamodel.pub;

import java.util.List;

import de.heftrich.movingpictures.datamodel.IDataModelElement;

/**
 * A carrier is a physical carrier, a cd, dvd or similar on which one or more item is stored.
 * 
 * @author torsten
 */
public interface ICarrier extends IDataModelElement
{

	/**
	 * @return Unique id of the carrier
	 */
	public int getID();

	public void setID(int id);

	/**
	 * @return Type of the carrier (DVD, CD etc.)
	 */
	public ICarrierType getType();

	public void setType(ICarrierType type);

	/**
	 * @return Archive in which the carrier is or should be if lent to a friend.
	 */
	public IArchive getArchive();

	public void setArchive(IArchive archive);

	/**
	 * @return Gets the Position of the carrier in the archive. This can be a number or a description such as left,
	 *         right etc.
	 */
	public String getPositionInArchive();

	public void setPositionInArchive(String position);

	/**
	 * @return Get information about persons which have lent this carrier in the past or present.
	 */
	public List<ILentCarrier> getLentBy();

	public void addLentBy(ILentCarrier lentBy);
}
