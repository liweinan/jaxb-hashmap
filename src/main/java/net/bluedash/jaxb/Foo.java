package net.bluedash.jaxb;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Foo {

	@XmlJavaTypeAdapter(MyHashMapAdapter.class)
	HashMap hashmap;

	public Foo() {
		hashmap = new HashMap();
	}

	public HashMap getHashmap() {
		return hashmap;
	}

	public void setHashmap(HashMap hashmap) {
		this.hashmap = hashmap;
	}

}
