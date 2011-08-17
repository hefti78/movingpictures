/**
 * 
 */
package de.heftrich.movingpictures.datamodel;

import java.util.List;

import de.heftrich.movingpictures.datamodel.pub.IItem;
import de.heftrich.movingpictures.datamodel.pub.IPerson;


/**
 * @author torsten
 *
 */
public interface IMovingPicturesDataModel
{

	public List<IItem> getAllItems();

	public List<IPerson> getAllPersons();
}
