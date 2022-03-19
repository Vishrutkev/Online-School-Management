package lab5;

public class OnlineSchool {

    private int n = 0;
    private Participant[] school;

    public OnlineSchool() {
        this.school = new Participant[n];
        n += 1;

    }

    private Participant[] participantadd(Participant[] participantlist, int size, Participant participants){
        Participant[] participantList;

        if (size < 100) {
            size += 1;
        }
        participantList = new Participant[size];


     if (participantList.length < 100) {
         participantList[participantlist.length] = participants;

     }

        for (int x = 0; x < participantlist.length; x++) {
            participantList[x] = participantlist[x];
        }

        return participantList;

    }


    public Participant[] getParticipants(String course) {
        int n1 = 0;
        Participant[] listOfParticipants = new Participant[0];
        for (Participant participant : this.school) {
            for (int j = 0; j < participant.getRegistrations().length; j++) {
                if (participant.getRegistrations()[j].getTitle().equals(course)) {
                    listOfParticipants = participantadd(listOfParticipants, n1++, participant);
                    n++;
                }
            }
        }
        return listOfParticipants;
    }


    public void addParticipant(Participant participantadd) {
        Participant[] participantlist;
        if (n < 100){
            participantlist = new Participant[n];
            n += 1;
        } else {
            participantlist = new Participant[n];
        }

        if (school.length > 0) {
            for (int i = 0; i < school.length; i++) {
                participantlist[i] = school[i];
            }
        }

        if (school.length < 100) {
            participantlist[school.length] = participantadd;
        }
        school = participantlist;
    }
}

