package com.in28minutes.superstore.repository.impl;

import com.in28minutes.superstore.dao.CartDao;
import com.in28minutes.superstore.dao.param.QueryGetCartByUserId;
import com.in28minutes.superstore.dao.param.QueryGetUserByName;
import com.in28minutes.superstore.dao.param.QueryInsertUser;
import com.in28minutes.superstore.dto.CartDto;
import com.in28minutes.superstore.dto.req.ReqByName;
import com.in28minutes.superstore.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CartRepoImpl implements CartRepo {

    @Autowired
    private CartDao cartDao;
    @Override
    public List<CartDto> getAllCart(long id) {
        QueryGetCartByUserId param = new QueryGetCartByUserId(id);
        return cartDao.getAllCart(param);

    }
}
