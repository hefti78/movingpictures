/**
 * 
 */
package net.sourceforge.movingpictures.datamodel;

import java.util.List;

import net.sourceforge.movingpictures.datamodel.pub.IItem;
import net.sourceforge.movingpictures.datamodel.pub.IPerson;

/**
 * @author torsten
 *
 */
public interface IMovingPicturesDataModel
{

	public List<IItem> getAllItems();

	public List<IPerson> getAllPersons();
}
