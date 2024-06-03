
public class Machine {
    private ITray[] _trays;
    private IMoneyBox _moneybox;
    private int _mymoney;

    public Machine(IMoneyBox moneybox, ITray[] trays){
        _trays = trays;
        _moneybox = moneybox;
        _mymoney = 0;
    }

    public String[] Vend(int traynum){
        if (traynum < 0 || traynum >= _trays.length){
            return new String[] {"ERROR"};
        } 

        ITray tray = _trays[traynum];
        int price = tray.Price();

        if (price > _moneybox.GetBalance()){
            return new String[]{"NSF"};
        }

        _moneybox.Spend(price);
        _mymoney += price;
        String Vended = tray.Vend();
        return new String[]{"Vended " + Vended + ". New Balance: " + _moneybox.GetBalance() + ". My Money : " + _mymoney};
    }

    public ITray[] trays(){
        return _trays;
    }
}
