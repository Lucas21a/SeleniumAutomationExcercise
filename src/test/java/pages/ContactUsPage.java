package pages;

import java.io.File;

public class ContactUsPage extends BasePage {

    private String getInTouchLabel = "//h2[contains(text(),'Get In Touch')]";
    private String nameInput = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[1]/input[1]";
    private String emailInput = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[2]/input[1]";
    private String subjectInput = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[3]/input[1]";
    private String messageInput = "//textarea[@id='message']";
    private String uploadInput = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[5]/input[1]";
    private String submitButton = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[6]/input[1]";
    private String successLabel = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[2]";
    private String homeButton = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/a[1]";

    public ContactUsPage() {
        super(driver);
    }

    public void writeNameInput(String name) {
        write(nameInput, name);
    }

    public void writeEmailInput(String email) {
        write(emailInput, email);
    }

    public void writeSubjectInput(String subject) {
        write(subjectInput, subject);
    }

    public void writeMessageInput(String message) {
        write(messageInput, message);
    }

    public void completeForm(String name, String email, String subject, String message) {
        writeNameInput(name);
        writeEmailInput(email);
        writeSubjectInput(subject);
        writeMessageInput(message);
    }

    public void clickSubmit() {
        clickElement(submitButton);
    }

    public void clickHomeButton() {
        clickElement(homeButton);
    }

    public boolean statusGetInTouch() {
        return elementIsDisplayed(getInTouchLabel);
    }

    public void uploadFileInput(String path) {
        String direccion = uploadFile(path);
        write(uploadInput, direccion);
    }

    public boolean statusSuccessLabel() {
        return elementIsDisplayed(successLabel);
    }

}
