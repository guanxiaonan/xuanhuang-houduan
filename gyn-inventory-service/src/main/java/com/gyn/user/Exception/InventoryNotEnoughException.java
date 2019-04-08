package com.gyn.user.Exception;

public class InventoryNotEnoughException extends RuntimeException {

    public InventoryNotEnoughException() {
        super("库存不足！！！");
    }
}
