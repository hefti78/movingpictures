package de.heftrich.movingpictures.datamodel.mock;

import java.util.ArrayList;
import java.util.List;


import de.heftrich.movingpictures.datamodel.IMovingPicturesDataModel;
import de.heftrich.movingpictures.datamodel.IMovingPicturesDataModelFactory;
import de.heftrich.movingpictures.datamodel.pub.IItem;
import de.heftrich.movingpictures.datamodel.pub.IPerson;



public class MPDatamodeMocklImpl implements IMovingPicturesDataModelFactory
{

	private static final IMovingPicturesDataModel	INSTANCE	= new MPDataModelMock();

	@Override
	public IMovingPicturesDataModel connect(String user, String password)
	{
		return INSTANCE;
	}

	private static class MPDataModelMock implements IMovingPicturesDataModel
	{

		private List<IItem>		allItems	= new ArrayList<IItem>();
		private List<IPerson>	allPersons	= new ArrayList<IPerson>();

		public MPDataModelMock()
		{
			// Hier mit Mokito Dummy Objekte anlegen
		}

		@Override
		public List<IItem> getAllItems()
		{
			return new ArrayList<IItem>(allItems);
		}

		@Override
		public List<IPerson> getAllPersons()
		{
			return new ArrayList<IPerson>(allPersons);
		}
	}
}
