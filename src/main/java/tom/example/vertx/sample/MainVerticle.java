package tom.example.vertx.sample;

import io.vertx.core.Future;
import io.vertx.core.VerticleBase;
import io.vertx.core.Vertx;

public class MainVerticle extends VerticleBase {

  public static void main(String[] args) {
    var vertx  = Vertx.vertx(); // Create a Vert.x instance (1 per application)
    vertx.deployVerticle(new MainVerticle());
  }

  @Override
  public Future<?> start() {
    return vertx.createHttpServer().requestHandler(req -> {
      req.response()
        .putHeader("content-type", "text/plain")
        .end("Hello from Vert.x!");
    }).listen(8888).onSuccess(http -> {
      System.out.println("HTTP server started on port 8888");
    });
  }


  // 1 verticle = 1 Thread
  // verticles are run on a non blocking event loop
}
