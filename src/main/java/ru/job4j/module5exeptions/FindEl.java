package ru.job4j.module5exeptions;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        try {
            FindEl.indexOf(new String[]{"4", "5", "3", "7"}, "3");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

        try {
            FindEl.indexOf(new String[]{"4", "5", "3", "7"}, "2");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
