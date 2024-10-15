package com.bptn.course.knowledge_check._03_week_exercises.thursday;

public class MyThread extends Thread{

    int limitToStop; //Attribute or instance variable

    // Create a constructor to initialize the above instance variable
    MyThread (int limitToStop){
        this.limitToStop = limitToStop;
    }

    // Override the run() method form the Thread Super/Parent class here.
    @Override
	public void run() {
		
        for (int i=0; i<=limitToStop; i++){

            //If statement to identify odd numbers and print them out.
        	if (i%2!=0){ 
                
                System.out.println(i);
            }
            
            try {
			 Thread.sleep(1000); /* The thread sleeps for 1000 milliseconds */
			} 
            catch (InterruptedException e) {
			 e.printStackTrace();
			}
        }
	
    }    

}
