public class Director {
	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}
	public void construct() { // 문서 구축
		builder.makeTitle("Greeting"); // 타이틀
		builder.makeString("아침과 낮에"); // 문자열
		builder.makeItems(new String[] { // 개별항목
				"좋은 아침입니다.",
				"안녕하세요.",
		});
		builder.makeString("밤에"); // 별도의 문자열
		builder.makeItems(new String[] { // 별도의 개별 항목
				"안녕하세요.",
				"안녕히 주무세요.",
				"안녕히 계세요.",
		});
		builder.close(); // 문서를 완성시킨다.
	}
}
