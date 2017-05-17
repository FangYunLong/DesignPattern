package cn.fyl.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*
 * 具体原型类（ConcretePrototype）：实现Serializable接口，实现深克隆方法，
 * 即对象复制，对象中的引用对象，成员变量同样复制一份。
 */
public class WeekLog implements Serializable {

	private static final long serialVersionUID = 1l;
	
	private Attachment attachment;
	
	private String name;
	private String date;
	private String content;
	public Attachment getAttachment() {
		return attachment;
	}
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	//深复制
	public WeekLog deepClone() throws IOException, ClassNotFoundException{
		//将对象写入流中
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		//将对象从流中取出
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (WeekLog)ois.readObject();
	}
	
}
