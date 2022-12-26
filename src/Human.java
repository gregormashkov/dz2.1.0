public class Human {
    private String name;
    private String city;
    private String position;
    private int age;


    String name1 = "Максим";
    String city1 = "Минск";
    String position1 = "бренд-менеджер";
    int age1 = 35;
    String name2 = "Аня";
    String city2 = "Москва";
    String position2 = "методист образовательных программ";
    int age2 = 29;
    String name3 = "Катя";
    String city3 = "Калининград";
    String position3 = "продакт-менеджер";
    int age3 = 28;
    String name4 = "Артём";
    String position4 = "директор по развитию бизнеса";
    int age4 = 35;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human() {
        this.name = name;
        this.city = city;
        this.position = position;
        this.age = age;

    }
}
