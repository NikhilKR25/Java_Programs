package oops_principle;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    }

interface MyWifi{
    // Display available WiFi networks
    void getNetworks();
}

class MyCellPhone{
    // Method to initiate a call
    void callNumber(int phoneNumber){
        System.out.println("Calling from "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera
{
    // Implementation of functionality
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Video recorded");
    }
    public void getNetworks(){
        System.out.println("Getting List of Networks");
 
    }
    public void sampleMethod(){
        System.out.println("sample of method");
    }
}
public class Polymorphism 
{
    public static void main(String[] args) {
        MyCamera cam1 = new MySmartPhone(); // This is a smartphone but, use it as a camera
        // cam1.sampleMethod(); --> Not allowed
        cam1.recordVideo();

        MySmartPhone s = new MySmartPhone();
        s.sampleMethod();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(79794448);
    }
}

//A a=new B();//up-casting  
