package miu.edu.cse.model;

public class PhoneNumber {
    private Long phoneId;
    private String label;
    private String number;

    public PhoneNumber(String number, String label, Long phoneId) {
        this.number = number;
        this.label = label;
        this.phoneId = phoneId;
    }

    @Override
    public String toString() {
        return "PhoneNumber [phoneId=" + phoneId + ", label=" + label + ", number=" + number + "]";
    }
}
