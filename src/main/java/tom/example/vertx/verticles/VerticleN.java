package tom.example.vertx.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VerticleN extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    log.info("Verticle started {} on thread {} with config: {}", this.getClass().getName(), Thread.currentThread().getName(), config().encodePrettily());
    startPromise.complete();
  }

}
