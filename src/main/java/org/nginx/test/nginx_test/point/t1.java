package org.nginx.test.nginx_test.point;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author Happy Day !
 */
@RestController
@RequestMapping("/**")
public class t1 {
    public static Random random = new Random();
    @RequestMapping("ms")
    public Object getMessage(){
        return random.nextDouble()*10 + "Hello, world";
    }
}
