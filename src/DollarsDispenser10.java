/**
 * Created by jlaba on 24.12.2016.
 */
public class DollarsDispenser10 extends Dispenser {
    /**
     * Give to a customer 10 dollars bills
     */
    private Dispenser chain;

    public void setNext(Dispenser nextChain) {
        this.chain = nextChain;
    }
    @Override
    void getAmount(Currency currency) {
        if(currency.getMoney() >= 10){
            int num = currency.getMoney()/10;
            int remainder = currency.getMoney() % 10;
            System.out.println(num+" 10$ Dollars");
            if(remainder !=0) chain.getAmount(new Currency(remainder));
        }
    }
}
