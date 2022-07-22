import java.util.*;
class Apoorav_Testvagrant {
    int id;
    String description, concepts;
    String year;


    public Apoorav_Testvagrant() {}

    public Apoorav_Testvagrant(int id, String description, String year, String concepts)
    {
        this.id = id;
        this.description = description;
        this.year=year;
        this.concepts = concepts;
    }

    //Function to retrieve the question for a given year
    void retrieval(ArrayList<Apoorav_Testvagrant> arr, String GYear){

        for (Apoorav_Testvagrant apoorav_testvagrant : arr) {
            String e = apoorav_testvagrant.year;

            String[] arrOfStr = e.split(",");


            for (int j = 0; j <= arrOfStr.length - 1; j++) {

                if (GYear.equals(arrOfStr[j])) {

                    System.out.println("Id: "+apoorav_testvagrant.id+" Question: "+apoorav_testvagrant.description);
                }
            }
        }
    }
    //Function retrieves the concept having maximum questions in the question bank
    void PrintConceptMax(ArrayList<Apoorav_Testvagrant> arr)
    {
        int a =0;
        int temp=0;
        String k = null;
        int n = arr.size();
        for (Apoorav_Testvagrant apoorav_testvagrant : arr) {
            String f = apoorav_testvagrant.concepts;
            for (int j = 0; j < n - 1; j++) {
                if (f.equals(arr.get(j).concepts)) {
                    a = a + 1;
                    if (a > temp) {
                        temp = a;

                        k = arr.get(j).concepts;

                    }
                }
            }
        }
        System.out.println("Concept having maximum questions is:"+k);
    }

    // main function
    public static void main(String[] args)
    {
        ArrayList<Apoorav_Testvagrant> arr = new ArrayList<>();
        arr.add(new Apoorav_Testvagrant(1, "Which orientation of an electric dipole in a uniform electric field would correspond to stable equilibrium ?", "2018,2020","Electric Charges and Fields"));
        arr.add(new Apoorav_Testvagrant(2, "If the radius of the Gaussian surface enclosing a charge is halved, how does the electric flux through the Gaussian surface change ?", "2019,2021","Gaussian surface"));
        arr.add(new Apoorav_Testvagrant(3, "Define the term electric dipole moment of a dipole. State its S.I. unit", "2016,2020","Electric dipole"));
        arr.add(new Apoorav_Testvagrant(4, "In which orientation, a dipole placed in a uniform electric field is in unstable equilibrium ?", "2014,2018,2020","EElectric dipole"));
        arr.add(new Apoorav_Testvagrant(5, "Why should electrostatic field be zero inside a conductor?", "2012,2019","Electrostatic field"));
        arr.add(new Apoorav_Testvagrant(6, "Why must electrostatic field be normal to the surface at every point of a charged conductor?", "2012,2018,2021","Electrostatic field"));
        arr.add(new Apoorav_Testvagrant(7, "A charge ‘q’ is placed at the centre of a cube of side l. What is the electric flux passing through each face of the cube? (All India 2012)", "2015,2020","Electric flux"));
        arr.add(new Apoorav_Testvagrant(8, "Depict the direction of the magnetic field lines due to a circular current carrying loop.", "2012,2022","Magnetic field"));
        arr.add(new Apoorav_Testvagrant(9, "Why do the electric field lines not form closed loops?", "2013,2015,2020","Electrostatic field"));
        arr.add(new Apoorav_Testvagrant(10, "Is the electric field due to a charge configuration with total charge zero, necessarily zero?", "2019,2021","Electrostatic field"));
        System.out.println("enter the year");
        Scanner sc=new Scanner(System.in);
        String GYear=sc.nextLine();
        Apoorav_Testvagrant QBank = new Apoorav_Testvagrant();
        QBank.retrieval(arr,GYear);
        // Calling function
        QBank.PrintConceptMax(arr);
    }
}
