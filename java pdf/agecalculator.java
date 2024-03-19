public class agecalculator {
    public static void main(String[] args) {
        int personAge = 28;
        int youngerBrotherAge = 24;
        int olderBrotherAge = 56;

        // Calculate the age difference between the person and their younger brother
        int ageDifference = personAge - youngerBrotherAge;

        // Calculate the person's age when the older brother is 56
        int personAgeWhenOlderBrotherIs56 = olderBrotherAge - ageDifference;
        System.out.println("When the older brother is 56, the person's age is: " + personAgeWhenOlderBrotherIs56);

        // Calculate the younger brother's age when the older brother was 5
        int youngerBrotherAgeWhenOlderBrotherWas5 = 5 + ageDifference;
        System.out.println("When the older brother was 5, the younger brother's age was: " + youngerBrotherAgeWhenOlderBrotherWas5);
    }
}
