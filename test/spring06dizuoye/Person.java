package spring06dizuoye;

public class Person {
    public Person(){
        System.out.println("人在容器中诞生");
    }
    private Eat eat;

    public Eat getEat() {
        return eat;
    }

    public void setEat(Eat eat) {
        this.eat = eat;
    }
    public void eat() {
        System.out.println("人吃的方法  吃东西");
        eat.eat();
    }
}
