package com.subrat.TrielAndError;

import java.util.function.Supplier;

//here T get() method is hidden

record Player(int id) {

}

public class Supplier1 {
	void main() {
		Supplier<Player> s1 = () -> new Player(1);
		Player p=s1.get();
		IO.println(p);
	}
}
