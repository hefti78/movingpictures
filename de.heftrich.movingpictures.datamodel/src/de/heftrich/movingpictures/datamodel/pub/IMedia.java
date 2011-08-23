package de.heftrich.movingpictures.datamodel.pub;

import de.heftrich.movingpictures.datamodel.IDataModelElement;

public interface IMedia extends IDataModelElement
{

	public byte[] getContent();

	public void setContent(byte[] content);

	public String getFileName();

	public void setFileName(String fileName);
}
