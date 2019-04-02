package helloAlmaz.helloAlmaz;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class void
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public helloAlmazTest ( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( helloAlmazTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testhelloAlmaz ()
    {
        assertTrue( true );
    }
}
