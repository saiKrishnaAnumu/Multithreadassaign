import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<Double> result = executor.submit(new MyCallable());
		System.out.println("submitted callable task");
		System.out.println(" CallableExample.result :"+result.get());
		System.out.println("finished  main");
	}

}

class MyCallable implements Callable<Double>{

	@Override
	public Double call() throws Exception {
	   
	    double number = 20;
	     double squareRoot = Math.sqrt(number);
	    
	    Thread.sleep(100);
 
		
		return squareRoot;
	}
	
}