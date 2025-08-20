package tom.example.vertx.verticles;

import io.vertx.core.*;
import io.vertx.core.json.JsonObject;

import java.util.UUID;

public class MainVerticle extends AbstractVerticle {

  public static void main(String[] args) {
    var vertx  = Vertx.vertx(); // Create a Vert.x instance (1 per application)
    vertx.deployVerticle(new MainVerticle());
  }

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    log.info("MainVerticle started on thread: {}", Thread.currentThread().getName());
    vertx.deployVerticle(new VerticleA()); // Deploy child VerticleA
    vertx.deployVerticle(new VerticleB()); // Deploy child VerticleB
    vertx.deployVerticle(VerticleN.class.getName(),
      new DeploymentOptions().setInstances(20)
        .setConfig(new JsonObject()
          .put("id", UUID.randomUUID().toString())
          .put("name",VerticleN.class.getName()))); // Deploy child VerticleB
    startPromise.complete();
  }

}
