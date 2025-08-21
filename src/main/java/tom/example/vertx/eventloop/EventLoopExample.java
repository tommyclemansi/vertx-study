package tom.example.vertx.eventloop;

import io.vertx.core.*;
import io.vertx.core.json.JsonObject;
import lombok.extern.slf4j.Slf4j;
import tom.example.vertx.verticles.VerticleA;
import tom.example.vertx.verticles.VerticleB;
import tom.example.vertx.verticles.VerticleN;

import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Slf4j
public class EventLoopExample extends AbstractVerticle {

  public static void main(String[] args) {
    var vertx  = Vertx.vertx(new VertxOptions()
      .setMaxEventLoopExecuteTime(500)
      .setMaxEventLoopExecuteTimeUnit(TimeUnit.MILLISECONDS)); // Create a Vert.x instance (1 per application)
    vertx.deployVerticle(new EventLoopExample());
  }

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    log.info("MainVerticle started on thread: {}", Thread.currentThread().getName());
    // never block the event loop!!
    TimeUnit.SECONDS.sleep(5);
    startPromise.complete();
  }

}
