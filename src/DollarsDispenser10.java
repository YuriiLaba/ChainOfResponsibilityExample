/**
 * Created by jlaba on 24.12.2016.
 */
public class DollarsDispenser10 extends Dispenser {
    @Override
    void getAmount(Currency currency) {
        int sum = currency.getMoney();
        if(sum/10 != 0)System.out.println(sum / 10 + " - 10 Dollars bill");
        //System.out.println(sum);
    }
}
