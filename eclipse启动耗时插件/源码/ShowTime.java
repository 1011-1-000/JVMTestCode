package startuptimeofeclipse.actions;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IStartup;
import org.eclipse.jface.dialogs.MessageDialog;


public class ShowTime implements IStartup{

	@Override
	public void earlyStartup() {
		// TODO Auto-generated method stub
		Display.getDefault().syncExec(new Runnable(){
			public void run(){
				long eclipseStartTime = Long.parseLong(System.getProperty("eclipse.startTime"));
				long costTime = System.currentTimeMillis() - eclipseStartTime;
				Shell shell = Display.getDefault().getActiveShell();
				String message = "Eclipse Æô¶¯ºÄÊ±£º"+costTime +"ms";
				MessageDialog.openInformation(shell, "Information", message);
			}
		});
	}
}