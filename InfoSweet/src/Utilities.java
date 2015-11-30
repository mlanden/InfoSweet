import java.io.File;
import java.nio.file.Files;


public class Utilities {
	private String mainFolder;
	public Utilities(String name) {
		mainFolder = name;
	}
	public void sortFiles(String folder){
		if(folder.contains(mainFolder))
			return;
		File foldr = new File(folder);
		File[] contents = foldr.listFiles();
		if(contents == null)
			return;
		for(File point: contents){
			if(point.isDirectory()){
				sortFiles(point.getAbsolutePath());
			}else{
				String name = point.getName();
				if(name.contains("DEL")){
					int pos = name.indexOf("DEL");
					String base = name .substring(0, pos);
					String destfolder = mainFolder + "\\" + base;
					File destFolder = new File(destfolder);
					if(!destFolder.exists()){
						destFolder.mkdir();
					}
					File dest = new File(destfolder + "\\" + name);
					if(!dest.exists()){
						try{
							Files.copy(point.toPath(), dest.toPath());
						}catch(Exception e){
							
						}
					}
				}
			}
		}
	}
}
