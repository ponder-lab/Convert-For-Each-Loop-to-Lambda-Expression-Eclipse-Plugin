/**
 * 
 */
package edu.cuny.citytech.foreachlooptolambda.ui.wizards;

import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.internal.ui.refactoring.RefactoringMessages;
import org.eclipse.jdt.internal.ui.refactoring.actions.RefactoringStarter;
import org.eclipse.jdt.ui.refactoring.RefactoringSaveHelper;
import org.eclipse.ltk.core.refactoring.Refactoring;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;
import org.eclipse.swt.widgets.Shell;

import edu.cuny.citytech.foreachlooptolambda.ui.refactorings.ForeachLoopToLambdaRefactoring;

/**
 * @author <a href="mailto:rkhatchadourian@citytech.cuny.edu">Raffi
 *         Khatchadourian</a>
 *
 */
public class ForeachLoopToLambdaRefactoringWizard extends
		RefactoringWizard {

	public ForeachLoopToLambdaRefactoringWizard(
			Refactoring refactoring) {
		super(refactoring, RefactoringWizard.DIALOG_BASED_USER_INTERFACE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ltk.ui.refactoring.RefactoringWizard#addUserInputPages()
	 */
	@Override
	protected void addUserInputPages() {
	}

	public static void startRefactoring(IMethod[] methods, Shell shell) {
		Refactoring refactoring = new ForeachLoopToLambdaRefactoring(
				methods);
		ForeachLoopToLambdaRefactoringWizard wizard = new ForeachLoopToLambdaRefactoringWizard(
				refactoring);
		new RefactoringStarter().activate(wizard, shell,
				RefactoringMessages.OpenRefactoringWizardAction_refactoring,
				RefactoringSaveHelper.SAVE_REFACTORING);
	}
}
