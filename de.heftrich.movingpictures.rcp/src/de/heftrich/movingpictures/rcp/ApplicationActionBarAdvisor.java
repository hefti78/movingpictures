package de.heftrich.movingpictures.rcp;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor
{

	private IWorkbenchAction	quitAction;
	private IWorkbenchAction	aboutAction;
	private IWorkbenchAction	preferences;
	private IWorkbenchAction	save;
	private IContributionItem	showViews;
	private IWorkbenchAction	importWizard;

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer)
	{
		super(configurer);
	}

	protected void makeActions(IWorkbenchWindow window)
	{
		quitAction = ActionFactory.QUIT.create(window);
		aboutAction = ActionFactory.ABOUT.create(window);
		preferences = ActionFactory.PREFERENCES.create(window);
		save = ActionFactory.SAVE.create(window);
		importWizard = ActionFactory.IMPORT.create(window);
		showViews = ContributionItemFactory.VIEWS_SHORTLIST.create(window);
	}

	protected void fillMenuBar(IMenuManager menuBar)
	{
		MenuManager fileMenu = new MenuManager("&File", "menu.file");
		MenuManager windowMenu = new MenuManager("&Window", "menu.window");
		MenuManager helpMenu = new MenuManager("&Help", "menu.help");
		menuBar.add(fileMenu);
		menuBar.add(windowMenu);
		menuBar.add(helpMenu);
		fileMenu.add(save);
		fileMenu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		fileMenu.add(new Separator());
		fileMenu.add(importWizard);
		fileMenu.add(new Separator());
		fileMenu.add(quitAction);
		MenuManager showViewMenu = new MenuManager("Show View", "menu.window.showview");
		showViewMenu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		showViewMenu.add(showViews);
		windowMenu.add(showViewMenu);
		windowMenu.add(new Separator());
		windowMenu.add(preferences);
		helpMenu.add(aboutAction);
	}

	/**
	 * @see org.eclipse.ui.application.ActionBarAdvisor#fillCoolBar(org.eclipse.jface.action.ICoolBarManager)
	 */
	@Override
	protected void fillCoolBar(ICoolBarManager coolBar)
	{
		IToolBarManager toolbar = new ToolBarManager(coolBar.getStyle());
		coolBar.add(toolbar);
		toolbar.add(save);
		toolbar.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

}
