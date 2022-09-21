public class Main {
    public static void main(String[] args) throws Exception {
        CoinChecker.addVaild(new ICoin[] {new Quarter(), new Dime(), new Nickel()});

        Tray t1 = new Tray(175);
        t1.Stock(new String[]{"Doritos", "Cheetos", "Lays", "Takis"});

        Tray t2 = new Tray(150);
        t2.Stock(new String[]{"M&Ms", "Skittles", "", "Takis"});

        Tray t3 = new Tray(125);
        t3.Stock(new String[]{"Oreos", "Nature Valley bar", "Lays", "Takis"});

        Tray t4 = new Tray(100);
        t4.Stock(new String[]{"Doritos", "Cheetos", "Lays", "Takis"});

        MoneyBox moneybox = new MoneyBox();
        Machine machine = new Machine(moneybox, new Tray[]{t1, t2, t3, t4});
        UI vi = new UI(moneybox, machine);
        vi.Run();
    }
}
