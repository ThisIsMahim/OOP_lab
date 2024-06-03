package Mahim_210303;

class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }
}
public class CallByReference {
    
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        System.out.println("Before calling method: obj.value = " + obj.value);

        changeValue(obj);

        System.out.println("After calling method: obj.value = " + obj.value);
    }

    public static void changeValue(MyClass obj) {
        obj.value = 20;
        System.out.println("Inside method: obj.value = " + obj.value);
    }
}

