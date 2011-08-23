package de.heftrich.movingpictures.datamodel.pub;

import de.heftrich.movingpictures.datamodel.IDataModelElement;

public interface IRolePart extends IDataModelElement
{

	public IItem getItem();

	public void setItem(IItem item);

	public IRole getRole();

	public void setRole(IRole role);

	public IPerson getPerson();

	public void setPerson(IPerson person);
}
