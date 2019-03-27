package org.manjunath.objectconcepts;

public class SimpleHashCodeAndEqualsOverride {
	private byte sByte;
	private short sShort;
	private int sInt;
	private long sLong;
	
	private float sFloat;
	private double sDouble;
	
	private boolean sBoolean;

	private String sString;
	
	public SimpleHashCodeAndEqualsOverride() {}

	public byte getsByte() {
		return sByte;
	}

	public void setsByte(byte sByte) {
		this.sByte = sByte;
	}

	public short getsShort() {
		return sShort;
	}

	public void setsShort(short sShort) {
		this.sShort = sShort;
	}

	public int getsInt() {
		return sInt;
	}

	public void setsInt(int sInt) {
		this.sInt = sInt;
	}

	public long getsLong() {
		return sLong;
	}

	public void setsLong(long sLong) {
		this.sLong = sLong;
	}

	public float getsFloat() {
		return sFloat;
	}

	public void setsFloat(float sFloat) {
		this.sFloat = sFloat;
	}

	public double getsDouble() {
		return sDouble;
	}

	public void setsDouble(double sDouble) {
		this.sDouble = sDouble;
	}

	public boolean issBoolean() {
		return sBoolean;
	}

	public void setsBoolean(boolean sBoolean) {
		this.sBoolean = sBoolean;
	}

	public String getsString() {
		return sString;
	}

	public void setsString(String sString) {
		this.sString = sString;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int hashValue = 1;
		
		hashValue = prime * hashValue + this.getClass().getName().hashCode();
		
		//Boolean type variables hashValue
		hashValue = prime * hashValue + (sBoolean ? 1234 : 4321);
		
		//byte, short, int type variables hashValues
		hashValue = prime * hashValue + sByte;
		hashValue = prime * hashValue + sShort;
		hashValue = prime * hashValue + sInt;
		
		//long type variable hashValues
		hashValue = prime * hashValue + (int) (sLong ^ (sLong >>> 32));	
		
		//float type variable hashValue
		hashValue = prime * hashValue + Float.floatToIntBits(sFloat);
		
		//double type variables hashValue
		long temp;
		temp = Double.doubleToLongBits(sDouble);
		hashValue = prime * hashValue + (int)(temp ^ (temp >>> 32));
		
		//String object hashValue
		hashValue = prime * hashValue + (getsString() != null ? getsString().hashCode() : 0);
		return hashValue;
	}
	
	@Override
	public boolean equals(Object obj) {
		// compare with the current object reference
		if (this == obj)
			return true;

		// if object is null or getClass not matched then return false
		if ((obj == null) || (this.getClass() != obj.getClass()))
			return false;

		// type cast the obj reference and compare field by field
		// make sure to avoid NullPointerException
		SimpleHashCodeAndEqualsOverride other = (SimpleHashCodeAndEqualsOverride) obj;
		if (sBoolean != other.sBoolean)
			return false;
		if (sByte != other.sByte)
			return false;
		if (sShort != other.sShort)
			return false;
		if (sInt != other.sInt)
			return false;
		if (sLong != other.sLong)
			return false;
		
		if (Float.floatToIntBits(sFloat) != Float.floatToIntBits(other.sFloat))
			return false;

		if (Double.doubleToLongBits(sDouble) != Double.doubleToLongBits(other.sDouble))
			return false;

		if ((this.getsString() == null) ? other.getsString() != null 
				: !(this.getsString().equals(other.getsString())) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "SimpleHashCodeAndEqualsOverride [sByte=" + sByte + ", sShort=" + sShort + ", sInt=" + sInt + ", sLong="
				+ sLong + ", sFloat=" + sFloat + ", sDouble=" + sDouble + ", sBoolean=" + sBoolean + ", sString="
				+ sString + "]";
	}
}
