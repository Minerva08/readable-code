package cleancode.studycafe.tobe;

import cleancode.studycafe.tobe.io.provider.LockerPassFileReader;
import cleancode.studycafe.tobe.io.provider.SeatPassFileReader;
import cleancode.studycafe.tobe.provider.LockerPassProvider;
import cleancode.studycafe.tobe.provider.SeatPassProvider;

public class StudyCafeApplication {

    public static void main(String[] args) {

        SeatPassFileReader seatPassFileReader = new SeatPassFileReader();
        LockerPassFileReader lockerPassFileReader = new LockerPassFileReader();

        StudyCafePassMachine studyCafePassMachine = new StudyCafePassMachine(seatPassFileReader, lockerPassFileReader);
        studyCafePassMachine.run();
    }

}
