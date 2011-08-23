package de.heftrich.movingpictures.datamodel;

import java.beans.PropertyChangeListener;

/**
 * Basic interface for all elements of the datamodel. It implements the possibility to add and remove
 * {@link PropertyChangeListener} to be informed of changes.
 * 
 * @author torsten
 */
public interface IDataModelElement
{

	public void addPropertyChangeListener(PropertyChangeListener listener);

	public void removePropertyChangeListener(PropertyChangeListener listener);
}
