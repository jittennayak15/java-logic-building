//For this problem, a good beginner approach is Zeller's Congruence. It calculates the weekday mathematically 
//without using Java's date library.
/*0 → Sunday
1 → Monday
2 → Tuesday
3 → Wednesday
4 → Thursday
5 → Friday
6 → Saturday
  */
public class DayOfWeek {

    // Method to find the day of the week
    public static int findDay(int d, int m, int y) {

        // January and February are treated as months 13 and 14
        // of the previous year
        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }

        // Calculate century and year within the century
        int k = y % 100;
        int j = y / 100;

        // Zeller's Congruence formula
        int day = (d + (13 * (m + 1)) / 5 + k + k / 4
                + j / 4 + 5 * j) % 7;

        // Convert Zeller's result:
        // 0 = Saturday, 1 = Sunday, ..., 6 = Friday
        // Our required format:
        // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        return (day + 6) % 7;
    }

    public static void main(String[] args) {

        int d = 30;
        int m = 8;
        int y = 2010;

        // Call method and print the result
        System.out.println(findDay(d, m, y));
      
    }
}

// Concept: Zeller's Congruence
// January and February are treated as months 13 and 14
// Calculate the weekday mathematically
// Return: 0 = Sunday, 1 = Monday, ..., 6 = Saturday
