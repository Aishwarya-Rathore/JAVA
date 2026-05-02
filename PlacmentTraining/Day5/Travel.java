import java.util.*;

class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }
}

public class Travel {

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr) {
        int max = 0;
        for (TravelAgencies t : arr) {
            if (t.getPrice() > max) {
                max = t.getPrice();
            }
        }
        return max;
    }

    public static TravelAgencies agencyDetailsforGivenIdAndType(TravelAgencies[] arr, int regNo, String packageType) {
        for (TravelAgencies t : arr) {
            if (t.getRegNo() == regNo &&
                t.getPackageType().equalsIgnoreCase(packageType) &&
                t.isFlightFacility()) {
                return t;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        TravelAgencies[] arr = new TravelAgencies[n];

        for (int i = 0; i < n; i++) {
            int regNo = sc.nextInt();
            sc.nextLine();
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt();
            boolean flightFacility = sc.nextBoolean();
            sc.nextLine();

            arr[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
        }

        int searchRegNo = sc.nextInt();
        sc.nextLine();
        String searchPackageType = sc.nextLine();

        int highestPrice = findAgencyWithHighestPackagePrice(arr);
        System.out.println(highestPrice);

        TravelAgencies result = agencyDetailsforGivenIdAndType(arr, searchRegNo, searchPackageType);

        if (result != null) {
            System.out.println(result.getAgencyName() + ":" + result.getPrice());
        }
    }
}