package comt.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("cardpayment")
public class CardPaymentImpl implements IPayment {
	
	public CardPaymentImpl()
	{
		System.out.println("CardPaymentImpl: 0-ParamaConstructor()");
	}

	@Override
	public String doPaymetn(int orderId, double amt) {
		return "CardPayment Payment Is Done For the orderId-->"+orderId+" Having Thr BillAmt 💲"+amt;
	}

}
