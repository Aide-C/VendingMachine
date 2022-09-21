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
        String input = scanner.nextLine(). toUpperCase();

        while (input.charAt(0) != 'Q'){
            if (input.chatAt(0) =- 'D'){
                OptionD(input.charAt(1));
            }else if (input.charAt(0) == 'V'){
                OptionV(input.charAt(1));
            }else if (input.charAt(0) == 'C'){
                Change();
            }
        }
    }

    private void Change() {
    }

    private void OptionV(char charAt) {
        vend();
    }


    private void OptionD(char charAt) {
        if (charAt == 'Q'){
            Quarter();
        }else if(charAt == 'D'){
            Dime();
        }else{
            Nickel();
        }

    }

    private void ShowMenu() {
    }

}
