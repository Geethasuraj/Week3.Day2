package week3.day2assignment;

public class ExecutionDesktop extends Desktop implements Hardware, Software{
	
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println(" Software Resources");
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println(" Hardware Resources");
	}

	@Override
	void desktopModel() {
		// TODO Auto-generated method stub
		System.out.println(" Desktop Mobile");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutionDesktop exeObj = new ExecutionDesktop();
		exeObj.desktopModel();
		exeObj.softwareResources();
		exeObj.hardwareResources();

	}

	

	

}
