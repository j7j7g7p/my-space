package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Flux;

/**
 * @Author: Luo ShangLin
 * @Date: 2018/8/9 16:21
 * @Package: test
 * @Service: service provided
 * @Describe: service description
 */
@Controller
public class ProductController {

    @GetMapping("/traditional")
    @ResponseBody
    public List <Map> getAllProducts() {
        System.out.println("Traditional way started");
        List<Map> products = getProducts("traditional");
        System.out.println("Traditional way completed");

        return products;
    }

    private List<Map> getProducts(String traditional) {
        ArrayList<Map> pros = new ArrayList<>();
        HashMap<Object, Object> map = new HashMap<>();
        map.put("11","11");
        pros.add(map);
        return pros;
    }

    @GetMapping(value = "/reactive")
    public Flux< Product > getAll() throws Exception {
        System.out.println("Reactive way using Flux started");
        Flux< Product > fluxProducts = getProductsStream("Flux");
        System.out.println("Reactive way using Flux completed");
        return fluxProducts;
    }

    private Flux<Product> getProductsStream(String flux) throws Exception {
        System.in.read();
        return null;
    }

}
