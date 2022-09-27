/* This file contains a few exercises and TODOs for you to fill.
 * Make sure you do the TODOs in Bag.java, HandBag.java and CrossbodyBag.java
 * as the tasks in this file depends on the completion on those!
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
class BagMain {
    /**
     * TOD: Implement this method
     * Enhance each of the bags in bags. If double_enhance_handbags is
     * True, then enhance any HandBags a second time.
     *
     * This method should work for *all* Bags! We will test this method
     * on new Bag types (and HandBag subclasses)!
     */
    public static void enhanceBags(Bag[] bags, boolean double_enhance_handbags) {
        // TOD: Implement this.
        for(Bag bag: bags){
            if(bag instanceof HandBag & /* not && because both of these aren't booleans */ double_enhance_handbags){
                bag.enhance();
                bag.enhance();
            }else{
                bag.enhance();
            }
        }
    }

    /**
     * TOD: Implement this method
     * Return the total number of straps in CrossbodyBags in bags.
     * Any bag that is not a CrossbodyBag should not be included
     * in the count!
     *
     * @param bags An array of Bags
     * @return The total number of straps of CrossbodyBags.
     */
    public static int countCrossbodyStraps(Bag[] bags) {
        // TOD: Implement this.
        int straps = 0;
        for(int i = 0; i < bags.length; i++){
            if(bags[i] instanceof CrossbodyBag){
                straps = straps + ((CrossbodyBag) bags[i]).getNumberOfStraps();
            }
        }
        return straps;
    }
}