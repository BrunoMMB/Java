/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dserializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author EDYA
 */
public class ADeserializeDemo {

    public static void main(String[] args) {
        AEmployee e = null;
        try (InputStream fileIn = new FileInputStream("src/files/employee.ser"); 
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
                e = (AEmployee) in.readObject();
            
        } catch (IOException i) {
            System.out.println("Employee class not found");
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.getName());
        System.out.println("Address: " + e.getAddress());
        System.out.println("SSN: " + e.getSSN());
        System.out.println("Number: " + e.getNumber());
    }
}
