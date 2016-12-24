/**
 * Created by jlaba on 24.12.2016.
 */
public class DollarsDispenser20 extends Dispenser {
    @Override
    void getAmount(Currency currency) {
        int sum = currency.getMoney();
        if(sum/20 != 0)System.out.println(sum / 20 + " - 20 Dollars bill");
    }
}
