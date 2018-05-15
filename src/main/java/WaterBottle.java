public class WaterBottle {
    private int volume = 100;

    public void drinkWater() {
       this.volume -= 10;


    }
    public void addWater() {

        this.volume += 10;
    }
    public void fillBottle(){

        this.volume = 100;
    }
    public void empty(){

        this.volume = 0;

    }
    public int getVolume(){

        return this.volume;

    }
}
