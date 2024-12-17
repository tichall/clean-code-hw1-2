package hw;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<String> menuList = new ArrayList<>();

    public void appendMenu(String name) {
        this.menuList.add(name);
    }

    public void printMenuList() {
        int lastMenuNumber = menuList.size();
        for (int i = 0; i < lastMenuNumber; i++) {
            System.out.println(i + ". " + menuList.get(i));
        }
        System.out.println((lastMenuNumber + 1) + ". Quit");
        System.out.print("> ");
    }
}
