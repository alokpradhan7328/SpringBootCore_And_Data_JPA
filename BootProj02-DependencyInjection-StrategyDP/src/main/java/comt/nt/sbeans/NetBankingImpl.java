package comt.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("netBank")
public class NetBankingImpl implements IPayment {
	
	public NetBankingImpl()
	{
		System.out.println("NetBankingImpl: 0-ParamaConstructor()");
	}

	@Override
	public String doPaymetn(int orderId, double amt) {
		return "NetBanking Payment Is Done For the orderId-->"+orderId+" Having Thr BillAmt 💲"+amt;
	}

}
