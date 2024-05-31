package miu.edu.cse.model;

public class EmailAddress {
    private Long emailId;
    private String label;
    private String email;

    public EmailAddress(String email, String label, Long emailId) {
        this.email = email;
        this.label = label;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "EmailAddress [emailId=" + emailId + ", label=" + label + ", email=" + email + "]";
    }
}
