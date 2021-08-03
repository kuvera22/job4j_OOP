package ru.job4j.module5exeptions;

public class ElementAbuseException extends ElementNotFoundException {
    public ElementAbuseException(String str) {
        super(str);
    }
}
