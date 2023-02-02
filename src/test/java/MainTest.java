import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void test() {
        PrintStream mockedPrintStream = mock(PrintStream.class);
        System.setOut(mockedPrintStream);
        Main.main(new String[]{});
        verify(mockedPrintStream, times(3)).println(6);
        verify(mockedPrintStream).println(7);
        verify(mockedPrintStream).println(4);
        verify(mockedPrintStream).println(1);
        verify(mockedPrintStream).println(3.5f);
        verify(mockedPrintStream).println(1.5d);
        verify(mockedPrintStream).println(0);
        verify(mockedPrintStream, times(5)).println(true);
    }
}
