package lab5;

import java.util.Objects;

public class Participant {
    private final String participantName;
    private Registration[] registrationlist;
    private int n = 0;
    private int[] gpa = new int[5];


    public Participant(String participantName) {
        this.participantName = participantName;
        registrationlist = new Registration[n];
        n += 1;

    }


    public Registration[] getRegistrations() {
        return this.registrationlist;

    }

    public String getGPAReport() {
        String str = this.participantName + "'s GPA of {";
        if (this.registrationlist.length == 0) {
            return ("No GPA available yet for " + participantName);
        } else {

            for (int i = 0; i < registrationlist.length; i++) {
                if (this.registrationlist[i].getMarks() <= 49) {
                    this.gpa[i] = 0;
                } else if (this.registrationlist[i].getMarks() >= 50 && this.registrationlist[i].getMarks() < 60) {
                    this.gpa[i] = 5;
                } else if (this.registrationlist[i].getMarks() >= 60 && this.registrationlist[i].getMarks() < 70) {
                    this.gpa[i] = 6;
                } else if (this.registrationlist[i].getMarks() >= 70 && this.registrationlist[i].getMarks() < 80) {
                    this.gpa[i] = 7;
                } else if (this.registrationlist[i].getMarks() >= 80 && this.registrationlist[i].getMarks() < 90) {
                    this.gpa[i] = 8;
                } else if (this.registrationlist[i].getMarks() >= 90 && this.registrationlist[i].getMarks() <= 100) {
                    this.gpa[i] = 9;
                }

                str += this.gpa[i] + " (" + this.registrationlist[i].getGradeReport()[0] + "), ";
            }
            int sum = 0;
            for (int i = 0; i < registrationlist.length; i++) {
                sum += this.gpa[i];
            }

            double gpaTotal = (double) sum / registrationlist.length;
            double roundedNum = (int)(gpaTotal * 10.0 + 0.5);
            double roundedNum1 = roundedNum / 10.0;
            return str.substring(0,str.length() - 2) +"}: " + roundedNum1;
        }

    }
    public int marksOf(String s) {
        for (Registration registration : registrationlist) {
            if (Objects.equals(registration.getTitle(), s)) {
                return registration.getMarks();
            }
        }

        return -1;

    }

    public void addRegistration(Registration registrationToAdd) {
        Registration[] registration;
        registration = new Registration[n];
        if (n < 5){
            n += 1 ;
        }

        if (this.registrationlist.length > 0){
            for (int i = 0; i < this.registrationlist.length; i++) {
                registration[i] = this.registrationlist[i];
            }

        }
        if (this.registrationlist.length < 5){
            registration[this.registrationlist.length] = registrationToAdd;
        }

        this.registrationlist = registration;

    }




    public void addRegistration(String newRegister) {
        Registration[] registration;
        registration = new Registration[n];
        if (n < 5){
            n +=1;
        }

        if (this.registrationlist.length > 0){
            for (int i = 0; i < this.registrationlist.length; i++) {
                registration[i] = this.registrationlist[i];
            }

        }
        if (this.registrationlist.length < 5){
            registration[this.registrationlist.length] = new Registration(newRegister);

        }

        this.registrationlist = registration;

    }


    public void updateMarks(String newRegister, int updMarks) {
        for (Registration registration : registrationlist) {
            if (registration.getTitle().equals(newRegister)) {
                registration.setMarks(updMarks);
            }

        }
    }

    public void clearRegistrations() {
        this.registrationlist = new Registration[0];
        n = 1;
    }
}
