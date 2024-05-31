package miu.edu.cse;

import miu.edu.cse.model.Contact;
import miu.edu.cse.model.EmailAddress;
import miu.edu.cse.model.PhoneNumber;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // create Email Address
        EmailAddress emailAddress1 = new EmailAddress(
                "dave.sang@gmail.com", "Home", 1L
        );
        EmailAddress emailAddress2 = new EmailAddress(
                "dsanger@argos.com", "Work", 2L
        );

        PhoneNumber phoneNumber1 = new PhoneNumber("240-133-0011", "Home", 1L);
        PhoneNumber phoneNumber2 = new PhoneNumber("240-112-0123", "Mobile", 2L);

        Contact newContact1 = new Contact(1L,"David", "Sanger", "Argos LLC", "Sales Manager");
        newContact1.addEmailAddress(emailAddress1);
        newContact1.addEmailAddress(emailAddress2);
        newContact1.addPhoneNumber(phoneNumber1);
        newContact1.addPhoneNumber(phoneNumber2);

        Contact newContact2 = new Contact(2L,"Carlos", "Jimenez", "Zappos", "Director");

        EmailAddress emailAddress3 = new EmailAddress(
                "ali@bmi.com", "Work", 3L
        );

        PhoneNumber phoneNumber3 = new PhoneNumber("412-116-9988", "Work", 3L);
        Contact newContact3 = new Contact(3L,"Ali", "Gafar", "BMI Services", "HR Manager");
        newContact3.addEmailAddress(emailAddress3);
        newContact3.addPhoneNumber(phoneNumber3);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(newContact1);
        contacts.add(newContact2);
        contacts.add(newContact3);
        printAllContacts(contacts);



    }

    public static void printAllContacts(List<Contact> contacts) {
        List<Contact> sortedContact = contacts.stream()
                .sorted(Comparator.comparing(Contact::getLastName))
                .collect(Collectors.toList());

        String jsonResult = sortedContact.stream()
                .map(contact -> contactToJson(contact))
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(jsonResult);
    }



    private static String contactToJson(Contact contact) {
        StringBuilder json = new StringBuilder();
        json.append("\n{");
        json.append("\"contactId\":").append(contact.getContactId()).append(",");
        json.append("\"firstName\":\"").append(contact.getFirstName()).append("\",");
        json.append("\"lastName\":\"").append(contact.getLastName()).append("\",");
        json.append("\"company\":\"").append(contact.getCompany()).append("\",");
        json.append("\"jobTitle\":").append(contact.getJobTitle()).append(",");
        json.append("\"PhoneNumber\":").append(contact.getPhoneNumberList()).append(",");
        json.append("\"EmailAddress\":").append(contact.getEmailAddressList()).append(",");

        json.append("}");
        return json.toString() ;
    }
}