package task04Streams.optionals;


import java.util.Optional;

public class UserService {
    public void printInsuranceName(User user) {
        Optional<User> optional = Optional.ofNullable(user);
        optional.map(User::getCar)
                .map(Car::getInsurance)
                .map(Insurance::getName)
                .ifPresent(System.out::println);
    }
}