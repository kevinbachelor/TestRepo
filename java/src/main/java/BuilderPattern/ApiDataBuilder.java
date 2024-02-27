package BuilderPattern;

public class ApiDataBuilder {
		private String rasse;
		private int alter;

		public ApiDataBuilder setName(String name) {
				this.name = name;
				return this;
		}

		private String name;

		public ApiDataBuilder setRasse(String rasse) {
				this.rasse = rasse;
				return this;
		}

		public ApiDataBuilder setAlter(int alter) {
				this.alter = alter;
				return this;
		}
		public String getRasse() {
				return rasse;
		}

		public int getAlter() {
				return alter;
		}
		public String getName() {
				return name;
		}

		public ApiData build(){
				return new ApiData(this);

		}


}
