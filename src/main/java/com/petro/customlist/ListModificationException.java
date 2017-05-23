package com.petro.customlist;

/**
 * Created by Администратор on 23.05.2017.
 */
public class ListModificationException extends IllegalAccessException {
    public ListModificationException() {
        super("You can not delete or change elements in UnchangeableArrayListList!");
    }
}
