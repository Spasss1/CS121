package dateFormatActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TotalCalories {

    public static int calculateTotalCalories(int caloriesPerDay, String startDate, String endDate) {
        try {
            // Parse the start and end dates
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date start = dateFormat.parse(startDate);
            Date end = dateFormat.parse(endDate);

            // Calculate the number of days on the diet
            long differenceInMilliseconds = Math.abs(end.getTime() - start.getTime());
            int daysOnDiet = (int) (differenceInMilliseconds / (24 * 60 * 60 * 1000));

            // Calculate and return the total calories consumed
            return caloriesPerDay * daysOnDiet;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
