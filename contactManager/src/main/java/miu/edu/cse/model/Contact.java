package miu.edu.cse.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private Long contactId;
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumberList;
    private List<EmailAddress> emailAddressList;



    public Contact(Long contactId, String firstName, String lastName, String company, String jobTitle) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumberList = new ArrayList<>();
        this.emailAddressList = new ArrayList<>();
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        phoneNumberList.add(phoneNumber);
    }

    public void addEmailAddress(EmailAddress emailAddress) {
        emailAddressList.add(emailAddress);
    }

    public void removePhoneNumber(Long phoneId) {
        phoneNumberList.remove(phoneId);
    }

    public void removeEmailAddress(Long emailId) {
        emailAddressList.remove(emailId);
    }

    public String getFirstName() {
        return firstName;
    }

    public Long getContactId() {
        return contactId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public List<PhoneNumber> getPhoneNumberList() {
        return phoneNumberList;
    }

    public List<EmailAddress> getEmailAddressList() {
        return emailAddressList;
    }

}
