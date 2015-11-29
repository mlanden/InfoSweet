import java.io.File;


public class Utilities {
	private String mainFolder;
	public Utilities(String name) {
		mainFolder = name;
	}
	public static void sortFiles(String folder){
		File foldr = new File(folder);
		File[] contents = foldr.listFiles();
		for(File point: contents){
			if(point.isDirectory()){
				System.out.println("Dir " + point.getAbsoluteFile());
			}else{
				System.out.println("fil " + point.getAbsoluteFile());
			}
		}
	}
}
