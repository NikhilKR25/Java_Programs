package objects;

import java.util.Random;

public class ObjectOTP
{
	// send otp method
	void sendOTP()
    {
    	Random random = new Random();
    	// generate OTP using random class
        int otp = 1000 + random.nextInt(9000);
        System.out.println(otp+"\n OTP sent successfully.");
    }

    public static void main(String[] args)
    {
        //By Using New Keyword Creating and using anonymous object
        new ObjectOTP().sendOTP();
    }
}
