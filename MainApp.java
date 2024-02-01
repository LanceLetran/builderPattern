public class MainApp {
    public static void main(String[] args) {
        userInformation user = new userInformation.UserBuilder()
                .firstName("Lance Alexander")
                .lastName("Letran")
                .age(22)
                .email("lance.letran@neu.edu.ph")
                .address("Taguig City")
                .phone("+689165964179")
                .build();

        System.out.println("Name: " + user.getLastName() + ", " + user.getFirstName()
                + "\nAge: " + user.getAge()
                + "\nEmail: " + user.getEmail()
                + "\nAddress: " + user.getAddress()
                + "\nPhone number: " + user.getPhone());
    }
}