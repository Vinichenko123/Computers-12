package com.george.module2.five;


public class Main {

    public static void main(String[] args) {
        Cipher shift1 = new Cipher(1);
        String encryptedMessageShiftOne = shift1.encrypt("move this message by 1");

        System.out.println(encryptedMessageShiftOne);
        String decryptedMessageShift1 = shift1.decrypt(encryptedMessageShiftOne);
        System.out.println(decryptedMessageShift1);

        Cipher shift3 = new Cipher(3);
        String encryptedMessageShiftThree = shift3.encrypt("move each letter by 3");

        System.out.println(encryptedMessageShiftThree);
        String decryptedMessageShiftThree = shift3.decrypt(encryptedMessageShiftThree);
        System.out.println(decryptedMessageShiftThree);

    }
}