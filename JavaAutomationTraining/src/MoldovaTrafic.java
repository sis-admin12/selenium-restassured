
public class MoldovaTrafic implements TraficInterface,EuropeInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TraficInterface a=new MoldovaTrafic();
		a.GoGreen();
		a.StopRed();
		a.FlashYellow();
		MoldovaTrafic b=new MoldovaTrafic();
		b.WalkBeach();
		b.Avion();//merge si asa hz de ce
		EuropeInterface c=new MoldovaTrafic();
		c.Tren();
	}

	@Override
	public void GoGreen() {
		// TODO Auto-generated method stub
		System.out.println("Gaz e Verde");
	}

	@Override
	public void StopRed() {
		// TODO Auto-generated method stub
		System.out.println("Stopt e Rosu");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Fii atent e Galben");
	}

	public void WalkBeach() {
		System.out.println("Treci zebra");
	}

	@Override
	public void Tren() {
		// TODO Auto-generated method stub
		System.out.println("So pronit trenul");
	}

	@Override
	public void Avion() {
		// TODO Auto-generated method stub
		System.out.println("A zburat avionul");
	}
}
