package comt.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPaymentImpl implements IPayment {
	
	public UPIPaymentImpl()
	{
		System.out.println("UPIPaymentImpl: 0-ParamaConstructor()");
	}

	@Override
	public String doPaymetn(int orderId, double amt) {
		return "UPi Payment Is Done For the orderId-->"+orderId+" Having Thr BillAmt 💲"+amt;
	}

}
