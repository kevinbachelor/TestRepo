package BuilderPattern;

import BuilderPattern.ApiData;
import BuilderPattern.ApiDataBuilder;

public class Main {



		public static void main(String[] args) {

				ApiData apidata = new ApiDataBuilder().setAlter(14).setRasse("Sheppert").build();
				System.out.println(apidata.getAlter());

				ApiData apidata1 = new ApiDataBuilder().setAlter(14).setRasse("Sheppert").setName("timmi").build();
				System.out.println(apidata1.getName());
		}
}