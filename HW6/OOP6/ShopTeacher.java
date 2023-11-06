
//  Наследуемый класс с заменой в родительский
public class ShopTeacher extends Teacher {

    protected ShopTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "ShopTeacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
