package AbstractFactoryPattern;

/**
 * Created by nilajapatankar on 6/5/14.
 */
public class HighBudgetHouse implements IHouse {
    @Override
    public int getPrice() {
        return 10000000;
    }
}
