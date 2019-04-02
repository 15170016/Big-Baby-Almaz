package 
HelloAlmaz.HelloAlmaz;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class HelloAlmazTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloAlmazTest ( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HelloAlmazTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void TestHelloAlmaz ()
    {
        assertTrue( true );
    }
}
