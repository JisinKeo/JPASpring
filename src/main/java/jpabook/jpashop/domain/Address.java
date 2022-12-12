package jpabook.jpashop.domain;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Embeddable;
@Embeddable
@Getter // Entity에서 유지보수 이유로 setter를 가급적 사용하지 말자
public class Address {
    private String city;
    private String street;
    private String zipcode;
    protected Address() {
    }
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
