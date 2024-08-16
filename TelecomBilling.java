/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.babyfeeding;

/**
 *
 * @author Benjn
 */
public class TelecomBilling {
    public static void main(String[] args) {
        double airtimeLoaded = 10000;
        double callRatePerSecond = 200;
        int callDuration = 5 * 60; // 5 minutes

        double airtimeAfterTax = airtimeLoaded * 0.9; // 10% tax
        double callCost = callDuration * callRatePerSecond;

        double balance = airtimeAfterTax - callCost;
        System.out.println("Remaining balance: UGX " + balance);
    }
}
