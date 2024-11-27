package com.example.simulador_restaurante.factory;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.dsl.components.FollowComponent;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;
import com.almasb.fxgl.physics.PhysicsComponent;
import com.almasb.fxgl.physics.box2d.dynamics.BodyType;
import com.example.simulador_restaurante.factory.types.Type;

public class Factory implements EntityFactory {

    // Creación de la entidad Comensal
    @Spawns("Comensal")
    public Entity newComensal(SpawnData data){

        // Propiedad que nos ayuda a que un comensal siga a otro
        FollowComponent followComponent = new FollowComponent();
        followComponent.setSpeed(1);

        return FXGL.entityBuilder(data)
                .type(Type.COMENSAL)
                .view("comensal.png")
                .with(followComponent)
                .buildAndAttach();
    }

    @Spawns("Waiter")
    public Entity newWaiter(SpawnData data){
        FollowComponent followComponent = new FollowComponent();
        followComponent.setSpeed(1);
        return FXGL.entityBuilder(data)
                .type(Type.WAITER)
                .view("waiter.png")
                .with(followComponent)
                .buildAndAttach();
    }

    @Spawns("Chef")
    public Entity newChef(SpawnData data) {
     FollowComponent followComponent = new FollowComponent();
     followComponent.setSpeed(1);
     return FXGL.entityBuilder(data)
             .type(Type.CHEF)
             .view("Chef.png")
             .with(followComponent)
             .buildAndAttach();
    }


    @Spawns("Tables")
    public Entity newTables(SpawnData data) {
        return FXGL.entityBuilder(data)
                .type(Type.TABLES)
                .view("Table.png")
                .buildAndAttach();
    }

    @Spawns("Order")
    public Entity newOrder(SpawnData data) {
        PhysicsComponent physics = new PhysicsComponent();
        physics.setBodyType(BodyType.KINEMATIC);
        return FXGL.entityBuilder(data)
                .type(Type.ORDER)
                .view("order.png")
                .with(physics)
                .buildAndAttach();
    }

}