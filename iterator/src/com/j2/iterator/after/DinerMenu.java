package com.j2.iterator.after;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
 
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("¹ö¼¸ ¸ðµëÀü°ñ",
                "¹ö¼¸Áß ÀÏÇ°ÀÎ ´ÉÀÌ¹ö¼¸À» ºñ·ÔÇØ °¢Á¾¹ö¼¸°ú ½Å¼±ÇÑ ¾ßÃ¤°¡ ¾î¿ì·¯Áø ¸ðµëÀü°ñ¿ä¸®", true, 5.29);
        addItem("¿¬ÀÙ¹ä Á¤½Ä",
                "Âû¹ä¿¡ ¹ã, ´ëÃß, µî °ß°ú·ù¸¦ ³Ö¾î ¿¬ÀÙ¿¡ ½Ñ ¿µ¾çÂû¹ä", true, 3.50);
        addItem("µÎ°³Àå Á¤½Ä",
                "Äá´Ü¹é°ú °¢Á¾ ¾ßÃ¤¿Í ¹ö¼¸À» ³Ö¾î ²úÀÎ ¾óÅ«ÇÑ ¸ÀÀÇ Ã¤½Ä °³Àå", true, 2.89);
    }
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
    // other menu methods here
}
