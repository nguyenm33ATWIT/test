package PackageThing;

public class Kitchen {
	public static CircularLinkedQueue<ArrayBag<MenuItems>> orders;
	
/**
 * marks the food part of order as complete
 * @param order
 * @return
 */
	public static boolean markDone(ArrayBag order) {
	if (order.isEmpty())
		return true;
		
		
	else {
		return false;
	}
   }
}
