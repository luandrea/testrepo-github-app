/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 04 12:59:54 GMT 2019
 */

package eu.stamp.botsing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import eu.stamp.botsing.Fraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Fraction_ESTest extends Fraction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fraction fraction0 = new Fraction((-1), (-1));
      // Undeclared exception!
      fraction0.getShiftedValue(1);
  }
}
