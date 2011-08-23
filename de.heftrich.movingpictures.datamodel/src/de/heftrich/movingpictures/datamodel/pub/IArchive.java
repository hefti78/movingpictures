package de.heftrich.movingpictures.datamodel.pub;

import de.heftrich.movingpictures.datamodel.IDataModelElement;

public interface IArchive extends IDataModelElement
{

	public int getID();

	public void setID(int id);

	public String getName();

	public void setName(String name);

	public IArchiveType getType();

	public void setType(IArchiveType type);
}
