package org.example;

public class human {

    private String name;
    private int age;
    private String job;
    private Phone phone;
    private Address address;

    public human(String name, int age, String job, String phoneNumber, String city, String street, String zipcode) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.phone = new Phone(phoneNumber);
        this.address = new Address(city, street, zipcode);
    }

    public Phone getPhone() {
        return phone;
    }

    public human searchPhoneName(Phone phone, String searched) {
        return phone.getFriend(searched).orElseThrow(() -> new RuntimeException("Phone not found"));
    }

    public void calling(human friend) throws InterruptedException {
        System.out.println("이름 : " + friend.name);
        System.out.println("나이 : " + friend.age);
        System.out.println("직업 : " + friend.job);
        System.out.println("주소 : " + friend.address.getCity() + " " + friend.address.getStreet() + " " + friend.address.getZipcode());
        System.out.println("통화거는 중...");
        Thread.sleep(3000);
        System.out.println("통화 종료!");
    }
}
