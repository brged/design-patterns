package builder;

public class KFCWaiter {
	
	MealBuilder builder;
	
	public void setBuilder(MealBuilder builder) {
		this.builder = builder;
	}
	
	public Meal construct(){
		builder.buildFood();
		builder.buildDrink();
		return builder.getMeal();
	}
	
}
