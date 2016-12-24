/**
 * Created by jlaba on 24.12.2016.
 */
public class DollarsDispenser10 extends Dispenser {
    private Dispenser chain;
    public void setNext(Dispenser nextChain) {
        this.chain = nextChain;
    }
    @Override
    void getAmount(Currency currency) {
        int sum = currency.getMoney();
        if(currency.getMoney() >= 10){
            int num = currency.getMoney()/10;
            int remainder = currency.getMoney() % 10;
            System.out.println("Dispensing "+num+" 10$ note");
            if(remainder !=0) this.chain.getAmount(new Currency(remainder));
        }else{
            this.chain.getAmount(currency);
        }
    }
}
