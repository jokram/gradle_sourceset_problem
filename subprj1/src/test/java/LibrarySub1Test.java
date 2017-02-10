import org.junit.Test;
import static org.junit.Assert.*;

public class LibrarySub1Test {
    @Test public void testSomeLibrarySub1Method() {
        LibrarySub1 classUnderTest = new LibrarySub1();
        assertTrue("someLibrarySub1Method should return 'true'", classUnderTest.someLibrarySub1Method());
		LibraryZTest classZTest = new LibraryZTest();
        assertTrue("libraryZTestMethod should return 'true'", classZTest.libraryZTestMethod());
    }
}
