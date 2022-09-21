
public class MoneyBox implements IMoneyBox {
    private int _balance = 0;
    public int GetBalance(){
        return _balance;
    }

    public void Insert(ICoin c){
        _balance += c.GetValue();
    }

    public void Spend(int amount){
        _balance -= amount;
    }
    public ICoin[] Exit(){
        ICoin[] change = CoinChecker.MakeChange(_balance);
        _balance = 0;
        return change;
    }
}
