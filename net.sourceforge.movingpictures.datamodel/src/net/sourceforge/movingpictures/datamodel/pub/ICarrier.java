package net.sourceforge.movingpictures.datamodel.pub;

import java.util.List;

/**
 * A carrier is a physical carrier, a cd, dvd or similar on which one or more item is stored.
 * 
 * @author torsten
 */
public interface ICarrier
{

	/**
	 * @return Unique id of the carrier
	 */
	public int getID();

	/**
	 * @return Type of the carrier (DVD, CD etc.)
	 */
	public ICarrierType getType();

	/**
	 * @return Archive in which the carrier is or should be if lent to a friend.
	 */
	public IArchive getArchive();

	/**
	 * @return Gets the Position of the carrier in the archive. This can be a number or a description such as left,
	 *         right etc.
	 */
	public String getPositionInArchive();

	/**
	 * @return Get information about persons which have lent this carrier in the past or present.
	 */
	public List<ILentCarrier> getLentBy();
}
