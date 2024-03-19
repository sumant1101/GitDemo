package coding_game;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainClass {

	public static void main(String[] args) {	
		
		System.out.println("Learn Lambda: \n");
//----------------------------------------------------------------------------------------------------------

		Vehicle v1 = new Vehicle() {
			@Override
			public String color(String c) 
			{
				return c;
			}
		};
		System.out.println(v1.color("MS"));

		Vehicle v2 = c -> c;
		System.out.println(v2.color("Love"));
//----------------------------------------------------------------------------------------------------------

		VehicleClass vc1 = new VehicleClass(){
			
			@Override
			public String color(String c)
			{
				return c;
			}
		};
		System.out.println(vc1.color("SM"));
		
//		VehicleClass vc2 = c -> c;		//Not possible bcoz lambda is only applicable for functional interfaces
		
//----------------------------------------------------------------------------------------------------------

		System.out.println("\n \nLearn forEach(): \n");
//----------------------------------------------------------------------------------------------------------

		List<Integer> lists = Arrays.asList(1101, 1, 11);
		System.out.println(lists);
		
		System.out.println();
		
        lists.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer element) {
                System.out.println(element);
            }
        });
        
        System.out.println();
        
		lists.forEach(e -> System.out.println(e));
		
	}
}