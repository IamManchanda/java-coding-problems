/**
 * Problem: Calculate the income tax for the given income.
 * 
 * Income Tax Slabs:
 * 
 * - Old Regime:
 * - 0 - 2,50,000: No Tax
 * - 2,50,001 - 5,00,000: 5% of the income exceeding 2,50,000
 * - 5,00,001 - 10,00,000: 20% of the income exceeding 5,00,000
 * - 10,00,001 and above: 30% of the income exceeding 10,00,000
 * 
 * - New Regime:
 * - 0 - 3,00,000: No Tax
 * - 3,00,001 - 6,00,000: 5% of the income exceeding 3,00,000
 * - 6,00,001 - 9,00,000: 10% of the income exceeding 6,00,000
 * - 9,00,001 - 12,00,000: 15% of the income exceeding 9,00,000
 * - 12,00,001 - 15,00,000: 20% of the income exceeding 12,00,000
 * - 15,00,001 and above: 30% of the income exceeding 15,00,000
 */

public class Solution {
    public double calculateIncomeTax(float income, String regime) throws IllegalArgumentException {
        if (income < 0) {
            throw new IllegalArgumentException("Income cannot be negative.");
        }

        if (!regime.equalsIgnoreCase("Old") && !regime.equalsIgnoreCase("New")) {
            throw new IllegalArgumentException("Regime must be either \"Old\" or \"New\".");
        }

        // Old Regime
        if (regime.equalsIgnoreCase("Old")) {
            if (income <= 250000) {
                return 0;
            }

            if (income <= 500000) {
                return (income - 250000) * 0.05;
            }

            if (income <= 1000000) {
                return (income - 500000) * 0.2
                        + (500000 - 250000) * 0.05;
            }

            return (income - 1000000) * 0.3
                    + (1000000 - 500000) * 0.2
                    + (500000 - 250000) * 0.05;
        }

        // New Regime
        if (income <= 300000) {
            return 0;
        }

        if (income <= 600000) {
            return (income - 300000) * 0.05;
        }

        if (income <= 900000) {
            return (income - 600000) * 0.1
                    + (600000 - 300000) * 0.05;
        }

        if (income <= 1200000) {
            return (income - 900000) * 0.15
                    + (900000 - 600000) * 0.1
                    + (600000 - 300000) * 0.05;
        }

        if (income <= 1500000) {
            return (income - 1200000) * 0.2
                    + (1200000 - 900000) * 0.15
                    + (900000 - 600000) * 0.1
                    + (600000 - 300000) * 0.05;
        }

        return (income - 1500000) * 0.3
                + (1500000 - 1200000) * 0.2
                + (1200000 - 900000) * 0.15
                + (900000 - 600000) * 0.1
                + (600000 - 300000) * 0.05;
    }
}

/*
 * Enter the income:
 * 1567342
 * 
 * Enter the regime:
 * Old
 * 
 * Income tax: for income "Rs. 1567342" and regime "Old" is:
 * 282702.6
 */

/*
 * Enter the income:
 * 1567342
 * 
 * Enter the regime:
 * New
 * 
 * Income tax: for income "Rs. 1567342" and regime "New" is:
 * 170202.6
 */
