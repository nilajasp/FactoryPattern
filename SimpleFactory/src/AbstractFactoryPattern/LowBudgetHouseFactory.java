package AbstractFactoryPattern;

/**
 * Created by nilajapatankar on 6/6/14.
 */
public class LowBudgetHouseFactory implements IHouseFactory {
    @Override
    public IHouse GetHouse() {
        return new LowBugetHouse();
    }
}