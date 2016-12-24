/**
 * Created by jlaba on 24.12.2016.
 */
public class DollarsDispenser50 extends Dispenser {
    @Override
    void getAmount(Currency currency) {
        int sum = currency.getMoney();
        if(sum/50 != 0)System.out.println(sum / 50 + " - 50 Dollars bill");
    }
}
