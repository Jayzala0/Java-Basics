package constractorPrazctice;

public class ReadData {
	
	String path;
	
	public ReadData(String path) {
		this.path=path;
	}
	
	public ReadData() {
		path = "D:\\Git Repo\\New Folder";
		
		System.out.println(path);
	}

	public void getDetails() {
		
		System.out.println(path);
		
	}

}
