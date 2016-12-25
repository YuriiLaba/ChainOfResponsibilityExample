/**
 * Created by jlaba on 24.12.2016.
 */
public class DollarsDispenser50 extends Dispenser {
    /**
     * Give to a customer 50 dollars bills
     */

    private Dispenser chain;

    public void setNext(Dispenser nextChain) {
        this.chain = nextChain;
    }
    @Override
    void getAmount(Currency currency) {
        if(currency.getMoney() >= 50){
            int num = currency.getMoney()/50;
            int remainder = currency.getMoney() % 50;
            System.out.println(num+" 50$ Dollars");
            if(remainder !=0) chain.getAmount(new Currency(remainder));
        }
        }
    }