import org.junit.Test;
import static org.junit.Assert.*;

public class LibrarySub2Test {
    @Test public void testSomeLibrarySub2Method() {
        LibrarySub2 classUnderTest = new LibrarySub2();
        assertTrue("someLibrarySub2Method should return 'true'", classUnderTest.someLibrarySub2Method());
		LibraryZTest classZTest = new LibraryZTest();
        assertTrue("libraryZTestMethod should return 'true'", classZTest.libraryZTestMethod());
    }
}
