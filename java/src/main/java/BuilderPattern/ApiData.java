package BuilderPattern;

public class ApiData {
		private String rasse;
		private int alter;

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		private String name;

		public ApiData(ApiDataBuilder apiDataBuilder){
					this.rasse = apiDataBuilder.getRasse();
					this.alter = apiDataBuilder.getAlter();
					this.name = apiDataBuilder.getName();
		}

		public String getRasse() {
				return rasse;
		}

		public void setRasse(String rasse) {
				this.rasse = rasse;
		}

		public int getAlter() {
				return alter;
		}

		public void setAlter(int alter) {
				this.alter = alter;
		}
}
