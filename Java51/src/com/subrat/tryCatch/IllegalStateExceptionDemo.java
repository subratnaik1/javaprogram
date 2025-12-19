package com.subrat.tryCatch;

public class IllegalStateExceptionDemo {
void main() {
	IllegalStateExceptionDemo.throwIllegalException();
}
static void throwIllegalException() {
    try {
        throw new IllegalStateException("MyException");
    } catch (IllegalStateException objA) {
        System.out.println("Caught: " + objA);
    }
}
}
