
package com.subrat.predicate;

import java.util.Random;
import java.util.function.*;

public class CtoF {
void main() {
Supplier<Integer>otp=()->{
	Random r=new Random();
	return 1000+ r.nextInt(9000);
	};
System.out.println(otp.get());
}
}
