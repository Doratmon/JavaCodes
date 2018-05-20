
class Person
{
    private String name;
    private int age;
    public void setName(String name)
    {
        this.name = name;//this为调用该方法的对象的引用
    }
    /*
    public void setName(String name)
    {
        name = name;//该方法将形参name赋给形参name，因为name服从就近原则，不影响实例变量name
    }*/
    Person(String name)//构造器之间相互调用一般是少调多
    {
        this(name,0);
    }
    Person(String name,int age)
    {
        //this(name);//调用该构造器的对象调用构造器Person(String name)
        this.name = name;
        this.age = age;

    }
    public void show()
    {
        System.out.println(this.name + " " + this.age);
    }
    public void sayHello()
    {
        System.out.println("你好");
        show();//实际上为this.show();即调用该方法的对象
    }


}

public class ThisDemo {
    public static  void main(String[] args){
        Person p = new Person("Will");
        //p.setName("Will");
        p.show();
        p.sayHello();

    }
}

