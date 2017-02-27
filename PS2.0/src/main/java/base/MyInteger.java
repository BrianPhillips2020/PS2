package base;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0)
			return true;
		else
			return false;

	}

	public boolean isOdd() {
		if (iValue % 2 != 0)
			return true;
		else
			return false;
	}

	public boolean isPrime() {
		for (int i = 2; i < iValue; i++) {
			if (iValue % i == 0)
				return false;
		}
		return true;

	}

	public static boolean isEven(int a) {
		if (a % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int a) {
		if (a % 2 != 0)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int a) {
		if (a == 1) {
			return false;
		} else {
			for (int i = 2; i < a; i++) {
				if (a % i == 0)
					return false;
			}
			return true;

		}
	}

	public static boolean isEven(MyInteger m) {
		if (m.getiValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger m) {
		if (m.getiValue() % 2 != 0)
			return true;
		else
			return false;
	}

	public static boolean isPrime(MyInteger m) {
		if (m.getiValue() == 1) {
			return false;
		} else {
			for (int i = 2; i < m.getiValue(); i++) {
				if (m.getiValue() % i == 0)
					return false;
			}
			return true;
		}
	}

	public  boolean equals(int a) {
		if (iValue == a) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(MyInteger m) {
		if (iValue == m.getiValue()) {
			return true;
		} else {
			return false;
		}
	}

}
