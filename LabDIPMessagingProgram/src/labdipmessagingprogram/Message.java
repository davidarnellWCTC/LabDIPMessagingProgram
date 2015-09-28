package labdipmessagingprogram;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter Zarafield
 */
public class Message {
    
    private String stringMessage;
    private int intMessage;
    private double doubleMessage;
    
    // future data types
    // private double audio files
    // private double text file files
    // private double image files
    
    public Message (String msg){
        this.stringMessage = msg;
    }
    
    public  Message (int msg) {
        this.intMessage = msg;
    }
    
    public Message (double msg){
        this.doubleMessage = msg;
    }

    
    
    // Getters for the different types of message
    // Initial tests have no setters for the types of messages
    // This forces the programmer to use the constructor, creating a new
    // instance of the "message" class for each message created
    public String getStringMessage() {
        return stringMessage;
    }

    public int getIntMessage() {
        return intMessage;
    }

    public double getDoubleMessage() {
        return doubleMessage;
    }
    
    
    
}
