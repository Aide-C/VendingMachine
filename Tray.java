import java.util.ArrayList;

public class Tray implements ITray {

    private ArrayList<String> Items = new ArrayList<>();
    private int _price;
    public static String empty = "EMPTY"; 

    public Tray(int price) {
        _price = price;
    }

    public int Price(){
        return _price;
    }
    
    public String FrontItem(){
        return (Items.size() > 0) ? Items.get(0): empty;
    }

    public String Vend(){
        String I = FrontItem();
        if (Items.size() > 0){
            Items.remove(0);
        }

        return I;
    }

    public void Stock(String[] products) {
        for (String p : products){
            Items.add(p);
        }
    }

}
