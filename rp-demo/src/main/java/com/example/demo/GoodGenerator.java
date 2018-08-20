package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

/**
 * @Author: Luo ShangLin
 * @Date: 2018/8/9 16:52
 * @Package: test
 * @Service: service provided
 * @Describe: service description
 */
@Configuration
public class GoodGenerator {
    public Flux<Good> findGoods(){
        List<Good> goods = new ArrayList<>();
        goods.add(new Good(1,"小米","2000"));
        goods.add(new Good(2,"华为","4000"));
        goods.add(new Good(3,"苹果","8000"));
        return Flux.fromIterable(goods);
    }
}
