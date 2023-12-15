package WeekThree;

import javax.swing.*;

public class HotelOccupancy {
    public static void main(String[] args) {
        int totalRooms = 0;
        double occupancyrate = 0;
        int occupiedrooms = 0;
        int totaloccupancy = 0;
        int room = 0;
        int totalvacancy = 0;
        int floors = Integer.parseInt(JOptionPane.showInputDialog(null, "How many floors?"));
      for(int i = 1 ; i<= floors;i++)
      {
          room = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("How many rooms are on floor %d",i)));
           occupiedrooms = Integer.parseInt((JOptionPane.showInputDialog(null, String.format("How many rooms are occupied %d",i))));
          //totalRooms += room;
          totalRooms = totalRooms + room;
          totaloccupancy = totaloccupancy + occupiedrooms;
          totalvacancy = totalvacancy - occupiedrooms;
      }
      occupancyrate = (double) totaloccupancy / totalRooms;
      JOptionPane.showMessageDialog(null,String.format("Floors:%d%nRooms:%d%nOccupied Rooms:%d%nVacantRooms:%d%nOccupancy: %.2f%%",floors,room,occupiedrooms,totalvacancy));
    }
}
