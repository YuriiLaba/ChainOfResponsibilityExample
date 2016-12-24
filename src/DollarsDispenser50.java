/**
 * Created by jlaba on 24.12.2016.
 */
public class DollarsDispenser50 extends Dispenser {
    private Dispenser chain;
    public void setNext(Dispenser nextChain) {
        this.chain = nextChain;
    }
    @Override
    void getAmount(Currency currency) {
        int sum = currency.getMoney();
        if(currency.getMoney() >= 50){
            int num = currency.getMoney()/50;
            int remainder = currency.getMoney() % 50;
            System.out.println("Dispensing "+num+" 50$ note");
            if(remainder !=0) this.chain.getAmount(new Currency(remainder));
        }else{
            this.chain.getAmount(currency);
        }
        }
    }