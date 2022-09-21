
public class Machine {
    private ITray[] _trays;
    private IMoneyBox _moneybox;
    private int _mymoney;

    public Machine(MoneyBox moneybox, ITray[] trays){
        _trays = trays;
        _moneybox = moneybox;
    }

    public String[] Vend(int traynum){
        if (traynum < 0 || traynums >= _trays.length){
            return new String[] {"ERROR"};
        } 

        Itray tray = _trays[traynum];
        int price = tray.Price();

        if (price > _moneybox.GetBalance()){
            return new String[]{"NSF"};
        }

        _moneybox.Spend(price);
        _mymoney += price;
        String Vended = tray.Vend();
        return new String[]{"Vended " + Vended + ". New Balance: " + _moneybox.GetBalance()};
    }

    public Itray[] trays(){
        return _trays;
    }
}
