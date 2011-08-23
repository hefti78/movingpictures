package de.heftrich.movingpictures.datamodel.pub;

import de.heftrich.movingpictures.datamodel.IDataModelElement;

public interface IRole extends IDataModelElement
{

	public int getID();

	public void setID(int id);

	public String getName();

	public void setName(String name);

	public String getDescription();

	public void setDescription(String description);
}
