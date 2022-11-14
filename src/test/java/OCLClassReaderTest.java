import OCLConstructor.OCLClass;
import OCLConstructor.OCLClassReader;
import org.junit.Test;

public class OCLClassReaderTest {

    @Test
    public void classReaderTest() {
        OCLClass testClass = OCLClassReader.readClassFromFile("S.json");
        testClass.printClass();
    }

}
