package ch13.exersice.exam02;

public class Container<T> {
	private T item;
	public void set(T i) {
		this.item = i;
	}
	
	public T get() {
		return item;
	}
}
