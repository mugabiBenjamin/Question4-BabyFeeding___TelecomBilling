/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.babyfeeding;

/**
 *
 * @author Benjn
 */
public class BabyFeeding {
    public static void main(String[] args) {
        double porridge = 2.0; // in liters
        double milk = 2.0; // in liters

        double porridgeConsumptionTime = (porridge * 2) * 45; // 45 minutes for each half cup
        double milkConsumptionTime = (milk * 2) * 30; // 30 minutes for each full cup

        double totalConsumptionTime = porridgeConsumptionTime + milkConsumptionTime;
        double totalHours = totalConsumptionTime / 60.0;

        System.out.println("Total time to finish both the porridge and milk: " + totalHours + " hours");
    }
}
