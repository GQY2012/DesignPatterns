package composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
	void killVirus();
}

class ImageFile implements AbstractFile{

	private String name;
	
	public ImageFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("ImageFile.killVirus()"
				+ name);
	}
	
}

class VideoFile implements AbstractFile{

	private String name;
	
	public VideoFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("VideoFile.killVirus()"
				+ name);
	}
	
}

class Folder implements AbstractFile{

	private String name;
	private List<AbstractFile> list = new ArrayList<>();
	
	public Folder(String name) {
		this.name = name;
	}
	
	public void add(AbstractFile c) {
		list.add(c);
	}
	void remove(AbstractFile c) {
		list.remove(c);
	}
	AbstractFile getChild(int index) {
		return list.get(index);
	}

	@Override
	public void killVirus() {
		System.out.println("Folder.killVirus()"
				+ name);
		
		for(AbstractFile file:list) {
			file.killVirus();
		}
	}
	
}