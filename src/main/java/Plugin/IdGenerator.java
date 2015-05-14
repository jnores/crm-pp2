package Plugin;

public interface IdGenerator {
	public long nextID();
	
	public static final IdGenerator INSTANCE = (IdGenerator) PluginFactory.getPlugin(IdGenerator.class);
}

