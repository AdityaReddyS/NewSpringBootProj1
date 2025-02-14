package com.shankar.runner;

import com.shankar.model.HondaBike;
import com.shankar.service.HondaBikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestRunner  implements CommandLineRunner {
    @Autowired
    private HondaBikeService service;
    @Override
    public void run(String... args) throws Exception {
/*String msg=service.savetheBike(new HondaBike("Glamour Pro","110cc","Nalgonda"));
System.out.println(msg);*/
     /*  service.getallBikes().forEach(System.out::print);
        System.out.println("------------------------------");*/
        String msg=service.getById(102);
        System.out.println(msg);
        System.out.println("-------Execution---------")

       List<HondaBike> list=service.getallBikes();
       list.forEach(System.out::print);
        System.out.println("------------------------------");
       list.forEach(b->{
           System.out.println(b);
       });
System.out.println("------------------------------");
for (HondaBike bike:list){
    System.out.println(bike);

}
    }
}
