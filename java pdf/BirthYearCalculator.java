public class BirthYearCalculator {
    public static void main(String[] args) {
        int currentYear = 2073;
        int eligibilityAge = 21;
        int voteEligibleYear;

        // Calculate birth year based on eligibility to vote
        int birthYear = currentYear - eligibilityAge;

        // Check if the birth year is more than 2060
        if (birthYear > 2060) {
            voteEligibleYear = birthYear + eligibilityAge;
            int yearsBetween = voteEligibleYear - 2023;
            System.out.println("Years between eligible year and 2023: " + yearsBetween);
        } else {
            // Calculate the median of birth year and 2023
            int medianYear = (birthYear + 2023) / 2;
            System.out.println("Median year between birth year and 2023: " + medianYear);
        }
    }
}
