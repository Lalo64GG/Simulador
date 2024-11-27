package com.example.simulador_restaurante.controller;

import com.almasb.fxgl.dsl.FXGL;
import javafx.fxml.Initializable;
import javafx.util.Duration;

import java.util.ResourceBundle;

public class Controller implements Initializable {
   private final Restaurant restaurant = new Restaurant();

   @Override
    public void initialize(URL location, ResourceBundle resources){

       FXGL.getGameWorld().addEntityFactory(new  Factory());

       FXGL.spawn("Mesas", 100,200);
       FXGL.spawn("Cocina", 300,150);
       FXGL.spawn("Comerciales", 400,180);

       for(int i = 0 ; i < 10 ; i++){
           int index = 1;
           String name = generateUsername();
           double delay = 3 + Math.random() * 3;
           FXGL.getEngineTimer().runOnceAfter(() -> {
               Entity worker;
               if(index % 3 == 0){
                   worker = FXGL.spawn("Commercial", 50 + (index * 15), 250 - (index * 5));
                   Commercial commercial = new Commercial(name,restaurant,worker);
                   System.out.println(name + "comenzó a trabajar en comercial");
                   new Thread(commercial).start();
               } else if (index % 2 == 0){
                   worker = FXGL.spawn("Chef", 150 + (index * 10),220 - (index * 5));
                   Chef chef = new Chef(name,restaurant,worker);
                   System.out.println(name + "comenzo a cocinar");
                   new Thread(chef).start();
               } else {
                   worker = FXGL.spawn(("Waiter", 100 + (index * 10), 200 - (index * 5 ));
                   Waiter waiter = new Waiter(name,restaurant,worker);
                   System.out.println(name + "comenzo a atender mesas");
                   new Thread(waiter).start();
               }

           }, Duration.seconds(delay + i));
       }


   }
}
