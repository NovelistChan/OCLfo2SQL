import ocl2ra.OCLConstructor.OCLClass;
import ocl2ra.OCLConstructor.OCLClassReader;
import org.junit.Test;

public class OCLClassReaderTest {

    @Test
    public void classReaderTest() {
        OCLClass testClass = OCLClassReader.readClassFromFile("S.json");
        testClass.printClass();
    }

}
