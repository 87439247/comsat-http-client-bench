import co.paralleluniverse.fibers.SuspendExecution;
import joptsimple.OptionSet;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Main extends ClientBase<Invocation.Builder, Response, AutoCloseableFiberJerseyHttpClientRequestExecutor, FiberJerseyEnv> {

  @Override
  protected FiberJerseyEnv setupEnv(OptionSet options) {
    return new FiberJerseyEnv();
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException, SuspendExecution, IOException {
    new Main().run(args);
  }
}
