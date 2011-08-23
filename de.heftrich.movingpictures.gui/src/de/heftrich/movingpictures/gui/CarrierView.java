/**
 * 
 */
package de.heftrich.movingpictures.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author J�rg
 */
public class CarrierView extends ViewPart
{

	public static final String	ID			= "de.heftrich.movingpictures.gui.CarrierView";

	private Composite			top			= null;

	private Label archiveLabel = null;

	private Text archiveText = null;

	private Label typeLabel = null;

	private Text typeText = null;
	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets .Composite)
	 */
	@Override
	public void createPartControl(Composite parent)
	{
		// TODO Auto-generated method stub
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		top = new Composite(parent, SWT.NONE);
		top.setLayout(gridLayout);
		archiveLabel = new Label(top, SWT.NONE);
		archiveLabel.setText("Archive");
		archiveText = new Text(top, SWT.BORDER);
		typeLabel = new Label(top, SWT.NONE);
		typeLabel.setText("Type");
		typeText = new Text(top, SWT.BORDER);
	}

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus()
	{
		// TODO Auto-generated method stub

	}

}
