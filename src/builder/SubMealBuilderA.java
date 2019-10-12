package builder;

public class SubMealBuilderA extends MealBuilder {

	@Override
	public void buildFood() {
		this.meal.setFood("一个鸡腿堡");
	}

	@Override
	public void buildDrink() {
		this.meal.setDrink("一杯可乐");
	}

}
