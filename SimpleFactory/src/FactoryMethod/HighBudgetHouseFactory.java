package FactoryMethod;

/**
 * Created by nilajapatankar on 6/6/14.
 */
public class HighBudgetHouseFactory extends BaseHouseFactory {
    @Override
    public IHouse GetHouse() {
        return new HighBudgetHouse();
    }
}
