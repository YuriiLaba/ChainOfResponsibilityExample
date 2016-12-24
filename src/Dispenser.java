/**
 * Created by jlaba on 24.12.2016.
 */
public abstract class Dispenser {
    Dispenser next;
    abstract void getAmount(Currency currency);
    void setNext(Dispenser next){
        this.next = next;
    }
}
