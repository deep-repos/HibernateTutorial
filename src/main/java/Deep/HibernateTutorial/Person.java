package Deep.HibernateTutorial;

import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	public short getShortVar() {
		return shortVar;
	}
	public void setShortVar(short shortVar) {
		this.shortVar = shortVar;
	}
	public byte getByteVar() {
		return byteVar;
	}
	public void setByteVar(byte byteVar) {
		this.byteVar = byteVar;
	}
	public boolean isBoolVar() {
		return boolVar;
	}
	public void setBoolVar(boolean boolVar) {
		this.boolVar = boolVar;
	}
	public char getCharVar() {
		return charVar;
	}
	public void setCharVar(char charVar) {
		this.charVar = charVar;
	}
	public int getIntVar() {
		return intVar;
	}
	public void setIntVar(int intVar) {
		this.intVar = intVar;
	}
	public long getLongVar() {
		return longVar;
	}
	public void setLongVar(long longVar) {
		this.longVar = longVar;
	}
	public double getDoubleVar() {
		return doubleVar;
	}
	public void setDoubleVar(double doubleVar) {
		this.doubleVar = doubleVar;
	}
	public float getFloatVar() {
		return floatVar;
	}
	public void setFloatVar(float floatVar) {
		this.floatVar = floatVar;
	}
	public String getStrVar() {
		return strVar;
	}
	public void setStrVar(String strVar) {
		this.strVar = strVar;
	}
	public byte[] getBytes() {
		return bytes;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	public HashSet<Integer> getHs() {
		return hs;
	}
	public void setHs(HashSet<Integer> hs) {
		this.hs = hs;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	@Id
	private int id;

	private short shortVar;
	private byte byteVar;
	private boolean boolVar;
	private char charVar;
	private int intVar;
	private long longVar;
	private double doubleVar;
	private float floatVar;
	private String strVar;
	private byte[] bytes;
	private HashSet<Integer> hs;
	
}
