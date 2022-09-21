import java.util.*;

public class CoinChecker {
    private static List<ICoin> vaild = new ArrayList<>();

    public static void addVaild(ICoin[] iCoins) {
        for (ICoin c : vaild){
            vaild.add(c);
        }
    }

    public static String[] getVaildNames(){
        List<String> names = new ArrayList<>();

        for (ICoin c : vaild){
            names.add(c.GetName());
        }
        String[] cnames = new String[names.size()];
        return names.toArray(cnames);
    }

    public static ICoin[] MakeChange(int amount){
        List<ICoin> change = new ArrayList<>();

        for (ICoin c : vaild){
            while (amount >= c.GetValue()){
                change.add(c);
                amount -= c.GetValue();
            }
        }
        ICoin[] coins = new ICoin[change.size()];
        return change.toArray(coins);
    }
}
