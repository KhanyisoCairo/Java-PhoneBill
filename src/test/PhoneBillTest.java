package test;

import org.junit.Test;
import phoneBill.DataBundle;
import phoneBill.PhoneBill;
import phoneBill.PhoneCall;
import phoneBill.SmsBundle;

import static org.junit.Assert.assertEquals;

public class PhoneBillTest {
    @Test
   public void numberOfCallMade(){
        PhoneBill phoneBill = new PhoneBill();
        PhoneCall phoneCall = new PhoneCall(0.65);

        phoneBill.accept(phoneCall);
        phoneBill.accept(phoneCall);
        phoneBill.accept(phoneCall);

        assertEquals(phoneBill.total(),2.0,0);
    }
    @Test
    public void numberOfSmsMade(){
        PhoneBill phoneBill = new PhoneBill();
        SmsBundle smsBundle = new SmsBundle(3,0.67);

        phoneBill.accept(smsBundle);
        phoneBill.accept(smsBundle);
        phoneBill.accept(smsBundle);
        phoneBill.accept(smsBundle);

        assertEquals(phoneBill.total(),8,0);
    }
    @Test
    public void dataUsed(){
        PhoneBill phoneBill = new PhoneBill();
        DataBundle dataBundle = new DataBundle(800);

        phoneBill.accept(dataBundle);
        phoneBill.accept(dataBundle);
        phoneBill.accept(dataBundle);
        phoneBill.accept(dataBundle);

        assertEquals(phoneBill.total(),1100,0);
    }

    @Test
    public void numberOfCallsAndSmsMadeAndDataUsed(){
        PhoneBill phoneBill = new PhoneBill();
        PhoneCall phoneCall = new PhoneCall(0.75);
        SmsBundle smsBundle = new SmsBundle(2,0.35);
        DataBundle dataBundle = new DataBundle(600);

        phoneBill.accept(phoneCall);
        phoneBill.accept(phoneCall);
        phoneBill.accept(smsBundle);
        phoneBill.accept(smsBundle);
        phoneBill.accept(smsBundle);
        phoneBill.accept(dataBundle);
        phoneBill.accept(dataBundle);
        phoneBill.accept(dataBundle);

        assertEquals(phoneBill.total(),829,0);
    }
}
