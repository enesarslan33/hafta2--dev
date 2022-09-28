
public class Main {

	public static void main(String[] args) {
//	OgretmenKrediManager ogretmenkredimanager= new OgretmenKrediManager();
//	TarimKrediManager tarimkredimanager=new TarimKrediManager();
//	tarimkredimanager.Hesapla();
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
	}

}
