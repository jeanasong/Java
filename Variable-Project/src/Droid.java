/* 
 Build A Droid
 
We’ve set up a robot workshop to build some droids. 
All that’s missing are the instructions on how to create the robots and what they’ll do.

Can we write a Java class to help?

We’ll need to define the state and behavior of the droids using instance fields and methods. Let’s get to work 
  */

public class Droid{
	
	// Declare an instance field called batteryLevel. We want to store whole number values in this field

     int batteryLevel;
     String name;

   public String toString(){
     return "Hello, I'm the droid: " + name;
  }

   public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
   } 

   public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
   }
   
   // Create a energyReport() method that prints the instance’s batteryLevel.
   public void energyReport() {
	    System.out.println(batteryLevel);
	  }
   
   	//Create a method energyTransfer() that exchanges batteryLevel between instances.
	public void energyTransfer(int newBatteryLevel) {
	    this.batteryLevel = newBatteryLevel;
	}

   public static void main(String[] args){

    Droid Codey = new Droid("Codey");
    System.out.println(Codey);
    
    Droid Joe = new Droid("Joe");
    System.out.println(Joe);

    Codey.performTask("Programming");
    Joe.performTask("levitating");
    
    Codey.performTask("Programming");
    Joe.performTask("Blockchain");

    Droid Chelsea = new Droid("Chelsea");
    //Create another instance.
    Chelsea.energyReport();
    System.out.println(Chelsea);

    Codey.energyTransfer(Joe.batteryLevel);
     }
 }