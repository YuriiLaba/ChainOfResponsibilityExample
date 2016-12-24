/**
 * Created by jlaba on 24.12.2016.
 */
public class DollarsDispenser20 extends Dispenser {
    private Dispenser chain;

    public void setNext(Dispenser nextChain) {
        this.chain = nextChain;
    }
    @Override
    void getAmount(Currency currency) {
        if(currency.getMoney() >= 20){
            int num = currency.getMoney()/20;
            int remainder = currency.getMoney() % 20;
            System.out.println("Dispensing "+num+" 20$ note");
            if(remainder !=0) this.chain.getAmount(new Currency(remainder));
        }else{
            this.chain.getAmount(currency);
        }
    }
}
