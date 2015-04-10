
public class RealModel implements Model{

	private String modelName;
	
	public RealModel(String modelName){
		this.modelName = modelName;
		loadFromDisk(modelName);
	}

	@Override
	public void show() {
		System.out.println("This is " + modelName);
		
	}
	
	private void loadFromDisk(String modelName){
		System.out.println("Loading " + modelName);
	}
	
	
}
