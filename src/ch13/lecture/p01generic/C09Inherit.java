package ch13.lecture.p01generic;

public class C09Inherit {

}


// 제네릭 타입 상속
class Super09<T> {}
class Sub09<T> extends Super09<T> {}

class Super10<T, U> {}
class Sub<T, U> extends Super10<T, U>{}

class Super11<T> {}
class Sub11 extends Super11<String> {}

class Super12<T, U> {}
class SUb12<T> extends Super12<T, String> {}

class Super13<T> {}
class Sub13<T, U> extends Super13<T> {}

class Super14<T extends Number> {}
class Sub14<T extends Integer> extends Super14<T> {}