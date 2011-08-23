package de.heftrich.movingpictures.datamodel.pub;

import java.util.List;

import de.heftrich.movingpictures.datamodel.IDataModelElement;

public interface IItem extends IDataModelElement
{

	public String getTitle();

	public void setTitle(String title);

	public String getSubTitle();

	public void setSubTitle(String title);

	public int getID();

	public void setID(int id);

	public IGenre getGenre();

	public void setGenre(IGenre genre);

	public String getSummary();

	public void setSummary(String summary);

	public int getLength();

	public void setLength(int length);

	public String getLengthFormatted();

	public List<ICarrier> getCarriers();

	public void addCarrier(ICarrier carrier);

	public void removeCarrier(ICarrier carrier);

	public List<IRolePart> getRolePartsInItem();

	public void addRolePart(IRolePart rolePart);

	public void removeRolePart(IRolePart rolePart);

	public IImage getMainImage();

	public void setMainImage(IImage mainImage);

	public List<IMedia> getMediaList();

	public void addMedia(IMedia media);

	public void removeMedia(IMedia media);
}
