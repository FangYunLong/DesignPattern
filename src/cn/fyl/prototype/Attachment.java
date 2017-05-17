package cn.fyl.prototype;

import java.io.Serializable;

public class Attachment implements Serializable {
	
	private static final long serialVersionUID = 1l;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void download(){
		System.out.println("下载附件，文件名为："+name);
	}
	
}
