public class Dog {
    String name;
    String breed;
    int age;
    String color;
    public Dog(String name,String breed,int age,String color){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.color=color;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
    @Override
    public String toString(){
        return ("Hello my name is :"+this.getName()+"breed,age and color is :"+this.breed+", "+this.age+", "+this.color);
    }
    public static void main(String[] args) {
        Dog tuffy=new Dog("tuffy", "pappilion", 5, "white");
        System.out.println(tuffy.toString());
    }
}
