package com.bptn.course.self_and_instructor_led._03_week_practices;

public class CountdownTimer implements Runnable {

    private int startValue;

    public CountdownTimer(int startValue) {

        //Assign the startValue parameter to the instance variable
        this.startValue = startValue;   
    }
    
    @Override
    public void run() {
    
       //Complete the functionality of run() method. Complete Steps 2,3,4
       for (int i = startValue; i >= 1; i--){
        
        System.out.println(i);
        
        try {
        Thread.sleep(500); /* The thread sleeps for 500 milliseconds */
        } catch (InterruptedException e) {
			e.printStackTrace();
		}
       
       }
    }

    // Define the main function
    public static void main(String[] args) {
        
        //Create a new CountdownTimer object with a start value of your choice. For instance: 10
        CountdownTimer r1 = new CountdownTimer(10); // Initiate it with the value 10        

        //Create a new Thread object, passing the countdownTimer object as the Runnable target
        Thread t1 = new Thread(r1); // Initiate with the instance r1 created.

        //Start the thread by calling the start() method.
        t1.start();        
        System.out.println("Main thread continues to execute...");    
    }
}

