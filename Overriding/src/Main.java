
public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] basekredimanager=new BaseKrediManager[] {new OgretmenKrediManager(), new OgrenciKrediManager(), new TarimKrediManager()};
		for(BaseKrediManager basekredi:basekredimanager) {
			System.out.println(basekredi.hesapla(10000));
		}
}
}
