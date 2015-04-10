
public class ProxyModel implements Model {

	private RealModel realModel;
	private String modelName;
	
	public ProxyModel(String modelName){
		this.modelName = modelName;
	}

	@Override
	public void show() {
		if(realModel == null){
			realModel = new RealModel(modelName);
		}
		realModel.show();
	}
	
	
}
