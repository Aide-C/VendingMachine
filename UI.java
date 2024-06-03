import java.util.Scanner;

public class UI {

    private IMoney _money;
    private Machine _machine;
    Scanner scanner = new Scanner(System.in);

    public UI(MoneyBox moneybox, Machine machine) {
        _money = moneybox;
        _machine = machine;
    }

    public void Run() {
        ShowMenu();
        System.out.println("Options:");
        System.out.println("D[coin]: Deposit coin (Q for quarter, D for dime, N for nickel)");
        System.out.println("V: Vend");
        System.out.println("C: Change");
        System.out.println("Q: Quit");
        System.out.println("Please enter your choice:");
        String input = scanner.nextLine(). toUpperCase();

        while (input.charAt(0) != 'Q'){
            if (input.charAt(0) == 'D'){
                OptionD(input.charAt(1));
            }else if (input.charAt(0) == 'V'){
                OptionV(input.charAt(1));
            }else if (input.charAt(0) == 'C'){
                Change();
            }

            System.out.println();
            ShowMenu();
            System.out.println("Options:");
            System.out.println("D[coin]: Deposit coin (Q for quarter, D for dime, N for nickel)");
            System.out.println("V: Vend");
            System.out.println("C: Change");
            System.out.println("Q: Quit");
            System.out.println("Please enter your choice:");
            input = scanner.nextLine().toUpperCase();
        }
    }

    private void Change() {
        ICoin[] array = _money.Exit();
        System.out.println("Your change:");
        for (int i = 0; i < array.length; i++){
            ICoin change = array[i];
            System.out.println(change.GetName() + " " + change.GetValue() + " cents");
        }
    }

    private void OptionV(char trayNum) {
        int trayIndex = Character.getNumericValue(trayNum);
        String[] result = _machine.Vend(trayIndex-1);
        for (int i = 0; i < result.length; i++){
            String sentence = result[i];
            System.out.println(sentence);
        }
    }


    private void OptionD(char charAt) {
        if (charAt == 'Q'){
            _money.Insert(new Quarter());//Quarter();
        }else if(charAt == 'D'){
            _money.Insert(new Dime());//Dime();
        }else{
            _money.Insert(new Nickel());//Nickel();
        }
        int balance = _money.GetBalance();
        System.out.println("Your Balance: " + balance);
    }

    private void ShowMenu() {
        ITray[] trays = _machine.trays();
        System.out.println("Welcome to the vending machine!");
        for (int i = 0; i < trays.length; i++){
            ITray tray = trays[i];
            System.out.println("Tray " + (i+1) + ": Price - " + tray.Price() + " cents, Items - " + tray.FrontItem());
        }
    }

}
