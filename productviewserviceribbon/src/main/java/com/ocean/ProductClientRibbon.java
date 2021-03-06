package com.ocean;

import com.ocean.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ProductClientRibbon {
    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProdcuts() {
        List<Product> aa = restTemplate.getForObject("http://data-server/products",List.class);
        System.out.println(aa);
        return aa;
    }

}
