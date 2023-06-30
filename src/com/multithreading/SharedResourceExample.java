package com.multithreading;

public class SharedResourceExample {
	private static int sharedResource = 0;

	public static void main(String[] args) {
		// Create multiple threads
		Thread[] threads = new Thread[5];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new ResourceAccessThread(), "Thread-" + (i + 1));
			threads[i].start();
		}

		// Wait for all threads to finish
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Print the final value of the shared resource
		System.out.println("Final value of shared resource: " + sharedResource);
	}

	static class ResourceAccessThread implements Runnable {
		@Override
		public void run() {
			// Access the shared resource
			for (int i = 0; i < 10000; i++) {
				incrementSharedResource();
				decrementSharedResource();
			}
		}

		private void incrementSharedResource() {
			synchronized (SharedResourceExample.class) {
				sharedResource++;
			}
		}

		private void decrementSharedResource() {
			synchronized (SharedResourceExample.class) {
				sharedResource--;
			}
		}
	}
}
