package com.gyn.user.service;

import com.gyn.user.pojo.Inventory;

import java.util.List;

/**
 * @Description:
 * @Date: Create at 10:01, 2017/12/15
 * @Author: Matthew
 */
public interface InventoryService {

    public void add(Inventory inventory);

    public void update(Inventory inventory);

    public void delete(Long id);

    public Inventory findById(Long id);

    public List<Inventory> findList();
}
