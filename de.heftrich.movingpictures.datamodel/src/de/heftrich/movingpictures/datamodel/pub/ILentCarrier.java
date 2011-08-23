package de.heftrich.movingpictures.datamodel.pub;

import java.util.Date;

import de.heftrich.movingpictures.datamodel.IDataModelElement;

/**
 * @author torsten
 */
public interface ILentCarrier extends IDataModelElement
{

	public ICarrier getCarrier();

	public void setCarrier(ICarrier carrier);

	public IPerson getPerson();

	public void setPerson(IPerson person);

	public Date getOutDate();

	public void setOutDate(Date outDate);

	public Date getBackDate();

	public void setBackDate(Date backDate);
}
