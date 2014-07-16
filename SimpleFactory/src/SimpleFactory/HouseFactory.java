package SimpleFactory;

/**
 * Created by nilajapatankar on 6/6/14.
 */
public class HouseFactory {
    public static IHouse GetHouse(int typeOfHouse){
        switch (typeOfHouse) {
            case 1:
                HighBudgetHouse highBudgetHouse = new HighBudgetHouse();
                return highBudgetHouse;
            case 2:
                LowBugetHouse lowBugetHouse = new LowBugetHouse();
                return lowBugetHouse;
            default:
                return null;
        }
    }
}
