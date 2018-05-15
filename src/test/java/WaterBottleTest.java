import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

@Test
    public void drinkWater(){

    WaterBottle waterBottle = new WaterBottle();
    waterBottle.drinkWater();

    assertEquals(90, waterBottle.getVolume());


}
@Test
    public void addWater(){

    WaterBottle waterBottle = new WaterBottle();
    waterBottle.addWater();
    assertEquals(110, waterBottle.getVolume());
}
@Test
    public void empty(){

    WaterBottle waterBottle = new WaterBottle();
    waterBottle.empty();
    assertEquals(0, waterBottle.getVolume());
}
@Test
    public void fillBottle(){

    WaterBottle waterBottle = new WaterBottle();
    waterBottle.fillBottle();
    assertEquals(100, waterBottle.getVolume());
}
}


