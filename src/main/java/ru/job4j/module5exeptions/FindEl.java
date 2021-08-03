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

    @SuppressWarnings("checkstyle:SimplifyBooleanExpression")
    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        boolean rsl = true;
        for (int i = 0; i < abuses.length; i++) {
            if (value.equals(abuses[i])) {
                rsl = false;
            }
        }
        if (!rsl) {
            throw new ElementAbuseException("abused value");
        }
        return rsl;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ElementNotFoundException {

        process(new String[]{"4", "5", "3", "7"}, "6", new String[] {"6", "5", "2", "7"});

//        try {
//            FindEl.indexOf(new String[]{"4", "5", "3", "7"}, "3");
//        } catch (ElementNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            FindEl.indexOf(new String[]{"4", "5", "3", "7"}, "2");
//        } catch (ElementNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
