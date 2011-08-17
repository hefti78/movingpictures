package de.heftrich.movingpictures.datamodel.pub;

import java.util.Date;

/**
 * @author torsten
 */
public interface ILentCarrier
{

	public ICarrier getCarrier();

	public IPerson getPerson();

	public Date getOutDate();

	public Date getBackDate();
}
