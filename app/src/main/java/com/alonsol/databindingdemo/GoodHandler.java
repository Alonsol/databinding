package com.alonsol.databindingdemo;

import java.util.Random;

public class GoodHandler {

    public void changeGoodName(Goods goods) {
        goods.setName("code" + new Random().nextInt(100));
        goods.setPrice(new Random().nextInt(100));
    }

    public void changeGoodsDetails(Goods goods) {
        goods.setDetails("hi" + new Random().nextInt(100));
        goods.setPrice(new Random().nextInt(100));
    }
}
