package FactoryMethod;

/**
 * Created by nilajapatankar on 6/6/14.
 */
public class LowBudgetHouseFactory extends BaseHouseFactory {
    @Override
    public IHouse GetHouse() {
        return new LowBugetHouse();
    }
}