package builder;

import utils.XMLUtil;

public class Client {

	public static void main(String[] args) {
		MealBuilder mb;
		KFCWaiter waiter=new KFCWaiter();
		
		mb=(MealBuilder) XMLUtil.getBean("src/builder/config.xml");
		waiter.setBuilder(mb);
		Meal meal = waiter.construct();
		
		System.out.println("套餐组成：");
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
	}
}
