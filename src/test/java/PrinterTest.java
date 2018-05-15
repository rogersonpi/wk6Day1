import org.junit.Test;
import static org.junit.Assert.assertEquals;




public class PrinterTest {

  Printer printer;


@Test

public void numberOfSheetsTest(){

    Printer printer = new Printer ();
    printer.fillPrinter();
    printer.numberOfSheets(10,  50);
    assertEquals(100, printer.getSheets());



}
@Test
    public void volumeOfTonerTest(){

        Printer printer = new Printer ();
        printer.fillPrinter();
        printer.numberOfSheets(10,  5);
        assertEquals(50, printer.getToner());



    }



}
