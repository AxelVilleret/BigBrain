package fr.ensim.interop.introrest.model.openai;

public class Message {
    public String role;
    public String content;
    
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}