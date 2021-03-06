/**
 * 
 */
package edu.cuny.citytech.foreachlooptolambda.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.jdt.ui.tests.refactoring.Java18Setup;
import org.eclipse.jdt.ui.tests.refactoring.RefactoringTest;

/**
 * @author <a href="mailto:rkhatchadourian@citytech.cuny.edu">Raffi
 *         Khatchadourian</a>
 *
 */
@SuppressWarnings("restriction")
public class ForeachLoopToLambdaRefactoringTest extends
		RefactoringTest {

	private static final Class<ForeachLoopToLambdaRefactoringTest> clazz = ForeachLoopToLambdaRefactoringTest.class;

	private static final String REFACTORING_PATH = "ForeachLoopToLambdaRefactoringTests/";

	public ForeachLoopToLambdaRefactoringTest(String name) {
		super(name);
	}

	/**
	 * @return
	 */
	public static Test suite() {
		return setUpTest(new TestSuite(clazz));
	}

	/**
	 * @param testSuite
	 * @return
	 */
	public static Test setUpTest(Test test) {
		return new Java18Setup(test);
	}

	/**
	 * @return the refactoringPath
	 */
	@Override
	public String getRefactoringPath() {
		return REFACTORING_PATH;
	}
	
	public void testSomething() {
		assertTrue(true);
	}
}
