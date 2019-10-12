package builder;

public class SubMealBuilderB extends MealBuilder {

	@Override
	public void buildFood() {
		this.meal.setFood("一个鸡肉卷");
	}

	@Override
	public void buildDrink() {
		this.meal.setDrink("一杯果汁");
	}

}
