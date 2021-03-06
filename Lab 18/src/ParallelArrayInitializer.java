import java.util.Random;
import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;



public class ParallelArrayInitializer {

	public static void main(String[] args) {

		final int N = 5000000;



		// Create a list

		double[] list = new double[N];



		long startTime = System.currentTimeMillis();

		for (int i = 0; i < list.length; i++)

			list[i] = Math.random() * 100000;

		long endTime = System.currentTimeMillis();

		System.out.println("Sequential time is " + (endTime - startTime));



		startTime = System.currentTimeMillis();

		int numberOfThreads = 8;

		double max = parallelAssignValues(numberOfThreads, list);

		endTime = System.currentTimeMillis();

		System.out.println(

				"Time with " + Runtime.getRuntime().availableProcessors() + " processors: " + (endTime - startTime));

		System.out.println(" The parallel version also computes max");



	}



	public static double parallelAssignValues(int numberOfThreads, double[] list) {

		// Create a fixed thread pool with the specified number of threads

		ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);



		// Submit runnable tasks to the executor

		int numberOfElementsInEachThread = list.length / numberOfThreads;



		Task[] tasks = new Task[numberOfThreads];



		int i = 0;

		for (; i < numberOfThreads - 1; i++) {

			tasks[i] = new Task(i * numberOfElementsInEachThread, (i + 1) * numberOfElementsInEachThread, list);

			executor.execute(tasks[i]);

		}

		tasks[i] = new Task(i * numberOfElementsInEachThread, list.length, list);

		executor.execute(tasks[i]);



		// Shut down the executor

		executor.shutdown();



		// Wait until all tasks are finished

		while (!executor.isTerminated()) {

			try {

				Thread.sleep(1);

			} catch (InterruptedException ex) {

				ex.printStackTrace();

			}

		}



		double result = list[0];//tasks[0].getMax();



		//for (int k = 1; k < tasks.length; k++)

		//            if (result < tasks[k].getMax())

		//                            result = tasks[k].getMax();



		return result;

	}

	static class Task implements Runnable {

		int i;
		int length;
		double[] list;
		
		public void run() {
			Random random = new Random();
			for(; i < length; i++)
			{
				list[i] = random.nextDouble();
			}
		}

		public Task(int i, int length, double[] list)
		{
			this.i = i;
			this.length = length;
			this.list = list;
		}
	}

}