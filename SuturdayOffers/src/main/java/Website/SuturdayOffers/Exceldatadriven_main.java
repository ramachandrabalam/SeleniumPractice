package Website.SuturdayOffers;

import java.io.IOException;
import java.util.ArrayList;

public class Exceldatadriven_main {

		public static void main(String[] args) throws IOException {
			DataExcel d = new DataExcel();
			ArrayList data=d.getExcel("Purchase");
			System.out.println(data.get(0));
			System.out.println(data.get(1));
			System.out.println(data.get(2));
			System.out.println(data.get(3));
			System.out.println(data.get(4));
		}

	}

