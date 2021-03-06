package classes;

public class Store{
    // Integer ID and double sales private values
    /**
     * @param id    the integer id of the store
     * @param sales the double value of sales over the past month
     * @param alias
     */

    private int ID;
    private double sales;

    // constructor with integer ID parameter and a sales double parameter
    /**
     * 
     * @param ID
     * @param sales
     */
    public Store(int ID, int sales) {
        this.ID = ID;
        this.sales = (double)sales/100;
    }

    /**
     * get the sales double of the store
     * 
     * @return the sales double of the store
     */
    public double getSales() {
        return sales;
    }

    /**
     * Set the sales double of the store
     * 
     * @param sales
     */
    public void setSales(double sales) {
        this.sales = sales;
    }
    /**
     * set the sales of the store with an int
     * @param sales
     */
    public void setSales(int sales) {
        this.sales = (double)sales/100;
    }

    /**
     * the integer ID of the store
     * 
     * @return the integer ID of the store
     */
    public int getID() {
        return ID;
    }

    // toString override the default implementation that outputs "Store " + ID + ":
    // " + sales
    /**
     * 
     * @return formatted string representation of the store
     */
    @Override
    public String toString() {
        return String.format("Store " + ID + " sold $%,.2f.", getSales());
    }


    /**
     * 
     * @return csv formatted string representation of the store
     */
    public String toCSV() {
        return getID() + "," + (int)(getSales()*100);
    }
}
