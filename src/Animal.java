//Создайте класс Animal и его класс-наследник Cat. В базовом классе задайте поле для имени, а в классе-наследнике сделайте метод drinkMilk(),
// который будет выводить в консоль строку “Кошка пьёт воду”. Создайте объект и задайте кошке имя, а затем вызовите метод drinkMilk().

public class Animal {
    String name;

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Kotenok";
        System.out.println(cat.name);
        cat.drinkMilk();
    }
}
class Cat extends Animal{
    void drinkMilk(){
        System.out.println("Кошка пьет воду");
    }
}
