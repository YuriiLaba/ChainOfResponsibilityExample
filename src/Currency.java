/**
 * Created by jlaba on 24.12.2016.
 */
public class Currency {
    /**
     * This class care about current currency
     */
    private int amount;

    public Currency(int amount){
        this.amount = amount;
    }

    public int getMoney(){
        return this.amount;
    }
}
