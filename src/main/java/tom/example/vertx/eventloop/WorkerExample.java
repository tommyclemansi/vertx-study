package tom.example.vertx.eventloop;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Slf4j
public class WorkerExample extends AbstractVerticle {

//  public static void main(String[] args) {
//    var vertx  = Vertx.vertx(new VertxOptions()
//      .setMaxEventLoopExecuteTime(500)
//      .setMaxEventLoopExecuteTimeUnit(TimeUnit.MILLISECONDS)); // Create a Vert.x instance (1 per application)
//    vertx.deployVerticle(new WorkerExample());
//  }
//
//  @Override
//  public void start(Promise<Void> startPromise) throws Exception {
//    log.info("MainVerticle started on thread: {}", Thread.currentThread().getName());
//    // never block the event loop!!
//    Future<Void> f = vertx.executeBlocking(
//      // this is called on worker thread
//      future -> {
//        try {
//          // Simulate a blocking operation
//          TimeUnit.SECONDS.sleep(5);
//          future.complete();
//        } catch (InterruptedException e) {
//          future.fail(e);
//        }
//        return future;
//      });
//
//    ,
//      // this is called on event loop thread
//      res -> {
//        if (res.succeeded()) {
//          log.info("Blocking operation completed successfully");
//        } else {
//          log.error("Blocking operation failed", res.cause());
//        }
//      });
//    startPromise.complete();
//  }

}
