package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.ItemMapper;
import com.itheima.ssm.pojo.Item;
import com.itheima.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @PackageName: com.itheima.ssm.service.impl
 * @ClassName: ItemServiceImpl
 * @Author: caibing
 * @Date: 2020/5/11 15:19
 * @Description:
 */
@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public Item findById(int id) {
        return null;
    }
}
