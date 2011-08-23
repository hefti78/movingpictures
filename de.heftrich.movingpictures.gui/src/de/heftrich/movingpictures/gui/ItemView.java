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
public class ItemView extends ViewPart
{

	public static final String	ID			= "de.heftrich.movingpictures.gui.ItemView";

	private Composite			top			= null;

	private Label titleLabel = null;

	private Text titleText = null;

	private Label subTitleLabel = null;

	private Text subTitleText = null;
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
		titleLabel = new Label(top, SWT.NONE);
		titleLabel.setText("Title");
		titleText = new Text(top, SWT.BORDER);
		subTitleLabel = new Label(top, SWT.NONE);
		subTitleLabel.setText("Subtitle");
		subTitleText = new Text(top, SWT.BORDER);
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
