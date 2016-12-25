/**
 * Created by jlaba on 24.12.2016.
 */
public class DollarsDispenser20 extends Dispenser {
    /**
     * Give to a customer 20 dollars bills
     */
    private Dispenser chain;

    public void setNext(Dispenser nextChain) {
        this.chain = nextChain;
    }
    @Override
    void getAmount(Currency currency) {
        if(currency.getMoney() >= 20){
            int num = currency.getMoney()/20;
            int remainder = currency.getMoney() % 20;
            System.out.println(num+" 20$ Dollars");
            if(remainder !=0) chain.getAmount(new Currency(remainder));
        }
    }
}
