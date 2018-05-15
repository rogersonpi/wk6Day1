public class Printer {

    private int sheets_left;
    private int toner = 100;

    public void numberOfSheets(int pages, int copies){

        if (this.sheets_left >= pages * copies){

            this.sheets_left = this.sheets_left - pages * copies;
            this.toner = this.toner - pages * copies;
        }

            else{

        this.sheets_left = this.sheets_left;
        }
    }
    public void fillPrinter(){
        this.sheets_left = 100;

    }
     public int getSheets(){

        return this.sheets_left;
    }
     public int getToner(){
        return this.toner;
     }










}
